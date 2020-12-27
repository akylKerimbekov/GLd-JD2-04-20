package dev.akyl.academy.domain.role.adapter;

import dev.akyl.academy.domain.role.Role;

public interface RoleRepository {
    Role createRole(Role role);
}
