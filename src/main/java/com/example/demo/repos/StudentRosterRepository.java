package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentRoster;

public interface StudentRosterRepository extends JpaRepository<StudentRoster, Integer> {

}
