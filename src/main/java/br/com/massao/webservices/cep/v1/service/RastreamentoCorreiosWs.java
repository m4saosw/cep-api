package br.com.massao.webservices.cep.v1.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.massao.webservices.rastreamento.correios.wsdl.BuscaEventos;
import br.com.massao.webservices.rastreamento.correios.wsdl.BuscaEventosLista;
import br.com.massao.webservices.rastreamento.correios.wsdl.BuscaEventosListaResponse;
import br.com.massao.webservices.rastreamento.correios.wsdl.BuscaEventosResponse;
import br.com.massao.webservices.rastreamento.correios.wsdl.ObjectFactory;

public class RastreamentoCorreiosWs extends WebServiceGatewaySupport {
	private static final Logger LOG = LoggerFactory.getLogger(RastreamentoCorreiosWs.class);
	public static final String URL = "http://webservice.correios.com.br:80/service/rastro";
	private static final String USUARIO = "ECT"; // senha de testes provisoria dos Correios
	private static final String SENHA = "SRO";	//  usuario de testes provisoria dos Correios
	
	/**
	 * Consulta encomenda
	 * @param objeto
	 * @return
	 */
	public BuscaEventosResponse getEncomenda(String objeto) {
		LOG.info("Buscando localização do objeto {}", objeto);
		
				
		BuscaEventos request = new BuscaEventos();
		request.setUsuario(USUARIO);
		request.setSenha(SENHA);
		request.setTipo("");
		request.setResultado("T"); // todos resultados
		request.setLingua("101");// portugues
		request.setObjetos(objeto);

		/* // nao funcionou 
		 * BuscaEventosResponse response = (BuscaEventosResponse)
		 * getWebServiceTemplate().marshalSendAndReceive( url, request);
		 */
 
		/**
		 * Unmarshalling nao funcionava corretamente devolvendo sempre Objeto vazio devido a um problema no namespace dos Objetos gerados a partir do XSD originais
		 * Foi necessario remover manualmente a anotação namespace nas seguintes classes:
		 * BuscaEventosLista
		 * Objeto
		 */
		ObjectFactory factory = new ObjectFactory();
		BuscaEventosResponse response = (BuscaEventosResponse) JAXBIntrospector.getValue(getWebServiceTemplate().marshalSendAndReceive(
				URL, factory.createBuscaEventos(request)));

		// , new SoapActionCallback("buscaEventos")
		
		
		return response;
	}
	
	
	/**
	 * Consulta lista de encomendas
	 * @param objetos  quando for uma lista de encomendas, deve ser concatenado tudo junto
	 * @return
	 */
	public BuscaEventosListaResponse getEncomendas(String objetos) {
		LOG.info("Buscando localização dos objetos {}", objetos);
		

		BuscaEventosLista eventos = new BuscaEventosLista();
		eventos.setUsuario(USUARIO);
		eventos.setSenha(SENHA);
		eventos.setTipo("");
		eventos.setResultado("T");// todos resultados
		eventos.setLingua("101"); // portugues
		eventos.getObjetos().add(objetos);
		
		
		/* // nao funcionou 
		 * BuscaEventosListaResponse response = (BuscaEventosListaResponse)
		 * getWebServiceTemplate().marshalSendAndReceive( url, request);
		 */
 
		/**
		 * Unmarshalling nao funcionava corretamente devolvendo sempre Objeto vazio devido a um problema no namespace dos Objetos gerados a partir do XSD originais
		 * Foi necessario remover manualmente a anotação namespace nas seguintes classes:
		 * BuscaEventosLista
		 * Objeto
		 */
		
		ObjectFactory factory = new ObjectFactory();
		JAXBElement<BuscaEventosListaResponse> response = (JAXBElement<BuscaEventosListaResponse>) getWebServiceTemplate().marshalSendAndReceive(
				URL, factory.createBuscaEventosLista(eventos));

		// , new SoapActionCallback("buscaEventos")
		
		
		return response.getValue();
	}

}
