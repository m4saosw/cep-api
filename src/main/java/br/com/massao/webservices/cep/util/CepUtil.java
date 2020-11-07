package br.com.massao.webservices.cep.util;

import org.springframework.stereotype.Component;

import br.com.massao.webservices.cep.v1.exception.CepException;

@Component
public class CepUtil {
	public static final String CEP_NAO_INFORMADO = "Cep inválido";
	/**
	 * 
	 * @param cep
	 * @return
	 * @throws CepException
	 */
	public static String sanitize(String cep) throws CepException {
		boolean valid = true;
		String cep_ = "";

		valid = (cep != null && !cep.isEmpty());

		if (valid) {
			cep_ = cep.replaceAll("[^0-9]", "");
			valid = cep_.length() == 8;
		}

		if (!valid)
			throw new CepException(CEP_NAO_INFORMADO);

		return cep_;

	}
	

	
}
