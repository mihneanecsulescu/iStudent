package ro.ubb.istudent.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.ArrayList;


@Document
public @Data class Assignment {

    @Id
    private Integer id;
    private String name;
    private String description;
    private Integer duration;
    private Integer grade;

    @DBRef(lazy = true)
    private ArrayList<Attachment> attachments;

    private String type;

    public Assignment(Integer id, String name, String description, Integer duration, Integer grade, ArrayList<Attachment> attachments, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.grade = grade;
        this.attachments = attachments;
        this.type = type;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public ArrayList<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float gradePercent(){
        return (this.grade*100.0f)/10;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", grade=" + grade +
                ", attachments=" + attachments +
                ", type='" + type + '\'' +
                '}';
    }
}
