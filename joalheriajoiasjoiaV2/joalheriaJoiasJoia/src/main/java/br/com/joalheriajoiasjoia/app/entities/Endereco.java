package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;

	@Column
	private String bairro;

	@Column
	private String rua;

	@Column
	private String cidade;

	@Column
	private String numeroCasa;

	@Column
	private String estado;

	@Column
	private String cep;

	@Column
	private String complemento;

	// Contrutores
	public Endereco() {

	}

	public Endereco(Long id_endereco, String bairro, String rua, String cidade, String numeroCasa, String estado,
			String cep, String complemento) {
		this.id_endereco = id_endereco;
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		this.numeroCasa = numeroCasa;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}

	// getters setters
	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
