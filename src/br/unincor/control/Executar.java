package br.unincor.control;

import br.unincor.model.Vendedor;
import br.unincor.view.Usuario;

public class Executar {

	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		Vendedor v = new Vendedor("Vendedor", 28, "feminino", 410.00, "2388024", 0.0, 0);
		
		
		
		u.exibeMsg(v.toString());
		
	
	}

}
