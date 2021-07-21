
package com.workincode.indicador.domain.indicador.model;

import java.util.Date;

public class SerieUseCaseModel {

	private Date fecha;
	private double valor;

	public SerieUseCaseModel(Date fecha, double valor) {
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

	public static SerieUseCaseModelBuilder builder() {
		return new SerieUseCaseModelBuilder();
	}

	/**
	 * Patron builder
	 * 
	 * @author erosas
	 *
	 */
	public static final class SerieUseCaseModelBuilder {
		private Date fecha;
		private double valor;

		public SerieUseCaseModelBuilder fecha(Date val) {
			this.fecha = val;
			return this;
		}
		public SerieUseCaseModelBuilder valor(double val) {
			this.valor = val;
			return this;
		}

		public SerieUseCaseModel build() {
			return new SerieUseCaseModel(this.fecha, this.valor);
		}

	}

}
