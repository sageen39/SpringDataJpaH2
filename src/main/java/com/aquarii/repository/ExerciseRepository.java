package com.aquarii.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aquarii.domain.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, String>{

}
