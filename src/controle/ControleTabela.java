package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleTabela")
@SessionScoped
public class ControleTabela implements Serializable {

	List<Pessoa> lista;
	
	public ControleTabela() {
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa(1,"Samuel","(11) 98425-0625"));
		lista.add(new Pessoa(1,"João","(11) 98425-0626"));
		lista.add(new Pessoa(1,"Leticia","(11) 98425-0685"));
		lista.add(new Pessoa(1,"Nair","(11) 98425-3587"));
		lista.add(new Pessoa(1,"Ruth","(11) 98425-6421"));
		lista.add(new Pessoa(1,"Natercia","(11) 98425-1295"));
		lista.add(new Pessoa(1,"Pai","(11) 98425-6578"));
		lista.add(new Pessoa(1,"Vinicius","(11) 98564-0625"));
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
}
