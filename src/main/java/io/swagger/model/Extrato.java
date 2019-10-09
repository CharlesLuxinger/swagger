package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Extrato
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

public class Extrato   {
	@JsonProperty("transacoes")
	@Valid
	private List<Transacao> transacoes = null;

	public Extrato transacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
		return this;
	}

	public Extrato addTransacoesItem(Transacao transacoesItem) {
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
		Extrato extrato = (Extrato) o;
		return Objects.equals(this.transacoes, extrato.transacoes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(transacoes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Extrato {\n");

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

