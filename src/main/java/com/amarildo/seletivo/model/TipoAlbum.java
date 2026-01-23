package com.amarildo.seletivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_album")
public class TipoAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iden_tipo_album")
    private Long idenTipoAlbum;

    @Column(name = "descricao_tipo_album")
    private String descricaoTipoAlbum;

    public TipoAlbum() {
    }

    public TipoAlbum(String descricaoTipoAlbum) {
        this.descricaoTipoAlbum = descricaoTipoAlbum;
    }

    public Long getIdenTipoAlbum() {
        return idenTipoAlbum;
    }

    public void setIdenTipoAlbum(Long idenTipoAlbum) {
        this.idenTipoAlbum = idenTipoAlbum;
    }

    public String getDescricaoTipoAlbum() {
        return descricaoTipoAlbum;
    }

    public void setDescricaoTipoAlbum(String descricaoTipoAlbum) {
        this.descricaoTipoAlbum = descricaoTipoAlbum;
    }
}
