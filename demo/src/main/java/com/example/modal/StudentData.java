package com.example.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_master")
public class StudentData {
	   	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long id;
	    @Column(name="Name")
	    @NonNull private String name;
	    @Column(name="roll")
	    @UniqueElements @NonNull private String roll;
	    @Column(name="age")
	    @NonNull private String age;
	    @Column(name="gender")
	    @NonNull private String gender;
	    
	   

}
