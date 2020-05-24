package com.example.springwebservice.domain.rent;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDX;

    private Integer CABINET_IDX;

    private Integer USER_IDX;

    private LocalDateTime START_TIME;
    private LocalDateTime END_TIME;

    @Builder
    public Rent(Integer IDX,Integer CABINET_IDX,Integer USER_IDX, LocalDateTime START_TIME, LocalDateTime END_TIME) {
        this.IDX=IDX;
        this.CABINET_IDX = CABINET_IDX;
        this.USER_IDX = USER_IDX;
        this.START_TIME=START_TIME;
        this.END_TIME=END_TIME;
    }
}