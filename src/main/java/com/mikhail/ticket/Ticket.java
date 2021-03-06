package com.mikhail.ticket;

import com.mikhail.crudBase.BaseEntity;
import com.mikhail.movieSession.MovieSession;
import com.mikhail.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ticket")
@Entity
@NamedEntityGraph(
        name = "Ticket.full",
        attributeNodes = {
                @NamedAttributeNode("user"),
                @NamedAttributeNode(value = "movieSession", subgraph = "movieSession.movie")
        },
        subgraphs = {
                @NamedSubgraph(
                        name = "movieSession.movie",
                        attributeNodes = @NamedAttributeNode("movie")
                )
        }
)
@NamedEntityGraph(
        name = "Ticket.movieSession",
        attributeNodes = @NamedAttributeNode(value = "movieSession", subgraph = "movieSession.movie"),
        subgraphs = {
                @NamedSubgraph(
                        name = "movieSession.movie",
                        attributeNodes = @NamedAttributeNode("movie")
                )
        }
)
public class Ticket extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_session_id")
    private MovieSession movieSession;

    private Long range;

    private Long place;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
