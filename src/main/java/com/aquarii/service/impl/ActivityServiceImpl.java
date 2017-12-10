package com.aquarii.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquarii.domain.Activity;
import com.aquarii.repository.ActivityRepository;
import com.aquarii.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	ActivityRepository activityRepository;
	
	@Override
	public Activity save(Activity activity) {
	
		return this.activityRepository.save(activity);
		
	}

}
