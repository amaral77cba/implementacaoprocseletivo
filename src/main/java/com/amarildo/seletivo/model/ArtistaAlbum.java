package com.amarildo.seletivo.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "artista_album",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_artista_album",
                        columnNames = { "iden_artista", "iden_album" }
                )
        }
)
public class ArtistaAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iden_artista_album")
    private Long idenArtistaAlbum;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "iden_artista",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_artista_album_artista")
    )
    private Artista artista;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "iden_album",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_artista_album_album")
    )
    private Album album;

    public ArtistaAlbum() {
    }

    public ArtistaAlbum(Artista artista, Album album) {
        this.artista = artista;
        this.album = album;
    }

    public Long getIdenArtistaAlbum() {
        return idenArtistaAlbum;
    }

    public void setIdenArtistaAlbum(Long idenArtistaAlbum) {
        this.idenArtistaAlbum = idenArtistaAlbum;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}

