package com.info.favorite.controller;

import com.info.favorite.models.Favorite;
import com.info.favorite.service.FavoriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("app/favorite")
public class FavoriteController {
    private FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @PostMapping()
    public ResponseEntity<Favorite> create(@RequestBody Favorite favorite) {
        return new ResponseEntity<>(favoriteService.create(favorite), HttpStatus.OK);
    }

    @GetMapping(value ="/{id}" )
    public ResponseEntity<Favorite> getById(@PathVariable String id) {
        return new ResponseEntity<>(favoriteService.getById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Favorite>> getALl() {
        return new ResponseEntity<>(favoriteService.getAll(), HttpStatus.OK);
    }

}
