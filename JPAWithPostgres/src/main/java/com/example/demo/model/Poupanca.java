package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service("poupanca")
//@Component("poupanca")
//@Qualifier("poupanca")
public class Poupanca extends Conta{
	private int diaAniversario;
	
	private Float taxaRemuneracao;
	
	
	public int getDiaAniversario() {
		return diaAniversario;
	}


	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}


	public Float getTaxaRemuneracao() {
		return taxaRemuneracao;
	}


	public void setTaxaRemuneracao(Float taxaRemuneracao) {
		this.taxaRemuneracao = taxaRemuneracao;
	}


	public Poupanca() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param diaAniversario
	 * @param taxaRemuneracao
	 */
	public Poupanca(int diaAniversario, Float taxaRemuneracao) {
		super();
		this.diaAniversario = diaAniversario;
		this.taxaRemuneracao = taxaRemuneracao;
	}


	@Override
	public String toString() {
		return "\n Poupanca [diaAniversario=" + diaAniversario + ", taxaRemuneracao=" + taxaRemuneracao
				+ ", getDiaAniversario()=" + getDiaAniversario() + ", getTaxaRemuneracao()=" + getTaxaRemuneracao()
				+ "]";
	}

	
	
}
