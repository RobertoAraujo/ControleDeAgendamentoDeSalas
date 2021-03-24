package br.com.teste;

import java.io.Serializable;

public class OlaMundo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String Comprimento = "Ola Mundo! Seja Bem Vindo ao Mundo java Web";

	public String getComprimento() {
		return Comprimento;
	}

	public void setComprimento(String comprimento) {
		Comprimento = comprimento;
	}

	
	public String toString() {
		return "OlaMundo [Comprimento=" + Comprimento + "]";
	}
	
}
