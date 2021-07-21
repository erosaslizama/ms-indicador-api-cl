package com.workincode.indicador.resource.repository.indicador.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class IndicadorRepositoryEntity extends Auditable {

	@Column(name = "codigo")
	public String codigo;
	@Column(name = "nombre")
	public String nombre;
	@Column(name = "unidad_medida")
	public String unidadMedida;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<SerieRepositoryEntity> series;

	public IndicadorRepositoryEntity(String codigo, String nombre,
			String unidadMedida, List<SerieRepositoryEntity> series) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.series = series;
	}

	public IndicadorRepositoryEntity() {
		// TODO Auto-generated constructor stub
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
	public List<SerieRepositoryEntity> getSeries() {
		return series;
	}

	/**
	 * @param serie
	 *            the serie to set
	 */
	public void setSeries(List<SerieRepositoryEntity> series) {
		this.series = series;
	}

	public static IndicadorRepositoryBuilder builder() {
		return new IndicadorRepositoryBuilder();
	}

	public static final class IndicadorRepositoryBuilder {

		public String codigo;
		public String nombre;
		public String unidadMedida;
		public List<SerieRepositoryEntity> series;

		public IndicadorRepositoryBuilder nombre(String val) {
			this.nombre = val;
			return this;
		}

		public IndicadorRepositoryBuilder codigo(String val) {
			this.codigo = val;
			return this;
		}

		public IndicadorRepositoryBuilder unidadMedida(String val) {
			this.unidadMedida = val;
			return this;
		}

		public IndicadorRepositoryBuilder series(List<SerieRepositoryEntity> val) {
			this.series = val;
			return this;
		}

		public IndicadorRepositoryEntity build() {
			return new IndicadorRepositoryEntity(this.codigo, this.nombre,
					this.unidadMedida, this.series);
		}

	}

	@Override
	public boolean isNew() {
		return false;
	}
}
