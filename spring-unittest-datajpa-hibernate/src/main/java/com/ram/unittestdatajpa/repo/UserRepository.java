package com.ram.unittestdatajpa.repo;

import com.ram.unittestdatajpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
