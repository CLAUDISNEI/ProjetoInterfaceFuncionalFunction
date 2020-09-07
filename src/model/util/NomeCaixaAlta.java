package model.util;

import java.util.function.Function;

import model.entities.Produto;

public class NomeCaixaAlta implements Function<Produto, String>{

	@Override
	public String apply(Produto p) {
		return p.getNome().toUpperCase();
	}

}
