package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service("corrente")
//@Component("corrente")
//@Qualifier("corrente")
public class Corrente extends Conta {

	private Float limite;

	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}

	public Corrente(Float limite) {
		super();
		this.limite = limite;
	}

	public Corrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Corrente [limite=" + limite + ", getId()=" + getId() + ", getNomeCorrentista()=" + getNomeCorrentista()
				+ "]";
	}

	
	
}
