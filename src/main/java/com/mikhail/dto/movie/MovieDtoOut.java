package com.mikhail.dto.movie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDtoOut {

    private Long movieId;
    private String name;
    private String producer;
}