package br.com.massao.webservices.cep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import br.com.massao.webservices.cep.v1.service.CepCorreiosWs;

@Configuration
public class CepCorreiosWsConfiguration {
	 @Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("br.com.massao.webservices.cep.correios.wsdl");
	    return marshaller;
	  }

	  @Bean
	  public CepCorreiosWs correiosWsClient(Jaxb2Marshaller marshaller) {
		  CepCorreiosWs client = new CepCorreiosWs();
	    //client.setDefaultUri("");  // definido no servico
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }
}
