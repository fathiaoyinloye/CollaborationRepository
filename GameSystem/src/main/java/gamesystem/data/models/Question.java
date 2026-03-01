package gamesystem.data.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
public class Question {
    private String id;
    private String description;
    private List<Option> options;
    private LocalDateTime time;

}
