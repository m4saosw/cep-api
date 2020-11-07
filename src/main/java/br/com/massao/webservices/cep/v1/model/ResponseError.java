package br.com.massao.webservices.cep.v1.model;


import com.squareup.moshi.Json;

public class ResponseError {

	@Json(name = "code")
	private String code;
	
	@Json(name = "message")
	private String message;
	
	
	public ResponseError(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}


	public String getCode() {
		return code;
	}


	public String getMessage() {
		return message;
	}

	
}

