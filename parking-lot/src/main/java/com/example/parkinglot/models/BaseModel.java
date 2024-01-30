package com.example.parkinglot.models;

import lombok.Builder;

import java.util.Date;
@Builder
public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
