package com.amarildo.seletivo.model.dto;

public class AlbumResponseDTO {

        private Long idenAlbum;
        private String descricaoAlbum;

        private Long idenTipoAlbum;
        private String descricaoTipoAlbum;

        public AlbumResponseDTO() {}

        public AlbumResponseDTO(Long idenAlbum, String descricaoAlbum, Long idenTipoAlbum, String descricaoTipoAlbum) {
            this.idenAlbum = idenAlbum;
            this.descricaoAlbum = descricaoAlbum;
            this.idenTipoAlbum = idenTipoAlbum;
            this.descricaoTipoAlbum = descricaoTipoAlbum;
        }

    public Long getIdenAlbum() {
        return idenAlbum;
    }

    public void setIdenAlbum(Long idenAlbum) {
        this.idenAlbum = idenAlbum;
    }

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

    public String getDescricaoTipoAlbum() {
        return descricaoTipoAlbum;
    }

    public void setDescricaoTipoAlbum(String descricaoTipoAlbum) {
        this.descricaoTipoAlbum = descricaoTipoAlbum;
    }
}
