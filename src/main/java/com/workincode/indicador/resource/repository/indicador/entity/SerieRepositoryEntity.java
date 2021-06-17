package com.workincode.indicador.resource.repository.indicador.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class SerieRepositoryEntity extends Auditable{

	
	public Date fecha;
	public double valor;

	public SerieRepositoryEntity() {

	}
	
	public SerieRepositoryEntity(Date fecha, double valor) {
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
	 * @param fecha the fecha to set
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
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	public static SerieRepositoryBuilder  builder() {
		return new SerieRepositoryBuilder();
	}

	public static final class SerieRepositoryBuilder {
		public Date fecha;
		public double valor;

		public SerieRepositoryBuilder fecha(Date val) {
			this.fecha = val;
			return this;
		}
		public SerieRepositoryBuilder valor(double val) {
			this.valor = val;
			return this;
		}

		public SerieRepositoryEntity build() {
			return new SerieRepositoryEntity(this.fecha, this.valor);
		}

	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

}
