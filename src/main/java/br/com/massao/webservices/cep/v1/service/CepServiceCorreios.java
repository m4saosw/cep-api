package br.com.massao.webservices.cep.v1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.massao.webservices.cep.v1.dto.CorreiosDTO;
import br.com.massao.webservices.cep.v1.exception.CepException;
import br.com.massao.webservices.cep.v1.model.Address;

@Service
@Qualifier("Correios")
@Primary
public class CepServiceCorreios implements CepService {

	private static final Logger LOG = LoggerFactory.getLogger(CepServiceCorreios.class);

	@Autowired
	CepCorreiosWs clientWs;
	
	@Override
	public Address cep(String cep) throws CepException {
		validaCep(cep);

		return new CorreiosDTO().getAddress(clientWs.getCep(cep).getReturn());
	}
	
	
	

}
