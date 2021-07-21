package com.workincode.indicador.resource.repository.indicador.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workincode.indicador.domain.indicador.model.IndicadorUseCaseModel;
import com.workincode.indicador.resource.datasource.indicador.impl.IndicadorDataSourceImpl;
import com.workincode.indicador.resource.repository.indicador.IndicadorH2Repository;
import com.workincode.indicador.resource.repository.indicador.IndicadorRepository;
import com.workincode.indicador.resource.repository.indicador.entity.IndicadorRepositoryEntity;
import com.workincode.indicador.resource.repository.indicador.mapper.IndicadorToRepositoryMapper;
import com.workincode.indicador.resource.repository.indicador.mapper.IndicadorToUseCaseMapper;

@Repository
public class IndicadorRepositoryImpl implements IndicadorRepository {

	private final IndicadorDataSourceImpl indicadorDataSourceImpl;
	private final IndicadorToRepositoryMapper indicadorToRepositoryMapper;
	private final IndicadorToUseCaseMapper indicadorToUseCaseMapper;

	@Autowired
	IndicadorH2Repository indicadorH2Repository;

	public IndicadorRepositoryImpl(
			IndicadorDataSourceImpl indicadorDataSourceImpl,
			IndicadorToRepositoryMapper indicadorToRepositoryMapper,
			IndicadorToUseCaseMapper indicadorToUseCaseMapper) {
		this.indicadorDataSourceImpl = indicadorDataSourceImpl;
		this.indicadorToRepositoryMapper = indicadorToRepositoryMapper;
		this.indicadorToUseCaseMapper = indicadorToUseCaseMapper;
	}

	@Override
	public IndicadorUseCaseModel getIndicador(String tipo, String fecha)
			throws ParseException {

		Date date1 = formatDate(fecha, "dd-MM-yyyy", "yyyy-MM-dd HH:mm:ss");

		Optional<IndicadorRepositoryEntity> indicadorRepository = indicadorH2Repository
				.findByIndicador(tipo, date1);

		return indicadorRepository.map(c -> indicadorToUseCaseMapper.map(c))
				.orElseGet(()->getF(tipo, fecha));


	}

	private IndicadorUseCaseModel getF(String tipo, String fecha) {
		IndicadorRepositoryEntity indicadorRepository = indicadorToRepositoryMapper
				.map(indicadorDataSourceImpl.obtenerIndicador(tipo, fecha));
		indicadorH2Repository.save(indicadorRepository);
		return indicadorToUseCaseMapper.map(indicadorRepository);
	}

	public Date formatDate(String date, String initDateFormat,
			String endDateFormat) throws ParseException {

		Date initDate = new SimpleDateFormat(initDateFormat).parse(date);
		SimpleDateFormat formatter = new SimpleDateFormat(endDateFormat);
		Date finDate = new SimpleDateFormat(endDateFormat)
				.parse(formatter.format(initDate));
		return finDate;
	}
}