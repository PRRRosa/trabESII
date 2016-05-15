package Model;

import java.util.*;

public class Pedido {

	//private Mesa mesa;
	private List<ItemPedido> itens;
	private Estado estado;
	private Garçom garcom;
	
	public Pedido(List<ItemPedido> itens){
		this.itens = itens;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Garçom getGarcom() {
		return garcom;
	}

	public void setEstadoItem(List<ItemPedido> itens, Estado estado){
		
	}
	
	public double getPreco(){
		return ((ItemPedido) this.itens).getItem().getPreco();
	}

	public void addItens(Pedido pedido){
		
	}
	
	public void addItem(Item item){
		
	}
}
