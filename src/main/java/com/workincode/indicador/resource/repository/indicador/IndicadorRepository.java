package com.workincode.indicador.resource.repository.indicador;

import java.text.ParseException;

import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;



public interface IndicadorRepository {
	IndicadorUseCaseModel getIndicador(String tipo,String fecha) throws ParseException;
}