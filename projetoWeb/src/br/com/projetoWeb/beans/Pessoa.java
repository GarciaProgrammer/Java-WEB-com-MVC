package br.com.projetoWeb.beans;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String dtNascimento;
	private char sexo;

	public Pessoa() {
	}

	public Pessoa(long id, String nome, String dtNascimento, char sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
