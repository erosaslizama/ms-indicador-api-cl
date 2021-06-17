package com.workincode.indicador.resource.datasource.indicador.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Esta clase me permite obtener el objecto desde el api 
 * externo, al consumir dicha api esta clase va contener la informacion
 * tanto del indicador como de la serie
 * 
 * @author Eric Rosa Lizama
 * @since  09-06-2021
 * @version 0.0.1
 * @see   com.bnc.SerieRepositoryEntity.banco.resource.datasource.indicador.entity.Serie 
 * 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Indicador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public String codigo;
    public String nombre;
    
    public String unidadMedida;
    public List<Serie> serie;
    
    
	
    public Indicador(String codigo, String nombre, String unidadMedida,
			List<Serie> serie) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.serie = serie;
	}
	
	public Indicador() {
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
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
	 * @param nombre the nombre to set
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
	 * @param unidadMedida the unidadMedida to set
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	/**
	 * @return the serie
	 */
	public List<Serie> getSeries() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(List<Serie> serie) {
		this.serie = serie;
	}
}