CREATE TABLE album_imagem (
    iden_album_imagem BIGSERIAL PRIMARY KEY,
    iden_album BIGINT NOT NULL,

    miniokey VARCHAR(200) NOT NULL,
    url_arquivo VARCHAR(200) NOT NULL,
    descricao_arquivo VARCHAR(200),
    content_type VARCHAR(100) NOT NULL,
    tamanho_bytes BIGINT NOT NULL,

    CONSTRAINT fk_album_imagem_album
        FOREIGN KEY (iden_album)
        REFERENCES album (iden_album)
);