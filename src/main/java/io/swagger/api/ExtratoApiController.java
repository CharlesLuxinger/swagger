package io.swagger.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Extrato;
import io.swagger.service.ContaService;
import io.swagger.util.RespostasUtil;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

@Controller
public class ExtratoApiController implements ExtratoApi {

	@Autowired
	private ContaService contaService;

	@Autowired
	private RespostasUtil respostasUtil;

	@Override
	public ResponseEntity<Extrato> consultaExtrato(
			@ApiParam(value = "", required = true) @PathVariable("agencia") Integer agencia,
			@ApiParam(value = "", required = true) @PathVariable("conta") Integer conta,
			@ApiParam(value = "", required = true) @PathVariable("digito") Integer digito,
			@ApiParam(value = "", required = true) @RequestHeader(value = "Authorization", required = true) String authorization) {

		try {
			return contaService.consultaExtrato(authorization, agencia, conta, digito);
		} catch (Exception e) {
			return respostasUtil.getErroInternoExtrato(RespostasUtil.MENSAGEM_FALHA_AO_TENTAR_CONSULTAR_EXTRATO);
		}
	}

}
