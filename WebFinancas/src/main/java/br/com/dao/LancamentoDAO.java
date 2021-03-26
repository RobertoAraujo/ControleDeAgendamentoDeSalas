package br.com.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import br.com.lancamentos.*;
import br.com.modelo.Lancamentos;
public class LancamentoDAO {

	private static Connection conn;
	
	
	public static void inserir(Lancamentos lancamentos) {
		
		try {
			conn = FabricaDeConexoes.criaConexao();
			String sql = "INSERT INTO lancamento (descricao, tipo_lancamento, status, valor) " + "Values(?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, lancamentos.getDescricao());
			ps.setInt(2, lancamentos.getTipo().ordinal());
			ps.setDate(3, new java.sql.Date(lancamentos.getVencimento().getTime()));
			ps.setBoolean(4, lancamentos.isStatus());
			ps.setBigDecimal(5, lancamentos.getValor());
			
			ps.execute();
			
			System.out.println("Incluido");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ACONTECEU");
			e.printStackTrace();
		} finally{
			FabricaDeConexoes.fecharConexao(conn);
		}
		
	}
	
	
	public static void main(String[] args) {
		Lancamentos lancamentos = new Lancamentos();
		
		lancamentos.setDescricao("conta luz");
		lancamentos.setStatus(true);
		lancamentos.setTipo(TipoLancamento.Despesa);
		lancamentos.setValor(new BigDecimal("125.00"));
		lancamentos.setVencimento(new Date());
		inserir(lancamentos);
	}
	
}
