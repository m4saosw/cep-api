package br.com.massao.webservices.cep.v1.controller;

import java.util.List;

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
import br.com.massao.webservices.cep.util.RastreamentoUtil;
import br.com.massao.webservices.cep.v1.exception.CepException;
import br.com.massao.webservices.cep.v1.exception.RastreamentoException;
import br.com.massao.webservices.cep.v1.model.Address;
import br.com.massao.webservices.cep.v1.model.ResponseError;
import br.com.massao.webservices.cep.v1.service.CepService;
import br.com.massao.webservices.cep.v1.service.RastreamentoService;
import br.com.massao.webservices.rastreamento.correios.wsdl.Objeto;

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
	RastreamentoService apiRastreamentoService;

	@Autowired
	CepUtil cepUtil;
	
	@Autowired
	RastreamentoUtil rastreamentoUtil;


	/**
	 * 
	 * @param cep
	 * @return
	 */
	@GetMapping("ceps/{cep}")
	public ResponseEntity<?> getCep(@PathVariable("cep") String cep,
			@RequestParam(name = "api", required = false) String api,
			@RequestParam(name = "mode", required = false) String mode) {

		LOG.debug("Iniciando consulta cep <{}> api<{}> mode<{}>", cep, api, mode);

		// wsdl cep correios
		// https://medium.com/@markos12/consumindo-o-webservice-dos-correios-soap-via-extens%C3%A3o-do-1b087bf290fb

		try {
			cep = cepUtil.sanitize(cep);

			return new ResponseEntity<Address>(apiService.cep(cep), HttpStatus.OK);

		} catch (CepException e) {
			return new ResponseEntity<ResponseError>(new ResponseError("BU", e.getMessage()), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			return new ResponseEntity<ResponseError>(new ResponseError("EX", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * Consulta o rastreamento de uma encomenda nos Correios
	 * @param objeto
	 * @return
	 */
	@GetMapping("rastreamento/correios/{objeto}")
	public ResponseEntity<?> getEncomenda(@PathVariable("objeto") String objeto) {

		LOG.debug("Iniciando rastreamento de objeto nos correios <{}>", objeto);

		//

		try {
			objeto = rastreamentoUtil.sanitize(objeto);
			List<Objeto> rastreiaObjeto = apiRastreamentoService.rastreiaObjeto(objeto);

			return new ResponseEntity<>(rastreiaObjeto, HttpStatus.OK);

		} catch (RastreamentoException e) {
			return new ResponseEntity<ResponseError>(new ResponseError("BU", e.getMessage()), HttpStatus.BAD_REQUEST);

		} catch (Exception e) {
			return new ResponseEntity<ResponseError>(new ResponseError("EX", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
