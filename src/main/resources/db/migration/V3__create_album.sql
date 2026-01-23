CREATE TABLE album (
    iden_album BIGSERIAL PRIMARY KEY,
    descricao_album VARCHAR(200) NOT NULL,
    iden_tipo_album BIGINT NOT NULL,

    CONSTRAINT fk_album_tipo_album
        FOREIGN KEY (iden_tipo_album)
        REFERENCES tipo_album (iden_tipo_album)
);
