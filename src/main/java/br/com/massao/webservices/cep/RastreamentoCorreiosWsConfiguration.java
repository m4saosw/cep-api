package br.com.massao.webservices.cep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import br.com.massao.webservices.cep.v1.service.CepCorreiosWs;
import br.com.massao.webservices.cep.v1.service.RastreamentoCorreiosWs;

@Configuration
public class RastreamentoCorreiosWsConfiguration {
	// Importante: Por existir mais de um marshaller, utilizar nome do metodo diferente em cada classe. Neste caso marshallerRastreamento neste metodo e tambem mesmo nome injetado no metodo abaixo cepCorreiosWsClient
	
	 @Bean
	  public Jaxb2Marshaller marshallerRastreamento() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("br.com.massao.webservices.rastreamento.correios.wsdl");
	    return marshaller;
	  }

	  @Bean
	  public RastreamentoCorreiosWs rastreamentoCorreiosWsClient(Jaxb2Marshaller marshallerRastreamento) {
		  RastreamentoCorreiosWs client = new RastreamentoCorreiosWs();
	    //client.setDefaultUri("");  // definido no servico
	    client.setMarshaller(marshallerRastreamento);
	    client.setUnmarshaller(marshallerRastreamento);
	    return client;
	  }
}
