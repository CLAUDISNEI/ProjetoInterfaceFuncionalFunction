package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Produto;

public class ProgramaInterfaceFuncionalFunction {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		
		//com expressao lambda inline
		//criando uma nova lista somente com os nomes
		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
		
	}

}
