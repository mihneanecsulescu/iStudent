package ro.ubb.istudent.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.ubb.istudent.domain.Course;

public interface CourseRepository extends MongoRepository<Course, Integer> {
}
