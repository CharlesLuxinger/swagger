package io.swagger.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Cliente;
import io.swagger.service.ClienteService;
import io.swagger.util.RespostasUtil;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

@Controller
public class ClienteApiController implements ClienteApi {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private RespostasUtil respostaUtil;

	@Override
	public ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = "") @Valid @RequestBody Cliente cliente) {

		try {
			return clienteService.salva(cliente);
		} catch (Exception e) {
			return respostaUtil.getErroInternoCliente(ClienteService.FALHA_AO_TENTAR_CADASTRAR_UM_CLIENTE);
		}

	}

}
