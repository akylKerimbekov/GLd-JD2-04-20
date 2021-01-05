package dev.akyl.academy.domain.permission;

import java.util.Objects;

public class Permission {

    private String code;
    private String detail;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(detail, that.detail) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, url);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "code='" + code + '\'' +
                ", detail='" + detail + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
