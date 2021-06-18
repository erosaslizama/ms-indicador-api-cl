package com.workincode.indicador.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * IndicadorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-10T19:56:12.738-04:00[America/Santiago]")
public class IndicadorRequest {
	@JsonProperty("fecha")
	private String fecha;

	@JsonProperty("tipo")
	private String tipo;

	public IndicadorRequest fecha(String fecha) {
		this.fecha = fecha;
		return this;
	}

	/**
	 * Get fecha
	 * 
	 * @return fecha
	 */
	@ApiModelProperty(example = "dd-mm-yyyy", value = "")
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public IndicadorRequest tipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	/**
	 * Get tipo
	 * 
	 * @return tipo
	 */
	@ApiModelProperty(example = "uf", value = "")

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IndicadorRequest indicadorRequest = (IndicadorRequest) o;
		return Objects.equals(this.fecha, indicadorRequest.fecha)
				&& Objects.equals(this.tipo, indicadorRequest.tipo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, tipo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IndicadorRequest {\n");

		sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
		sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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
