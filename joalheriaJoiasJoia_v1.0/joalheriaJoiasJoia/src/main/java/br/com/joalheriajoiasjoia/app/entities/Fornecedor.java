package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fornecedor;

	@Column
	private String nome;

	@Column
	private String telefone;

	@Column
	private String email;

	@Column
	private String endComp;

	@Column
	private String nomeCont;

	// Contrutores

	public Fornecedor() {

	}

	public Fornecedor(Long id_fornecedor, String nome, String telefone, String email, String endComp, String nomeCont) {
		this.id_fornecedor = id_fornecedor;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endComp = endComp;
		this.nomeCont = nomeCont;
	}
	// Getters e Setters

	public Long getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(Long id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndComp() {
		return endComp;
	}

	public void setEndComp(String endComp) {
		this.endComp = endComp;
	}

	public String getNomeCont() {
		return nomeCont;
	}

	public void setNomeCont(String nomeCont) {
		this.nomeCont = nomeCont;
	}

}
