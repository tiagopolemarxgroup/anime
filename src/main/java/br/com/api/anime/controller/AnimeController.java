package br.com.api.anime.controller;

import br.com.api.anime.domain.Anime;
import br.com.api.anime.service.AnimeService;
import br.com.api.anime.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/animes")
public class AnimeController {

    private final AnimeService animeService;
    private final DateUtil dateUtil;


    @GetMapping
    public List<Anime> findAll(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.findAll();

    }

}
