package modelo;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;

public class Usuario implements Serializable {
	@NotEmpty(message = "O nome deve ser informado")
	@Length(max = 40, min = 3, message = "O nome deve estar entre {min} e {max} caracteres")
	private String nome;
	@NotEmpty(message = "A senha deve ser informada")
	@Length(min = 6, max = 10, message = "A senha deve estar entre {min} e {max} caracteres")
	private String senha;
	@NotEmpty(message = "O nome deve ser informado")
	@CPF(message = "Informe um CPF válido")
	private String cpf;
	@NotNull(message = "A renda deve ser informada")
	@Digits(fraction = 2, integer = 10, message = "A renda deve ser "
			+ "informada com {integer} dígitos na parte inteira e {fraction} dígitos na parte fracionária")
	private Double renda;
	@NotEmpty(message = "O e-mail deve ser informado")
	@Email(message = "Informe um e-mail válido")
	private String email;
	@URL(protocol = "http", message = "Informe uma endereço válido")
	@NotEmpty(message = "A pagina pessoal deve ser informada")
	private String pagina;

	public Usuario() {
		this.nome = "";
		this.senha = "";
		this.cpf = "";
		this.renda = null;
		this.email = "";
		this.pagina = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
}
