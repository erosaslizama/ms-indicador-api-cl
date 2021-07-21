package com.workincode.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * IndicadorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-10T19:56:12.738-04:00[America/Santiago]")
public class IndicadorResponse   {
  @JsonProperty("codigo")
  private String codigo;

  @JsonProperty("nombre")
  private String nombre;

  @JsonProperty("unidad")
  private String unidad;

  @JsonProperty("fecha")
  private String fecha;

  @JsonProperty("valor")
  private Double valor;

  public IndicadorResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  */
  @ApiModelProperty(example = "utm", value = "")


  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public IndicadorResponse nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  */
  @ApiModelProperty(example = "Unidad Tributaria Mensual (UTM)", value = "")


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public IndicadorResponse unidad(String unidad) {
    this.unidad = unidad;
    return this;
  }

  /**
   * Get unidad
   * @return unidad
  */
  @ApiModelProperty(example = "Pesos", value = "")


  public String getUnidad() {
    return unidad;
  }

  public void setUnidad(String unidad) {
    this.unidad = unidad;
  }

  public IndicadorResponse fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
  */
  @ApiModelProperty(example = "dd-mm-yyyy", value = "")


  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public IndicadorResponse valor(Double valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  */
  @ApiModelProperty(example = "12.3", value = "")


  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicadorResponse indicadorResponse = (IndicadorResponse) o;
    return Objects.equals(this.codigo, indicadorResponse.codigo) &&
        Objects.equals(this.nombre, indicadorResponse.nombre) &&
        Objects.equals(this.unidad, indicadorResponse.unidad) &&
        Objects.equals(this.fecha, indicadorResponse.fecha) &&
        Objects.equals(this.valor, indicadorResponse.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nombre, unidad, fecha, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicadorResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    unidad: ").append(toIndentedString(unidad)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

