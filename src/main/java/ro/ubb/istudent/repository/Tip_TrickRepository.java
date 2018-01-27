package ro.ubb.istudent.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.ubb.istudent.domain.Tip_trick;

public interface Tip_TrickRepository extends MongoRepository<Tip_trick, Integer> {
}
