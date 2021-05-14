package com.xml.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.entity.Job;
import com.xml.entity.User;
import com.xml.repository.JobRepository;
import com.xml.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	@Autowired
	JobRepository jobRepo;

	public User createUser(User user) {
		return userRepo.save(user);
	}

	public Job createJob(Job job) {
		return jobRepo.save(job);
	}

	public Optional<Job> getJobById(int jobid) {
		return jobRepo.findById(jobid);
	}

	// get Job by Type
	public List<Job> getJobByType(String type) {
		return jobRepo.findByJobType(type);
	}

	// get Job by Experience
	public List<Job> getJobByExp(int exp) {
		return jobRepo.findByExperience(exp);
	}

	// Filter Job by Country:
	public List<Job> getJobBycountry(String country) {
		return jobRepo.findByCountry(country);
	}

	// Filter Job by Availability
	public List<Job> getJobByavailability(String availability) {
		return jobRepo.findByAvailability(availability);
	}

	// -> Filter Job by Skills:

	// getting user
	public Iterable<User> getAllUser() {
		return userRepo.findAll();
	}

	// getting Job
	public Iterable<Job> getJob(Job job) {
		return jobRepo.findAll();
	}

	public List<Job> createJobs(List<Job> job) {
		return jobRepo.saveAll(job);
	}

//	public List<Job> getJobBySkill(String skill){
//		return jobRepo.findBySkills(skill);
//	}

}
