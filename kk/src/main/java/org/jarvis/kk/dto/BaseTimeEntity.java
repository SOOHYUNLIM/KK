package org.jarvis.kk.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

/**
 * BaseTimeEntity
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    @Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime regdate;    
}