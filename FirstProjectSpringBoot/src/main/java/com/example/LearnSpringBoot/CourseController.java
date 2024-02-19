package com.example.LearnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/Course")
	public List<Courses> li(){
		return Arrays.asList(
				new Courses(1,"Java","Kajal"),
				new Courses(2,"Spring","Aayushman"),
				new Courses(3,"Sql","Tushar")
				);
	}

}
