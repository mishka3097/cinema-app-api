package com.mikhail.web.dto.ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketUserDtoOut {

    private Long range;
    private Long place;
    private String username;
    private String movieDate;
    private String movieName;
}
