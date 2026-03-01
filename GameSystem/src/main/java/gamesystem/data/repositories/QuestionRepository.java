package gamesystem.data.repositories;

import gamesystem.data.models.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository <Question, String> {
}
