package br.com.agenda.escola.classes;
import java.io.Serializable;
import java.util.Objects;
/***
 * 
 * @author Roberto Moraes
 * 24 de mar. de 2021
 */

public class Colaborador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int Codigo;
	private String Nome;
	private String Cargo;
	
	@Override
	public String toString() {
		return "Colaboradores [Codigo=" + Codigo + ", Nome=" + Nome + ", Cargo=" + Cargo + ", getCodigo()="
				+ getCodigo() + ", getNome()=" + getNome() + ", getCargo()=" + getCargo() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public Colaborador(int codigo, String nome, String cargo) {
		super();
		Codigo = codigo;
		Nome = nome;
		Cargo = cargo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Cargo, Codigo, Nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		return Objects.equals(Cargo, other.Cargo) && Codigo == other.Codigo && Objects.equals(Nome, other.Nome);
	}
	
	
	
}
