package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "banco", name = "cuenta")
public class Cuenta {
	
	@Id
	private int id;
	
	@Column
	private double saldo;
	
	@ManyToOne()
	@JoinColumn(name = "dni", referencedColumnName = "dni")
	private Cliente cliente;
	
	@ManyToOne()
	@JoinColumn(name = "id_banco", referencedColumnName = "id")
	private Banco banco;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", cliente=" + cliente + ", banco=" + banco + "]";
	}
	
	
	
}
