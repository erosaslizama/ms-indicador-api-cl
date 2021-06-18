package com.workincode.indicador.config;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workincode.indicador.resource.repository.indicador.IndicadorH2Repository;
import com.workincode.indicador.resource.repository.indicador.entity.IndicadorRepositoryEntity;
import com.workincode.indicador.resource.repository.indicador.entity.SerieRepositoryEntity;

@Configuration
public class LoadDataH2 {

	@Autowired
	IndicadorH2Repository indicadorH2Repository;

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			LocalDateTime dateTime = LocalDateTime.now();
			Instant instant = dateTime.atZone(ZoneId.of("America/Santiago"))
					.toInstant();
			IndicadorRepositoryEntity entidad = new IndicadorRepositoryEntity();
			entidad.setFechaCreacion(instant);
			entidad.setFechaModificacion(instant);
			entidad.setCodigo("uf");
			entidad.setNombre("unidad de fomento (UF)");
			entidad.setUnidadMedida("pesos");

			SerieRepositoryEntity serie = new SerieRepositoryEntity();
			serie.setFechaCreacion(instant);
			serie.setFechaModificacion(instant);
			serie.setFecha(convertToDateViaInstant(LocalDateTime.now()));
			double valor = 29647.6;
			serie.setValor(valor);
			entidad.setSeries(new ArrayList<SerieRepositoryEntity>() {
				{

					add(serie);

				}
			});

			indicadorH2Repository.save(entidad);

		};

	}

	public Date convertToDateViaInstant(LocalDateTime dateToConvert) {
		return java.util.Date
				.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
	}

}
