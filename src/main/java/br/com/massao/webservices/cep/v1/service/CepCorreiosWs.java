package br.com.massao.webservices.cep.v1.service;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.massao.webservices.cep.correios.wsdl.ConsultaCEP;
import br.com.massao.webservices.cep.correios.wsdl.ConsultaCEPResponse;
import br.com.massao.webservices.cep.correios.wsdl.ObjectFactory;

public class CepCorreiosWs extends WebServiceGatewaySupport {
	private static final Logger LOG = LoggerFactory.getLogger(CepCorreiosWs.class);
	final String url = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente";
	
	/**
	 * consulta cep
	 * @param cep
	 * @return
	 */
	public ConsultaCEPResponse getCep(String cep) {
		LOG.info("Requesting location for {}", cep);
		
				
		ConsultaCEP request = new ConsultaCEP();
		request.setCep(cep);

		/* // nao funcionou 
		 * ConsultaCEPResponse response = (ConsultaCEPResponse)
		 * getWebServiceTemplate().marshalSendAndReceive( url, request);
		 */

		
		ObjectFactory factory = new ObjectFactory();
		JAXBElement<ConsultaCEPResponse> response = (JAXBElement<ConsultaCEPResponse>) getWebServiceTemplate().marshalSendAndReceive(
				url, factory.createConsultaCEP(request));

		
		
		
		return response.getValue();
	}

}
