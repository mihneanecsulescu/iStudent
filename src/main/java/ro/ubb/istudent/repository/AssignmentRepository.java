package ro.ubb.istudent.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.ubb.istudent.domain.Assignment;

public interface AssignmentRepository extends MongoRepository<Assignment, Integer> {
}
