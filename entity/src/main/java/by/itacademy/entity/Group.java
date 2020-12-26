package by.itacademy.entity;

import java.util.List;
import java.util.Objects;

public class Group {

    private String code;
    private String detail;
    private User couch;
    private List<User> studentList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public User getCouch() {
        return couch;
    }

    public void setCouch(User couch) {
        this.couch = couch;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(code, group.code) &&
                Objects.equals(detail, group.detail) &&
                Objects.equals(couch, group.couch) &&
                Objects.equals(studentList, group.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, couch, studentList);
    }

    @Override
    public String toString() {
        return "Group{" +
                "code='" + code + '\'' +
                ", detail='" + detail + '\'' +
                ", couch=" + couch +
                ", studentList=" + studentList +
                '}';
    }
}

