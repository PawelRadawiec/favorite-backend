package com.info.favorite.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Favorite {

    @Id
    private Long id;
    private Position position;
    private Label label;
    private String title;
    private String info;
    private FavoriteOptions options;

}
