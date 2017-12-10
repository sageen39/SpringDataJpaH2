package com.aquarii.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aquarii.domain.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, String>{

}
