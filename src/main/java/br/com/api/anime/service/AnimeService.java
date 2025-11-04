package br.com.api.anime.service;

import br.com.api.anime.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> findAll() {
        return List.of(new Anime(1L, "Naruto"), new Anime(2L, "Bleach"));
    }
}
