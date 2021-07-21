package com.workincode.indicador.resource.repository.indicador.mapper;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;
import com.workincode.indicador.domain.indicador.model.SerieUseCaseModel;
import com.workincode.indicador.resource.repository.indicador.entity.IndicadorRepositoryEntity;

@Component
public class IndicadorToUseCaseMapper {

	public IndicadorUseCaseModel map(IndicadorRepositoryEntity indicador) {
		return IndicadorUseCaseModel.builder().codigo(indicador.codigo)
				.nombre(indicador.nombre).unidadMedida(indicador.unidadMedida)
				.series(indicador.getSeries().stream()
						.map(c -> SerieUseCaseModel.builder().valor(c.valor)
								.fecha(c.fecha).build())
						.collect(Collectors.toList()))
				.build();
	}
}