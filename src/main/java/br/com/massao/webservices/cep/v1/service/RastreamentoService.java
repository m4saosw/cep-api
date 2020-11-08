package br.com.massao.webservices.cep.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.massao.webservices.rastreamento.correios.wsdl.Objeto;

@Service
public class RastreamentoService {
	@Autowired
	RastreamentoCorreiosWs clientWs;
	
	public List<Objeto> rastreiaObjeto(String objeto) {
		return clientWs.getEncomenda(objeto).getReturn().getObjeto();
	}
	
}
