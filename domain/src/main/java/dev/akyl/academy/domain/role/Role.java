package dev.akyl.academy.domain.role;

import dev.akyl.academy.domain.permission.Permission;

import java.util.List;
import java.util.Objects;

public class Role {

    private String code;
    private String detail;
    private List<Permission> permissionList;

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

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(code, role.code) &&
                Objects.equals(detail, role.detail) &&
                Objects.equals(permissionList, role.permissionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, detail, permissionList);
    }

    @Override
    public String toString() {
        return "Role{" +
                "code='" + code + '\'' +
                ", detail='" + detail + '\'' +
                ", permissionList=" + permissionList +
                '}';
    }
}
