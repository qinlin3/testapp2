package com.cn.scitc.testapp2.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Course {
    private int id;
    private String name;
    private BigDecimal courseScore;
    private int courseTime;
    private String courseType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "courseScore", nullable = false, precision = 1)
    public BigDecimal getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(BigDecimal courseScore) {
        this.courseScore = courseScore;
    }

    @Basic
    @Column(name = "courseTime", nullable = false)
    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }

    @Basic
    @Column(name = "courseType", nullable = true, length = 20)
    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (courseTime != course.courseTime) return false;
        if (name != null ? !name.equals(course.name) : course.name != null) return false;
        if (courseScore != null ? !courseScore.equals(course.courseScore) : course.courseScore != null) return false;
        if (courseType != null ? !courseType.equals(course.courseType) : course.courseType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (courseScore != null ? courseScore.hashCode() : 0);
        result = 31 * result + courseTime;
        result = 31 * result + (courseType != null ? courseType.hashCode() : 0);
        return result;
    }
}
