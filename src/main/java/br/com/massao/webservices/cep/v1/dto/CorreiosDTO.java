package br.com.massao.webservices.cep.v1.dto;

import br.com.massao.webservices.cep.correios.wsdl.EnderecoERP;
import br.com.massao.webservices.cep.v1.model.Address;

public class CorreiosDTO {

	public Address getAddress(EnderecoERP model) {
		return new Address().
				setCep(model.getCep()).setLocalidade(model.getCidade()).setBairro(model.getBairro())
				.setLogradouro(model.getEnd()).setUf(model.getUf()).setComplemento(model.getComplemento2());

	}

}
