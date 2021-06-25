package com.workincode.indicador.resource.repository.indicador;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.workincode.indicador.resource.repository.indicador.entity.IndicadorRepositoryEntity;

/**
 * Interface JPA
 * 
 * @author erosas
 *
 */
@Repository
public interface IndicadorH2Repository extends JpaRepository<IndicadorRepositoryEntity, UUID> {
	@Query("SELECT b FROM IndicadorRepositoryEntity b JOIN FETCH b.series as bs WHERE b.codigo = :codigo AND bs.fecha =:fecha")
	Optional<IndicadorRepositoryEntity> findByIndicador(@Param("codigo") String codigo, @Param("fecha") Date fecha);

}