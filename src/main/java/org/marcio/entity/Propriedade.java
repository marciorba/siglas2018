package org.marcio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Propriedade")
public class Propriedade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected long id;
	
	@Column(name="nome")
	protected String nome;
	
	@Column(name="Municipio")
	protected String Municipio;
	
	@Column(name="Estado")
	protected String Estado;
	
	@Column(name="InscricaoEstadual")
	protected String InscricaoEstadual;

	public long getId() {
		return id;
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

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}
	
}
