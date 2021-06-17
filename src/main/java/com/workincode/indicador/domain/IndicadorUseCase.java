package com.workincode.indicador.domain;

import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;

public  interface IndicadorUseCase {
	IndicadorUseCaseModel getIndicador(String tipo,String fecha);
}