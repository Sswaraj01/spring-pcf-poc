package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modal.StudentData;

@Repository
public interface StudentRepositroy extends JpaRepository<StudentData,Long>  {

	public StudentData findByRoll(String roll);
	
	

}
