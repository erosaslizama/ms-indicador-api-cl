package com.workincode.indicador.resource.datasource.indicador.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Esta clase me permite obtener la serie del objecto externo al consumir la
 * api,Se considera que el indicador tiene asociada una serie en el llamado a un
 * indicador determinado.
 * 
 * @author Eric Rosa Lizama
 * @since 09-06-2021
 * @version 0.0.1
 * 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Serie implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Date fecha;
	public double valor;

	public Serie() {

	}

	public Serie(Date fecha, double valor) {

		this.fecha = fecha;
		this.valor = valor;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

}
