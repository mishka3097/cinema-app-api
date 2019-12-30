package com.mikhail.dto.movieSession;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovieSessionDtoOut {

    private LocalDate movieDate;

    private Long movieId;
}
