package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Transacao;
import io.swagger.service.TransacaoService;
import io.swagger.util.RespostasUtil;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

@Controller
public class TransacaoApiController implements TransacaoApi {

	@Autowired
	private TransacaoService transacaoService;

	@Autowired
	private RespostasUtil respostasUtil;


	@Override
	public ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true) @PathVariable("id") Long id,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "valor", required = true) Double valor,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization) {
		try {
			return transacaoService.atualiza(authorization, id, valor);
		} catch (Exception e) {
			return respostasUtil.getErroInterno(RespostasUtil.MENSAGEM_FALHA_AO_TENTAR_ATUALIZAR_TRANSACAO);
		}
	}

	@Override
	public ResponseEntity<Transacao> cadastraTransacao(
			@ApiParam(value = "", required = true) @RequestHeader(value = "Authorization", required = true) String authorization,
			@ApiParam(value = "", required = true) @Valid @RequestBody Transacao transacao,
			@NotNull @ApiParam(value = "", required = true, allowableValues = "debito, deposito")
			@Valid @RequestParam(value = "tipo", required = true) String tipo) {

		try {
			return transacaoService.salva(authorization, transacao, tipo);
		} catch (Exception e) {
			return respostasUtil.getErroInternoTransacao(RespostasUtil.MENSAGEM_FALHA_AO_SALVAR_TRANSACAO);
		}

	}

	@Override
	public ResponseEntity<Void> removeTransacao(@ApiParam(value = "", required = true) 
			@PathVariable("id") Long id,
			@ApiParam(value = "", required = true) 
			@RequestHeader(value = "Authorization", required = true) String authorization) {
		try {
			return transacaoService.exclui(authorization, id);
		} catch (Exception e) {
			return respostasUtil.getErroInterno(RespostasUtil.MENSAGEM_FALHA_AO_TENTAR_EXCLUIR_TRANSACAO);
		}
	}

}
