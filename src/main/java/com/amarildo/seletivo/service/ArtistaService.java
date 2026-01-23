package com.amarildo.seletivo.service;

import com.amarildo.seletivo.enumerador.TipoArtista;
import com.amarildo.seletivo.model.Artista;
import com.amarildo.seletivo.repository.ArtistaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista salvar(Artista artista){

        boolean existeArtista = artistaRepository.existsByNomeArtistaIgnoreCase(artista.getNomeArtista());

        if (existeArtista) {
            throw new IllegalArgumentException("Já existe um artista cadastrado com esse nome");
        }

        return artistaRepository.save(artista);
    }

    public Artista buscarPorId(Long idenArtista) {
        return artistaRepository.findById(idenArtista)
                .orElseThrow(() ->
                        new EntityNotFoundException("Artista não encontrado para o id: " + idenArtista));
    }

    public List<Artista> listarTodos() {
        return artistaRepository.findAll();
    }

    public List<Artista> listarPorTipo(TipoArtista tipoArtista) {
        return artistaRepository.findByTipoArtista(tipoArtista);
    }

    public Artista atualizar(Long idenArtista, Artista artistaAtualizado) {
        Artista artistaAux = buscarPorId(idenArtista);

        //verifica se o nome foi alterado
        if (!artistaAux.getNomeArtista().equalsIgnoreCase(artistaAtualizado.getNomeArtista())){
            boolean nomeJahExistente = artistaRepository.existsByNomeArtistaIgnoreCaseAndIdenArtistaNot(artistaAtualizado.getNomeArtista(), idenArtista);

            if (nomeJahExistente){
                throw new IllegalArgumentException("Já existe outro artista cadastrado com esse nome");
            }
        }

        // atualiza todos os campos exceto a PK
        artistaAux.setNomeArtista(artistaAtualizado.getNomeArtista());
        artistaAux.setTipoArtista(artistaAtualizado.getTipoArtista());

        return artistaRepository.save(artistaAux);
    }

    public Artista atualizarv2(Long idenArtista, Artista artistaAtualizado) {
        Artista artistaAux = buscarPorId(idenArtista);

        // verifica se o nome foi alterado
        if (artistaAtualizado.getNomeArtista() != null &&
                !artistaAux.getNomeArtista().equalsIgnoreCase(artistaAtualizado.getNomeArtista())) {

            boolean nomeJahExiste = artistaRepository.existsByNomeArtistaIgnoreCaseAndIdenArtistaNot(artistaAtualizado.getNomeArtista(), idenArtista);

            if (nomeJahExiste) {
                throw new IllegalArgumentException(
                        "Já existe outro artista cadastrado com esse nome");
            }
        }

        BeanUtils.copyProperties(artistaAtualizado, artistaAux, "idenArtista");

        return artistaRepository.save(artistaAux);
    }
}
