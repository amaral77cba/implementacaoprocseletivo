package com.amarildo.seletivo.model.dto;

public class ArtistaAlbumListDTO {

    private Long idenArtistaAlbum;
    private Long idenArtista;
    private String nomeArtista;
    private Long idenAlbum;
    private String descricaoAlbum;

    public ArtistaAlbumListDTO(Long idenArtistaAlbum, Long idenArtista, String nomeArtista, Long idenAlbum, String descricaoAlbum) {
        this.idenArtistaAlbum = idenArtistaAlbum;
        this.idenArtista = idenArtista;
        this.nomeArtista = nomeArtista;
        this.idenAlbum = idenAlbum;
        this.descricaoAlbum = descricaoAlbum;
    }

    public Long getIdenArtistaAlbum() {
        return idenArtistaAlbum;
    }

    public Long getIdenArtista() {
        return idenArtista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public Long getIdenAlbum() {
        return idenAlbum;
    }

    public String getDescricaoAlbum() {
        return descricaoAlbum;
    }
}
