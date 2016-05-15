package Model;

import java.util.Map;

public class Item {

	private double preco;
	private String categoria;
	private double custo;
	private double tempo;
	private Receita receita;
	
	public double getPreco(){
		return preco;
	}
	
	public Map<Ingrediente, Double> getIngredientes() {
		return receita.getIngredientes();
	}
}
