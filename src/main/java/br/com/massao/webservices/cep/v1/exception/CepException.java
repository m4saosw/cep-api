package br.com.massao.webservices.cep.v1.exception;

public class CepException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CepException(String error) {
		super(error);
	}

}
