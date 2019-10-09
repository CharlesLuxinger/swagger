package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T02:27:42.981Z")

public class Cliente   {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("titular")
	private String titular = null;

	@JsonProperty("cpf")
	private String cpf = null;

	@JsonProperty("password")
	private String password = null;

	@JsonProperty("conta")
	@Valid
	private List<Conta> conta = null;

	public Cliente id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	@ApiModelProperty(example = "1", value = "")


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente titular(String titular) {
		this.titular = titular;
		return this;
	}

	/**
	 * Get titular
	 * @return titular
	 **/
	@ApiModelProperty(example = "Manuel Silva", value = "")


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Cliente cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	/**
	 * Get cpf
	 * @return cpf
	 **/
	@ApiModelProperty(example = "01234567890", value = "")

	@Size(min=11,max=11)
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * @return password
	 **/
	@ApiModelProperty(example = "senha123", value = "")


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cliente conta(List<Conta> conta) {
		this.conta = conta;
		return this;
	}

	public Cliente addContaItem(Conta contaItem) {
		if (this.conta == null) {
			this.conta = new ArrayList<Conta>();
		}
		this.conta.add(contaItem);
		return this;
	}

	/**
	 * Get conta
	 * @return conta
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) o;
		return Objects.equals(this.id, cliente.id) &&
				Objects.equals(this.titular, cliente.titular) &&
				Objects.equals(this.cpf, cliente.cpf) &&
				Objects.equals(this.password, cliente.password) &&
				Objects.equals(this.conta, cliente.conta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, titular, cpf, password, conta);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Cliente {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
		sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
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

