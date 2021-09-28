package com.info.favorite.service;

import com.info.favorite.models.Favorite;
import com.info.favorite.repository.FavoriteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService implements SystemEntityOperations<Favorite, String> {

    private FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    public Favorite create(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public Favorite getById(String id) {
        return favoriteRepository.findById(id).orElse(new Favorite());
    }

    public List<Favorite> getAll() {
        return favoriteRepository.findAll();
    }

    public void delete(String id) {
        favoriteRepository.deleteById(id);
    }

}
