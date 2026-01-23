package com.amarildo.seletivo.model.dto;

public class ArtistaAlbumResponseDTO {

    private Long idenArtistaAlbum;
    private Long idenArtista;
    private Long idenAlbum;

    public ArtistaAlbumResponseDTO(Long idenArtistaAlbum, Long idenArtista, Long idenAlbum) {
        this.idenArtistaAlbum = idenArtistaAlbum;
        this.idenArtista = idenArtista;
        this.idenAlbum = idenAlbum;
    }

    public Long getIdenArtistaAlbum() {
        return idenArtistaAlbum;
    }

    public Long getIdenArtista() {
        return idenArtista;
    }

    public Long getIdenAlbum() {
        return idenAlbum;
    }
}
