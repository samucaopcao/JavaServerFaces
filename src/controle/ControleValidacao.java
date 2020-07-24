package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


@ManagedBean(name = "controleValidacao")
@SessionScoped
public class ControleValidacao implements Serializable {
	@NotEmpty(message = "O nome deve ser informado")
	@Length(max = 40, min = 3, message = "O nome deve estar entre {min} e {max} caracteres")
	private String nome;
	@NotEmpty(message = "O telefone deve ser informado")
	@Pattern(regexp = "\\(\\d{2}\\)\\d{5}\\-\\d{4}", message = "O formato do telefone deve ser (99)99999-9999")
	private String telefone;
	@NotEmpty(message = "O e-mail deve ser informado")
	@Email(message = "Informe um e-mail válido")
	private String email;
	@NotNull(message = "A idade deve ser informada")
	@Range(min = 18, max = 80, message = "A idade deve estar entre {min} e {max} anos")
	private Long idade;
	@NotNull(message = "A nota deve ser informada")
	@Range(min = 0, max = 10, message = "A nota deve estar entre {min} e {max} anos")
	private Double nota;

	public ControleValidacao() {

	}

	public String processaDados() {
		String saida = "";
		saida += "Nome: " + nome;
		saida += "Telefone: " + telefone;
		saida += "E-mail: : " + email;
		saida += "Idade: : " + idade;
		saida += "Nota: : " + nota;
		FacesMessage msg = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage("", msg);
		nome = "";
		telefone = "";
		email = "";
		idade = null;
		nota = null;
		return "formValidacao";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
}
