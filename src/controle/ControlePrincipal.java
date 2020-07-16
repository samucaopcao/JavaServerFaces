package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {

	private String mensagem;

	public ControlePrincipal() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagem = "Bem Vindo! Sua Aplicação foi criada em: "
				+ sdf.format(Calendar.getInstance().getTime());
	}

	public String sobre() {
		mensagem = "Você navegou de maneira  dinamica";
		return "sobre";
	}

	public String sobreRedirecionado() {
		mensagem = "Você foi redirecionado para a página sobre.xhtml";
		return "sobre?faces-redirect=true";
	}
	
	public String geraErro() {
		return "erro";
	}
	
	public String geraLogin() {
		return "login";
	}
	
	public String geraErroGrave() {
		return "erro";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
