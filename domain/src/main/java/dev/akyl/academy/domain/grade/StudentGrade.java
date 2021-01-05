package dev.akyl.academy.domain.grade;

import dev.akyl.academy.domain.user.User;

import java.util.Map;
import java.util.Objects;

public class StudentGrade {
    private User student;
    private Map<String, Integer> grade;

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Map<String, Integer> getGrade() {
        return grade;
    }

    public void setGrade(Map<String, Integer> grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return Objects.equals(student, that.student) &&
                Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, grade);
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "student=" + student +
                ", grade=" + grade +
                '}';
    }
}
