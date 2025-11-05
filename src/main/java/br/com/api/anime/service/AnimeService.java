package br.com.api.anime.service;

import br.com.api.anime.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L, "Naruto"), new Anime(2L, "Bleach"));

    public List<Anime> findAll() {
        return animes;
    }

    public Anime findById(Long id) {
       return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }
}
