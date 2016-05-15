package Model;

import java.sql.Time;

public class Mesa {

	private Setor setor;
	private int capacidade;
	private boolean limpa;
	private boolean ocupada;
	private Time reserva;
	private Pedido pedido;
	private double gorjetaLimpeza;
	
	public Setor getSetor(){
		return setor;
	}
	
	public int getCapacidade(){
		return this.capacidade;
	}
	public boolean isLimpa(){
		return limpa;
	}
	
	public boolean isOcupada(){
		return ocupada;
	}
	
	public void ocupa(){
		this.ocupada = true;
	}
	
	public void desocupa(){
		this.ocupada = false;
	}
	
	public void limpa(){
		
	}
	
	public void setReserva(Time horario){
		reserva = horario;
	}
	
	public Time getReserva(){
		return reserva;
	}
	
	public boolean isDisponivel(){
		return true;
	}
	public void setPedido(Pedido pedido){
		this.pedido = pedido;
	}
	public Pedido getPedido(){
		return this.pedido;
	}
	public void setGorjetaLimpeza(double valor){
		this.gorjetaLimpeza = valor;
	}
	public double getGorjetaLimpeza(){
		return gorjetaLimpeza;
	}
}
