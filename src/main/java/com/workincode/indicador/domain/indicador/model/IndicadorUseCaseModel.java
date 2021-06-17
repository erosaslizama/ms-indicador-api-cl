package com.workincode.indicador.domain.indicador.model;

import java.util.List;

public class IndicadorUseCaseModel {

	public String codigo;
	public String nombre;
	public String unidadMedida;
	public List<SerieUseCaseModel> series;

	public IndicadorUseCaseModel() {

	}

	public IndicadorUseCaseModel(String codigo, String nombre,
			String unidadMedida, List<SerieUseCaseModel> series) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.series = series;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the unidadMedida
	 */
	public String getUnidadMedida() {
		return unidadMedida;
	}

	/**
	 * @param unidadMedida
	 *            the unidadMedida to set
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	/**
	 * @return the serie
	 */
	public List<SerieUseCaseModel> getSeries() {
		return series;
	}

	/**
	 * @param serie
	 *            the serie to set
	 */
	public void setSeries(List<SerieUseCaseModel> series) {
		this.series = series;
	}

	public static IndicadorUseCaseModelBuilder builder() {
		return new IndicadorUseCaseModelBuilder();
	}

	public static final class IndicadorUseCaseModelBuilder {
		public String codigo;
		public String nombre;
		public String unidadMedida;
		public List<SerieUseCaseModel> series;

		public IndicadorUseCaseModelBuilder codigo(String val) {
			this.codigo = val;
			return this;
		}

		public IndicadorUseCaseModelBuilder nombre(String val) {
			this.nombre = val;
			return this;
		}

		public IndicadorUseCaseModelBuilder unidadMedida(String val) {
			this.unidadMedida = val;
			return this;
		}

		public IndicadorUseCaseModelBuilder series(
				List<SerieUseCaseModel> val) {
			this.series = val;
			return this;
		}

		public IndicadorUseCaseModel build() {
			return new IndicadorUseCaseModel(this.codigo, this.nombre,
					this.unidadMedida, this.series);
		}
	}
}