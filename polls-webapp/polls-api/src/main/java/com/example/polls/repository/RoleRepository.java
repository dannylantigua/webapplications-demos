package com.example.polls.repository;

import com.example.polls.model.Role;
import com.example.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleName, Long> {

    Optional<Role> findByName(RoleName role);

}
