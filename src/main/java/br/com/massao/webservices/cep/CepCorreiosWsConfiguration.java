package br.com.massao.webservices.cep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import br.com.massao.webservices.cep.v1.service.CepCorreiosWs;

@Configuration
public class CepCorreiosWsConfiguration {
	// Importante: Por existir mais de um marshaller, utilizar nome do metodo diferente em cada classe. Neste caso marshallerCep neste metodo e tambem mesmo nome injetado no metodo abaixo cepCorreiosWsClient
	 @Bean
	  public Jaxb2Marshaller marshallerCep() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("br.com.massao.webservices.cep.correios.wsdl");
	    return marshaller;
	  }

	  @Bean
	  public CepCorreiosWs cepCorreiosWsClient(Jaxb2Marshaller marshallerCep) {
		  CepCorreiosWs client = new CepCorreiosWs();
	    //client.setDefaultUri("");  // definido no servico
	    client.setMarshaller(marshallerCep);
	    client.setUnmarshaller(marshallerCep);
	    return client;
	  }
}
