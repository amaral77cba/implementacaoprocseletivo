CREATE TABLE artista_album (
    iden_artista_album BIGSERIAL PRIMARY KEY,
    iden_artista BIGINT NOT NULL,
    iden_album BIGINT NOT NULL,

    CONSTRAINT fk_artista_album_artista
        FOREIGN KEY (iden_artista)
        REFERENCES artista (iden_artista),

    CONSTRAINT fk_artista_album_album
        FOREIGN KEY (iden_album)
        REFERENCES album (iden_album),

    CONSTRAINT uk_artista_album
        UNIQUE (iden_artista, iden_album)
);