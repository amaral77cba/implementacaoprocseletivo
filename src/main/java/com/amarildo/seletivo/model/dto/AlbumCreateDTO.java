package com.amarildo.seletivo.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AlbumCreateDTO {

    @NotBlank
    private String descricaoAlbum;

    @NotNull
    private Long idenTipoAlbum;

    public String getDescricaoAlbum() {
        return descricaoAlbum;
    }

    public void setDescricaoAlbum(String descricaoAlbum) {
        this.descricaoAlbum = descricaoAlbum;
    }

    public Long getIdenTipoAlbum() {
        return idenTipoAlbum;
    }

    public void setIdenTipoAlbum(Long idenTipoAlbum) {
        this.idenTipoAlbum = idenTipoAlbum;
    }
}
