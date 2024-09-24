// domain 쪽 entity 클래스 선언 시, entity 에 생성 시간을 timestamp 로 찍어내 생성 시점 추적을 위한 추상 클래스
package com.restapi.project_AI_diary_backend.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @NotNull
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}