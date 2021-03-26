package br.com.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import br.com.lancamentos.*;


public class Lancamentos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String descricao;
	private TipoLancamento tipo;
	private Date vencimento;
	private boolean status;
	private BigDecimal valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoLancamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", tipo=" + tipo + ", vencimento=" + vencimento
				+ ", status=" + status + ", valor=" + valor + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, status, tipo, valor, vencimento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamentos other = (Lancamentos) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id) && status == other.status
				&& tipo == other.tipo && Objects.equals(valor, other.valor)
				&& Objects.equals(vencimento, other.vencimento);
	}
	
	
	
}
