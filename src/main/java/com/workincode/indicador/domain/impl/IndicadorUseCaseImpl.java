package com.workincode.indicador.domain.impl;

import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.workincode.indicador.domain.IndicadorUseCase;
import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;
import com.workincode.indicador.resource.repository.indicador.impl.IndicadorRepositoryImpl;

@Service
public class IndicadorUseCaseImpl implements IndicadorUseCase {

	private final IndicadorRepositoryImpl indicadorRepositoryImpl;

	public IndicadorUseCaseImpl(
			IndicadorRepositoryImpl indicadorRepositoryImpl) {
		this.indicadorRepositoryImpl = indicadorRepositoryImpl;
	}

	@Override
	public IndicadorUseCaseModel getIndicador(String tipo, String fecha) {
		IndicadorUseCaseModel indicadorUseCaseModel = null;
		try {
			 indicadorUseCaseModel = indicadorRepositoryImpl.getIndicador(tipo, fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return indicadorUseCaseModel;

	}

}