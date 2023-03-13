package com.sample.springbootsecurity.repository;

import java.util.Optional;

import com.sample.springbootsecurity.models.ERole;
import com.sample.springbootsecurity.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
