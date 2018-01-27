package ro.ubb.istudent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubb.istudent.domain.Student;
import ro.ubb.istudent.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(method=RequestMethod.GET, value="/students")
    public Iterable<Student> student() {
        return studentRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/students")
    public String save(@RequestBody Student student) {
        studentRepository.save(student);

        return student.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/students/{id}")
    public Student show(@PathVariable String id) {
        return studentRepository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
    public Student update(@PathVariable String id, @RequestBody Student student) {
        Student stud = studentRepository.findOne(id);
        if(student.getFirstname() != null)
            stud.setFirstname(student.getFirstname());
        if(student.getLastname() != null)
            stud.setLastname(student.getLastname());
        if(student.getEmail() != null)
            stud.setEmail(student.getEmail());
        if(student.getAge() != null)
            stud.setAge(student.getAge());
        if(student.getGender() != null)
            stud.setGender(student.getGender());
        if(student.getCountryOfResidence() != null)
            stud.setCountryOfResidence(student.getCountryOfResidence());
        if(student.getYearOfStudy() != null)
            stud.setYearOfStudy(student.getYearOfStudy());
        studentRepository.save(stud);
        return stud;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
    public String delete(@PathVariable String id) {
        Student student = studentRepository.findOne(id);
        studentRepository.delete(student);

        return "student deleted";
    }
}