package ro.ubb.istudent.domain;

import java.util.ArrayList;

public class Teacher {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
    private ArrayList<Course> courses;
    private ArrayList<Feedback> feedbacks;

    public Teacher(){}

    public Teacher(Integer id, String firstname, String lastname, String email, Integer age, ArrayList<Course> courses, ArrayList<Feedback> feedbacks) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.courses = courses;
        this.feedbacks = feedbacks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                ", feedbacks=" + feedbacks +
                '}';
    }
}
