package com.aquarii.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquarii.domain.Activity;
import com.aquarii.domain.Exercise;
import com.aquarii.repository.ExerciseRepository;
import com.aquarii.service.ActivityService;
import com.aquarii.service.ExerciseService;


@Service("excerciseService")
public class ExerciseServiceImpl implements ExerciseService{
	
	@Autowired
	private ExerciseRepository exerciseRepository;

	@Autowired
	private ActivityService activityService;
	@Override
	public List<Exercise> findAll() {
		return this.exerciseRepository.findAll();
	}

	@Override
	@Transactional
	public Exercise add(Exercise exercise) {
		
		Iterator<Activity> activities = exercise.getActivity().iterator();
		while(activities.hasNext()) {
			Activity activity = activities.next();
			activity.setExercise(exercise);
			this.activityService.save(activity);
		}
	
		
		return this.exerciseRepository.save(exercise);
	}

	@Override
	public Exercise findById(String id) {

		return null;
	
	}
	
	

}
