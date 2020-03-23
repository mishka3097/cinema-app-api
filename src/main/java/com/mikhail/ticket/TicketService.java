package com.mikhail.ticket;

import com.mikhail.crudBase.BaseSearchService;

public interface TicketService extends BaseSearchService<Ticket, TicketFilter> {

    void addTicket(Ticket ticket);

    Long checkSeats(Long movieSessionId);
}
