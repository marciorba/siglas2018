package org.marcio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	protected long id;
	
	@Column(name="nome")
	protected String nome;
	
	@Column(name="tipofj")
	protected String tipofj;
	
	@Column(name="cpfcnpj")
	protected String cpfcnpj;
	
	@Column(name="inscricaoestadual")
	protected String inscricaoestadual;
	
	@Column(name="enderecologradouro")
	protected String enderecologradouro;
	
	@Column(name="endereconumero")
	protected String endereconumero;
	
	@Column(name="enderecobairro")
	protected String enderecobairro;
	
	@Column(name="enderecocidade")
	protected String enderecocidade;
	
	@Column(name="enderecoestado")
	protected String enderecoestado;
	
	@Column(name="enderecocep")
	protected String enderecocep;
	
	@Column(name="fonefixo")
	protected String fonefixo;
	
	@Column(name="fonemovel")
	protected String fonemovel;
	
	@Column(name="email")
	protected String email;
	
	@Column(name="siteempresarial")
	protected String siteempresarial;

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

	public String getTipofj() {
		return tipofj;
	}

	public void setTipofj(String tipofj) {
		this.tipofj = tipofj;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getInscricaoestadual() {
		return inscricaoestadual;
	}

	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	public String getEnderecologradouro() {
		return enderecologradouro;
	}

	public void setEnderecologradouro(String enderecologradouro) {
		this.enderecologradouro = enderecologradouro;
	}

	public String getEndereconumero() {
		return endereconumero;
	}

	public void setEndereconumero(String endereconumero) {
		this.endereconumero = endereconumero;
	}

	public String getEnderecobairro() {
		return enderecobairro;
	}

	public void setEnderecobairro(String enderecobairro) {
		this.enderecobairro = enderecobairro;
	}

	public String getEnderecocidade() {
		return enderecocidade;
	}

	public void setEnderecocidade(String enderecocidade) {
		this.enderecocidade = enderecocidade;
	}

	public String getEnderecoestado() {
		return enderecoestado;
	}

	public void setEnderecoestado(String enderecoestado) {
		this.enderecoestado = enderecoestado;
	}

	public String getEnderecocep() {
		return enderecocep;
	}

	public void setEnderecocep(String enderecocep) {
		this.enderecocep = enderecocep;
	}

	public String getFonefixo() {
		return fonefixo;
	}

	public void setFonefixo(String fonefixo) {
		this.fonefixo = fonefixo;
	}

	public String getFonemovel() {
		return fonemovel;
	}

	public void setFonemovel(String fonemovel) {
		this.fonemovel = fonemovel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSiteempresarial() {
		return siteempresarial;
	}

	public void setSiteempresarial(String siteempresarial) {
		this.siteempresarial = siteempresarial;
	}
	
}