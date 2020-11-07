package br.com.massao.webservices.cep.v1.service;

import org.springframework.stereotype.Service;

import br.com.massao.webservices.cep.util.CepUtil;
import br.com.massao.webservices.cep.v1.exception.CepException;
import br.com.massao.webservices.cep.v1.model.Address;

@Service
public interface CepService {
	final String CEP_NAO_INFORMADO = "Cep não informado"; 

	
	Address cep(String cep) throws CepException;

	
	default void validaCep(String cep) throws CepException {
		CepUtil.sanitize(cep);
	}
	
}