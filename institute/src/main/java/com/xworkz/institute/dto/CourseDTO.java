package com.xworkz.institute.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CourseDTO {
	private int Id;
	private String name;
	private Double fees;
	private LocalDate startDate;
	private Boolean freeCourse;

}
