package gamesystem.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Game {

    private List<Player> players;
    private String gamePin;
    private List<Quiz> quiz;
    private Host host;



}
