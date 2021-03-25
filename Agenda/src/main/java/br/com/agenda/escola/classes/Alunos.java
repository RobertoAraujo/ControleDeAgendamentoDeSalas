package br.com.agenda.escola.classes;
import java.io.Serializable;
import java.util.Objects;


/***
 * 
 * @author Roberto Moraes
 * 24 de mar. de 2021
 */ 

public class Alunos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int Matricula;
	private String Nome;
	private String Tumar;
	private int Turno;
	
	@Override
	public String toString() {
		return "Aluno [Matricula=" + Matricula + ", Nome=" + Nome + ", Tumar=" + Tumar + ", Turno=" + Turno
				+ ", getMatricula()=" + getMatricula() + ", getNome()=" + getNome() + ", getTumar()=" + getTumar()
				+ ", getTurno()=" + getTurno() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTumar() {
		return Tumar;
	}
	public void setTumar(String tumar) {
		Tumar = tumar;
	}
	public int getTurno() {
		return Turno;
	}
	public void setTurno(int turno) {
		Turno = turno;
	}
	
	public Alunos(int matricula, String nome, String tumar, int turno) {
		super();
		Matricula = matricula;
		Nome = nome;
		Tumar = tumar;
		Turno = turno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Matricula, Nome, Tumar, Turno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return Matricula == other.Matricula && Objects.equals(Nome, other.Nome) && Objects.equals(Tumar, other.Tumar)
				&& Turno == other.Turno;
	}
	
	
	

}
