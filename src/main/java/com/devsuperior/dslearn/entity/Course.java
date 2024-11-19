package com.devsuperior.dslearn.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    public Course() {
    }

    public Course(String imgGrayUri, String imgUri, String name, Long id) {
        this.imgGrayUri = imgGrayUri;
        this.imgUri = imgUri;
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgGrayUri() {
        return imgGrayUri;
    }

    public void setImgGrayUrl(String imgGrayUrl) {
        this.imgGrayUri = imgGrayUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
