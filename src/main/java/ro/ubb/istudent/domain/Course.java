package ro.ubb.istudent.domain;

import java.util.ArrayList;

public class Course {

    private Integer id;
    private String name;
    private String description;
    private Integer duration; //weeks
    private ArrayList<Material> materials;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Lecture> lectures;
    private String gradingCriteria;
    private ArrayList<Feedback> feedbacks;

    public Course(Integer id, String name, String description, Integer duration, ArrayList<Material> materials, ArrayList<Assignment> assignments, ArrayList<Student> students, ArrayList<Teacher> teachers, ArrayList<Lecture> lectures, String gradingCriteria, ArrayList<Feedback> feedbacks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.materials = materials;
        this.assignments = assignments;
        this.students = students;
        this.teachers = teachers;
        this.lectures = lectures;
        this.gradingCriteria = gradingCriteria;
        this.feedbacks = feedbacks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getGradingCriteria() {
        return gradingCriteria;
    }

    public void setGradingCriteria(String gradingCriteria) {
        this.gradingCriteria = gradingCriteria;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", materials=" + materials +
                ", assignments=" + assignments +
                ", students=" + students +
                ", teachers=" + teachers +
                ", lectures=" + lectures +
                ", gradingCriteria='" + gradingCriteria + '\'' +
                ", feedbacks=" + feedbacks +
                '}';
    }
}
