package ro.ubb.istudent.domain;

public class Student {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer age;
    private Integer yearOfStudy;
    private String countryOfResidence;
    private String gender;

    public Student(){}

    public Student(Integer id, String firstname, String lastname, String email, Integer age, Integer yearOfStudy, String countryOfResidence, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
        this.countryOfResidence = countryOfResidence;
        this.gender = gender;
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

    public Integer getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", yearOfStudy=" + yearOfStudy +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
