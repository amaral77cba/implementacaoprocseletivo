package com.amarildo.seletivo.repository;

import com.amarildo.seletivo.model.TipoAlbum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAlbumRepository extends JpaRepository<TipoAlbum, Long> {
    boolean existsByDescricaoTipoAlbumIgnoreCaseAndIdenTipoAlbumNot(String descricaoTipoAlbum, Long idenTipoAlbum);

    boolean existsByDescricaoTipoAlbumIgnoreCase(String descricaoTipoAlbum);
}
