package com.amarildo.seletivo.repository;

import com.amarildo.seletivo.model.Album;
import com.amarildo.seletivo.model.Artista;
import com.amarildo.seletivo.model.ArtistaAlbum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaAlbumRepository extends JpaRepository<ArtistaAlbum, Long> {

    boolean existsByArtistaAndAlbum(Artista artista, Album album);

}
