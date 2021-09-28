package com.info.favorite.models;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Position {

    private BigDecimal lat;
    private BigDecimal lng;

}
