package com.amarildo.seletivo.model.dto;

import com.amarildo.seletivo.model.Album;
import com.amarildo.seletivo.model.Artista;
import jakarta.validation.constraints.NotNull;

public class ArtistaAlbumCreateDTO {

    @NotNull
    private Long idenArtista;

    @NotNull
    private Long idenAlbum;


    public Long getIdenArtista() {
        return idenArtista;
    }

    public void setIdenArtista(Long idenArtista) {
        this.idenArtista = idenArtista;
    }

    public Long getIdenAlbum() {
        return idenAlbum;
    }

    public void setIdenAlbum(Long idenAlbum) {
        this.idenAlbum = idenAlbum;
    }
}
