package com.workincode.indicador.resource.repository.indicador.entity;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable implements Persistable<UUID> {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    @JsonProperty(value = "_id", access = JsonProperty.Access.READ_ONLY)
    private UUID id;
    
    @CreatedDate
    @Column(name = "created", nullable = false, insertable = true, updatable = false, columnDefinition = "TIMESTAMP NOT NULL")
    private Instant fechaCreacion;

    @CreatedDate
    @Column(name = "modified", nullable = true, insertable = true, updatable = true, columnDefinition = "TIMESTAMP NOT NULL")
    private Instant fechaModificacion;

    @Override
    public UUID getId() {
        return id;
    }

    /**
	 * @return the fechaCreacion
	 */
	public Instant getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Instant getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Instant fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	

    protected Auditable() {
    }

}
