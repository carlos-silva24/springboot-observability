package com.github.carlossilva.springbootobservability.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ResourceDto {

    long id;

    @NotNull
    @Size(min = 1, max = 512)
    String code;

    @NotNull
    @Size(min = 1, max = 512)
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
