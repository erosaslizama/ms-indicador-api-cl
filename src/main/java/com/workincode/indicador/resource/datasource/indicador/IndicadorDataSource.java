package com.workincode.indicador.resource.datasource.indicador;

import com.workincode.indicador.resource.datasource.indicador.entity.Indicador;

public interface IndicadorDataSource {
	Indicador obtenerIndicador(String tipoIndicador,String fecha);    
}