package ro.ubb.istudent.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.ubb.istudent.domain.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {
}
