package com.workincode.indicador.api.api;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-15T21:50:07.474-04:00[America/Santiago]")
public class ErrorResponse {
	@JsonProperty("mensaje")
	private String mensaje;

	@JsonProperty("mensajeError")
	private List<String> mensajeError;

	public ErrorResponse mensaje(String mensaje) {
		this.mensaje = mensaje;
		return this;
	}

	/**
	 * Get mensaje
	 * 
	 * @return mensaje
	 */
	@ApiModelProperty(value = "")

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ErrorResponse mensajeError(List<String> mensajeError) {
		this.mensajeError = mensajeError;
		return this;
	}

	public ErrorResponse(String mensaje, List<String> details) {

		this.mensaje = mensaje;
		this.mensajeError = details;
	}

	/**
	 * mensaje
	 * 
	 * @return mensajeError
	 */
	@ApiModelProperty(value = "mensaje")

	public List<String> getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(List<String> mensajeError) {
		this.mensajeError = mensajeError;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ErrorResponse errorResponse = (ErrorResponse) o;
		return Objects.equals(this.mensaje, errorResponse.mensaje) && Objects
				.equals(this.mensajeError, errorResponse.mensajeError);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mensaje, mensajeError);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResponse {\n");

		sb.append("    mensaje: ").append(toIndentedString(mensaje))
				.append("\n");
		sb.append("    mensajeError: ").append(toIndentedString(mensajeError))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
