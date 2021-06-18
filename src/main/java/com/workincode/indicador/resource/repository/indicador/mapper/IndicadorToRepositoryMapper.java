package com.workincode.indicador.resource.repository.indicador.mapper;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.workincode.indicador.resource.datasource.indicador.entity.Indicador;
import com.workincode.indicador.resource.repository.indicador.entity.IndicadorRepositoryEntity;
import com.workincode.indicador.resource.repository.indicador.entity.SerieRepositoryEntity;

@Component
public class IndicadorToRepositoryMapper {

	public IndicadorRepositoryEntity map(Indicador indicador) {
		return IndicadorRepositoryEntity.builder()
				.codigo(indicador.codigo)
				.nombre(indicador.nombre)
				.unidadMedida(indicador.unidadMedida)
				.series(indicador.getSeries().stream()
						.map(c -> SerieRepositoryEntity.builder().valor(c.valor)
								.fecha(c.fecha).build())
						.collect(Collectors.toList()))
				.build();
	}

}