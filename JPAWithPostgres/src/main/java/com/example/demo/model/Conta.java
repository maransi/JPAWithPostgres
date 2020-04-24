package com.example.demo.model;

import org.springframework.stereotype.Service;

//@Component
@Service
public class Conta {

	private Long id;
	private String nomeCorrentista;
	private Float saldo;
	private String nrConta;
	
	public String getNrConta() {
		return nrConta;
	}
	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
}
