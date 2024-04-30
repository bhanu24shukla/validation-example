package com.javatechie.validation.dao;

import com.javatechie.validation.entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, CriteriaBuilder.In> {
    User findByUserId(int id);
}
