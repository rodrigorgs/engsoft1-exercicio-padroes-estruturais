package ufba.decorator.lib;

interface UsuarioDAO {
	public void apagarTudo();
	public void inserir(Usuario u);
	public Usuario obter(String username);
}