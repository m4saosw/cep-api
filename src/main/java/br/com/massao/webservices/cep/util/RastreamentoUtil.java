package br.com.massao.webservices.cep.util;

import org.springframework.stereotype.Component;

import br.com.massao.webservices.cep.v1.exception.RastreamentoException;

@Component
public class RastreamentoUtil {
	public static final String OBJETO_NAO_INFORMADO = "Objeto inválido";
	/**
	 * 
	 * @param objeto
	 * @return
	 * @throws RastreamentoException 
	 */
	public static String sanitize(String objeto) throws RastreamentoException {
		boolean valid = true;

		valid = (objeto != null && !objeto.isEmpty());

		if (valid) {
			valid = objeto.length() > 3;
		}
		
		if (!valid)
			throw new RastreamentoException(OBJETO_NAO_INFORMADO);

		return objeto;

	}
	

	
}
