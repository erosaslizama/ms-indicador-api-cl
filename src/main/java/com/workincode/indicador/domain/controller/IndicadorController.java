package com.workincode.indicador.domain.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.workincode.indicador.api.api.IndicadorApiDelegate;
import com.workincode.indicador.api.model.IndicadorRequest;
import com.workincode.indicador.api.model.IndicadorResponse;
import com.workincode.indicador.domain.controller.mapper.IndicadorUseCaseModelToPresentationMapper;
import com.workincode.indicador.domain.impl.IndicadorUseCaseImpl;
import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;

@RestController
public class IndicadorController implements IndicadorApiDelegate {

	private final IndicadorUseCaseModelToPresentationMapper indicadorUseCaseModelToPresentationMapper;
	private final IndicadorUseCaseImpl indicadorUseCaseImpl;

	public IndicadorController(
			IndicadorUseCaseModelToPresentationMapper indicadorUseCaseModelToPresentationMapper,
			IndicadorUseCaseImpl indicadorUseCaseImpl) {
		this.indicadorUseCaseModelToPresentationMapper = indicadorUseCaseModelToPresentationMapper;
		this.indicadorUseCaseImpl = indicadorUseCaseImpl;
	}

	public ResponseEntity<IndicadorResponse> indicadorPost(
			IndicadorRequest indicadorRequest) {
		
		IndicadorUseCaseModel model = indicadorUseCaseImpl.getIndicador(
				indicadorRequest.getTipo(), indicadorRequest.getFecha());
		
		indicadorUseCaseModelToPresentationMapper.toPresentation(model);

		return ResponseEntity.ok(indicadorUseCaseModelToPresentationMapper
				.toPresentation(model));

	}

}