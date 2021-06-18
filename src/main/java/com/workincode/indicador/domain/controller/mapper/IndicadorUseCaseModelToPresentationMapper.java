package com.workincode.indicador.domain.controller.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.workincode.indicador.api.model.IndicadorResponse;
import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;



@Component
public class IndicadorUseCaseModelToPresentationMapper {
	private static final String DATE_FORMAT = "dd-MM-yyyy";
	DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
	
	public IndicadorResponse toPresentation(IndicadorUseCaseModel indicador) {
		IndicadorResponse response = new IndicadorResponse();
		response.nombre(indicador.nombre);
		response.codigo(indicador.codigo);
		response.unidad(indicador.unidadMedida);
		response.valor(indicador.series.get(0).getValor());
		response.fecha(formatter.format(indicador.series.get(0).getFecha()));
		return response;
	}
}
