package com.alan.main.atividades.atv02;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private double percVaga;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, char sexo, double perc) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.percVaga = perc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPercVaga() {
		return percVaga;
	}
	public void setPercVaga(double percVaga) {
		this.percVaga = percVaga;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
