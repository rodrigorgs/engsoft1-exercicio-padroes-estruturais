package ufba.composite;

class Designer extends Pessoa {
	public Designer(String nome, double experiencia) {
		this.nome = nome;
		this.experiencia = experiencia;
	}
	public double getSalario() {
		return 800 * experiencia;
	}
}