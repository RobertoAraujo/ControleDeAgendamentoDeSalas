package br.com.agenda.escola.classes;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/***
 * 
 * @author Roberto Moraes
 * 24 de mar. de 2021
 */

public class Agenda implements Serializable {
	
	private int CodSalava;
	private  Date DataHora;
	private  String nome;
	
	private static final long serialVersionUID = 1L;
	
	public int getCodSalava() {
		return CodSalava;
	}
	public void setCodSalava(int codSalava) {
		CodSalava = codSalava;
	}
	public Date getDataHora() {
		return DataHora;
	}
	public void setDataHora(Date dataHora) {
		DataHora = dataHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "AgendaSala [CodSalava=" + CodSalava + ", DataHora=" + DataHora + ", nome=" + nome + ", getCodSalava()="
				+ getCodSalava() + ", getDataHora()=" + getDataHora() + ", getNome()=" + getNome() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public Agenda(int codSalava, Date dataHora, String nome) {
		super();
		CodSalava = codSalava;
		DataHora = dataHora;
		this.nome = nome;
	}
	
	public int hashCode() {
		return Objects.hash(CodSalava, DataHora, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return CodSalava == other.CodSalava && Objects.equals(DataHora, other.DataHora)
				&& Objects.equals(nome, other.nome);
	}
	
	
	
}
