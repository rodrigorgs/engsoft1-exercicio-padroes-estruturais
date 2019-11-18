package ufba.composite;

abstract class Pessoa {
	String nome;
	double experiencia;
	
	public String getNome() {
		return this.nome;
	}
	public double getExperiencia() {
		return this.experiencia;
	}
	
	public abstract double getSalario();
}