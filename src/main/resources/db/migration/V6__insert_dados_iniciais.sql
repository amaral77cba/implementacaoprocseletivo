
--dados do Tipo Album
INSERT INTO tipo_album (descricao_tipo_album) VALUES ('Álbum de Estúdio');
INSERT INTO tipo_album (descricao_tipo_album) VALUES ('EP');
INSERT INTO tipo_album (descricao_tipo_album) VALUES ('Ao Vivo');
INSERT INTO tipo_album (descricao_tipo_album) VALUES ('Greatest Hits');

--insercao de alguns Artistas
INSERT INTO artista (nome_artista, tipo_artista) VALUES ('Serj Tankian', 'SOLO');
INSERT INTO artista (nome_artista, tipo_artista) VALUES ('Mike Shinoda', 'SOLO');
INSERT INTO artista (nome_artista, tipo_artista) VALUES ('Michel Teló', 'SOLO');
INSERT INTO artista (nome_artista, tipo_artista) VALUES ('Guns N'' Roses', 'BANDA');

--insercao de alguns albuns
-- Serj Tankian
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Harakiri', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Black Blooms', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('The Rough Dog', 1);

-- Mike Shinoda
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('The Rising Tied', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Post Traumatic', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Post Traumatic EP', 2);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Where''d You Go', 1);

-- Michel Teló
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Bem Sertanejo', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Bem Sertanejo - O Show (Ao Vivo)', 3);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Bem Sertanejo - (1ª Temporada) - EP', 2);

-- Guns N' Roses
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Use Your Illusion I', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Use Your Illusion II', 1);
INSERT INTO album (descricao_album, iden_tipo_album) VALUES ('Greatest Hits', 4);
 
