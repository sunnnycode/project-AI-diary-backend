// entity 에 업데이트 시간을 timestamp 로 찍어내 업데이트 시점 추적을 위한 추상 클래스
package com.restapi.project_AI_diary_backend.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntityUpdate extends BaseEntity {

    @NotNull
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;
}