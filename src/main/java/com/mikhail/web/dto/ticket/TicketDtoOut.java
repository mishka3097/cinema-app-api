package com.mikhail.web.dto.ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketDtoOut {

    private Long row;
    private Long place;
    private LocalDateTime movieDate;
    private String movieName;

}
