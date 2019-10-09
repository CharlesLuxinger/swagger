package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.swagger.converter.ClienteConverter;
import io.swagger.entity.ClienteEntity;
import io.swagger.model.Cliente;
import io.swagger.repository.Clientes;
import io.swagger.util.AuthUtil;
import io.swagger.util.RespostasUtil;

@Service
public class ClienteService {

	public static final String MENSAGEM_DADOS_INVALIDOS = "Titular, Cpf ou Password nao foi informado.";

	public static final String MENSAGEM_FALHA_CADASTRAR_CLIENTE = "Falha ao tentar cadastrar o cliente";

	public static final String FALHA_AO_TENTAR_CADASTRAR_UM_CLIENTE = "Falha ao tentar cadastrar um cliente.";

	@Autowired
	private Clientes repository;

	@Autowired
	private RespostasUtil respostasUtil;

	public ResponseEntity<Cliente> salva(Cliente cliente_) {

		if (ehClienteValidoParaCadastro(cliente_)) {
			return respostasUtil.getRequisicaoInvalidaCliente(MENSAGEM_DADOS_INVALIDOS);
		}

		return new ResponseEntity<Cliente>(cadastraNovoCliente(cliente_), HttpStatus.CREATED);
	}

	public Cliente cadastraNovoCliente(Cliente cliente_) {

		ClienteEntity clienteEntity = ClienteConverter.toClienteEntity(cliente_, AuthUtil.getBasicAuth(cliente_.getCpf(), cliente_.getPassword()));

		clienteEntity = repository.save(clienteEntity);

		return ClienteConverter.toCliente(clienteEntity);
	}

	public ClienteEntity getClienteByAuthorization(String authorization) {
		String[] basicAuth = AuthUtil.getBasicAuth(authorization);
		String cpf = basicAuth[0];
		String password = basicAuth[1];

		ClienteEntity clienteEntity = repository.findByCpfAndPassword(cpf, password);
		return clienteEntity;
	}

	public boolean ehClienteValidoParaCadastro(Cliente cliente_) {
		return StringUtils.isEmpty(cliente_.getTitular()) || StringUtils.isEmpty(cliente_.getCpf())
				|| StringUtils.isEmpty(cliente_.getPassword());
	}
}
