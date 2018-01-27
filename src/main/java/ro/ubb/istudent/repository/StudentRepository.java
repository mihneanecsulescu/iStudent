package ro.ubb.istudent.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.CrudRepository;
import ro.ubb.istudent.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    @Override
    Student findOne(String id);

    @Override
    void delete(Student deleted);
}
