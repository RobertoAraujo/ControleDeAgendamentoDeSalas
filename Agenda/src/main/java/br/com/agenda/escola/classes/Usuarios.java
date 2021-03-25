package br.com.agenda.escola.classes;

import java.io.Serializable;
import java.util.Objects;

public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int id_usuario;
	String nome;
	String usuario;
	String senha;
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public String toString() {
		return "Usuarios [id_usuario=" + id_usuario + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id_usuario, nome, senha, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return id_usuario == other.id_usuario && Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(usuario, other.usuario);
	}
	
	
}
