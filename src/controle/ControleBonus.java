package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controleBonus")
@RequestScoped
public class ControleBonus implements Serializable {
	private String nome;
	private Double salario;
	private Double bonus;
	private Integer cargo;

	public String getNome() {
		return nome;
	}

	public ControleBonus() {

	}

	public String dadosBonus() {
		return "dadosBonus?c=" + cargo + "&n=" + nome + "&s=" + salario + "&faces-redirect=true";
	}

	public String calcula() {
		switch (cargo) {
		case 0:
			bonus = salario * 15 / 100;
			break;
		case 1:
			bonus = salario * 10 / 100;
			break;
		case 2:
			bonus = salario * 10 / 100;
			break;
		}

		return "dadosBonus";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Integer getCargo() {
		return cargo;
	}

	public void setCargo(Integer cargo) {
		this.cargo = cargo;
	}

}
