package com.workincode.indicador.resource.datasource.indicador.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.workincode.indicador.resource.datasource.indicador.IndicadorDataSource;
import com.workincode.indicador.resource.datasource.indicador.entity.Indicador;

/**
 * Esta clase realiza las llamdas del api externo en las consultas de los
 * indicadores
 * 
 * @author Eric Rosa Lizama
 * @since 09-06-2021
 * @version 0.0.1
 *
 */
@Component
public class IndicadorDataSourceImpl implements IndicadorDataSource {

	private final String url;
	
	@Autowired
	RestTemplate restTemplate;
	
	public IndicadorDataSourceImpl(
			@Value("${gateway.url.indicador}") String url,
			RestTemplateBuilder restTemplate) {
		this.url = url;
		this.restTemplate = restTemplate.build();
	}

	@Override
	public Indicador obtenerIndicador(String tipoIndicador, String fecha) {
		Map<String, String> uriParam = new HashMap<>();
		uriParam.put("tipo_indicador", tipoIndicador);
		uriParam.put("fecha", fecha.toString());
		ResponseEntity<Indicador> responseEntity = restTemplate
				.getForEntity(url, Indicador.class, uriParam);

		Indicador indicador = (Indicador) responseEntity.getBody();

		return Optional.ofNullable(indicador).orElse(new Indicador());
	}

}
