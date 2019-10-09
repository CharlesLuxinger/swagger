package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Conta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

public class Conta   {
	@JsonProperty("agencia")
	private Integer agencia = null;

	@JsonProperty("conta")
	private Integer conta = null;

	@JsonProperty("digito")
	private Integer digito = null;

	@JsonProperty("saldo")
	private Double saldo = null;

	@JsonProperty("cliente")
	private Cliente cliente = null;

	@JsonProperty("transacoes")
	@Valid
	private List<Transacao> transacoes = null;

	public Conta agencia(Integer agencia) {
		this.agencia = agencia;
		return this;
	}

	/**
	 * Get agencia
	 * @return agencia
	 **/
	@ApiModelProperty(example = "1234", value = "")


	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Conta conta(Integer conta) {
		this.conta = conta;
		return this;
	}

	/**
	 * Get conta
	 * @return conta
	 **/
	@ApiModelProperty(example = "12345", value = "")


	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public Conta digito(Integer digito) {
		this.digito = digito;
		return this;
	}

	/**
	 * Get digito
	 * @return digito
	 **/
	@ApiModelProperty(example = "6", value = "")


	public Integer getDigito() {
		return digito;
	}

	public void setDigito(Integer digito) {
		this.digito = digito;
	}

	public Conta saldo(Double saldo) {
		this.saldo = saldo;
		return this;
	}

	/**
	 * Get saldo
	 * @return saldo
	 **/
	@ApiModelProperty(example = "100.15", value = "")


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Conta cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	/**
	 * Get cliente
	 * @return cliente
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Conta transacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
		return this;
	}

	public Conta addTransacoesItem(Transacao transacoesItem) {
		if (this.transacoes == null) {
			this.transacoes = new ArrayList<Transacao>();
		}
		this.transacoes.add(transacoesItem);
		return this;
	}

	/**
	 * Get transacoes
	 * @return transacoes
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Conta conta = (Conta) o;
		return Objects.equals(this.agencia, conta.agencia) &&
				Objects.equals(this.conta, conta.conta) &&
				Objects.equals(this.digito, conta.digito) &&
				Objects.equals(this.saldo, conta.saldo) &&
				Objects.equals(this.cliente, conta.cliente) &&
				Objects.equals(this.transacoes, conta.transacoes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, conta, digito, saldo, cliente, transacoes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Conta {\n");

		sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
		sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
		sb.append("    digito: ").append(toIndentedString(digito)).append("\n");
		sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
		sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
		sb.append("    transacoes: ").append(toIndentedString(transacoes)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

