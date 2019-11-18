package ufba.composite;

class Programador extends Pessoa {
	public Programador(String nome, double experiencia) {
		this.nome = nome;
		this.experiencia = experiencia;
	}
	public double getSalario() {
		return 1000 * experiencia;
	}
}