package br.com.massao.webservices.cep.v1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.massao.webservices.cep.util.CepUtil;
import br.com.massao.webservices.cep.v1.exception.CepException;
import br.com.massao.webservices.cep.v1.model.Address;
import br.com.massao.webservices.cep.v1.model.ResponseError;
import br.com.massao.webservices.cep.v1.service.CepService;

/**
 * Restfull
 * 
 * @author Massao
 *
 */
@RestController // @Controller e @ResponseBody
@RequestMapping("/cep-api/v1")
public class CepController {
	private static final Logger LOG = LoggerFactory.getLogger(CepController.class);

	@Autowired
	CepService apiService;
	
	@Autowired
	CepUtil util;
	

	@GetMapping("/ceps")
	public String list() {
		return "varios ceps";

	}

	/**
	 * 
	 * @param cep
	 * @return
	 */
	@GetMapping("ceps/{cep}")
	public ResponseEntity<?> getCep(@PathVariable("cep") String cep, @RequestParam(name="api", required=false) String api, @RequestParam(name="mode", required=false) String mode) {

		LOG.debug("Iniciando consulta cep <{}> api<{}> mode<{}>", cep, api, mode);
		
		// wsdl cep correios https://medium.com/@markos12/consumindo-o-webservice-dos-correios-soap-via-extens%C3%A3o-do-1b087bf290fb

		try {
			cep = util.sanitize(cep);

			return new ResponseEntity<Address>(apiService.cep(cep), HttpStatus.OK);

		} catch (CepException e) {
			return new ResponseEntity<ResponseError>(new ResponseError("BU", e.getMessage()), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			return new ResponseEntity<ResponseError>(new ResponseError("EX", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	

	// post

	// delete

	// put

}
