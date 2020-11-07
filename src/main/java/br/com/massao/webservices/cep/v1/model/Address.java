package br.com.massao.webservices.cep.v1.model;

import com.squareup.moshi.Json;

public class Address {

	@Json(name = "cep")
	private String cep;
	
	@Json(name = "logradouro")
	private String logradouro;
	
	@Json(name = "complemento")
	private String complemento;
	
	@Json(name = "bairro")
	private String bairro;
	
	@Json(name = "localidade")
	private String localidade;
	
	@Json(name = "uf")
	private String uf;
	
	@Json(name = "ibge")
	private String ibge;
	
	@Json(name = "gia")
	private String gia;
	
	@Json(name = "ddd")
	private String ddd;
	
	@Json(name = "siafi")
	private String siafi;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Address() {
	}

	/**
	 *
	 * @param uf
	 * @param complemento
	 * @param ddd
	 * @param logradouro
	 * @param bairro
	 * @param localidade
	 * @param ibge
	 * @param siafi
	 * @param gia
	 * @param cep
	 */
	public Address(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
			String ibge, String gia, String ddd, String siafi) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}

	public String getIbge() {
		return ibge;
	}

	public String getGia() {
		return gia;
	}

	public String getDdd() {
		return ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	@Override
	public String toString() {
		return "Address [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge + ", gia=" + gia + ", ddd="
				+ ddd + ", siafi=" + siafi + "]";
	}

	public Address setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public Address setLogradouro(String logradouro) {
		this.logradouro = logradouro;
		return this;
	}

	public Address setComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}

	public Address setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public Address setLocalidade(String localidade) {
		this.localidade = localidade;
		return this;
	}

	public Address setUf(String uf) {
		this.uf = uf;
		return this;
	}

	public Address setIbge(String ibge) {
		this.ibge = ibge;
		return this;
	}

	public Address setGia(String gia) {
		this.gia = gia;
		return this;
	}

	public Address setDdd(String ddd) {
		this.ddd = ddd;
		return this;
	}

	public Address setSiafi(String siafi) {
		this.siafi = siafi;
		return this;
	}

}
