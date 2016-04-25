package Model;

import java.util.Map;


public class Receita {

	private String intrucoes;
	private Map<Ingrediente, Double> ingredientes;
	
	
	public String getIntrucoes() {
		return intrucoes;
	}
	public void setIntrucoes(String intrucoes) {
		this.intrucoes = intrucoes;
	}
	public Map<Ingrediente, Double> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Map<Ingrediente, Double> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}
