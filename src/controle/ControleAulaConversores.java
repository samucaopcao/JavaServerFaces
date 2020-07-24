package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import conversores.ConverterCidade;

@ManagedBean(name = "controleAulaConversores")
public class ControleAulaConversores implements Serializable {
	private Calendar nascimento;
	private Cidade cidade;
	private List<Cidade> ListaCidades = new ArrayList<Cidade>();
	private ConverterCidade converterCidade;

	public ControleAulaConversores() {
		nascimento = Calendar.getInstance();
		ListaCidades.add(new Cidade(1, "São Paulo", "SP"));
		ListaCidades.add(new Cidade(2, "Porto Alegre", "RS"));
		ListaCidades.add(new Cidade(3, "Passo Fundo", "RS"));
		converterCidade = new ConverterCidade(ListaCidades);
	}

	public String lerDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data valida!");
		if (nascimento != null && cidade != null) {
			msg = new FacesMessage("Nascimento: " + sdf.format(nascimento.getTime()) + " Cidade: " + cidade.getNome()
					+ " UF: " + cidade.getUf());
		}
		FacesContext.getCurrentInstance().addMessage("", msg);
		nascimento = null;
		return "formConversores";
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getListaCidades() {
		return ListaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		ListaCidades = listaCidades;
	}

	public ConverterCidade getConverterCidade() {
		return converterCidade;
	}

	public void setConverterCidade(ConverterCidade converterCidade) {
		this.converterCidade = converterCidade;
	}
}
