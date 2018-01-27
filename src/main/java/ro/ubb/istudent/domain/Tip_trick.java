package ro.ubb.istudent.domain;

public class Tip_trick {
    private Integer id;
    private Teacher teacher;
    private Course course;
    private Student student;
    private Assignment assignment;
    private String advice;
    private String trick;

    public Tip_trick(Integer id, Teacher teacher, Course course, Student student, Assignment assignment, String advice, String trick) {
        this.id = id;
        this.teacher = teacher;
        this.course = course;
        this.student = student;
        this.assignment = assignment;
        this.advice = advice;
        this.trick = trick;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    @Override
    public String toString() {
        return "Tip_trick{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", course=" + course +
                ", student=" + student +
                ", assignment=" + assignment +
                ", advice='" + advice + '\'' +
                ", trick='" + trick + '\'' +
                '}';
    }
}
