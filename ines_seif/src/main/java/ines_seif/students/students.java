package ines_seif.students;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ines_seif.subjects.subject;

@RestController
public class students {
	
	
	@RequestMapping("/students")
	public List<student> Students()
	{
		return Arrays.asList(
				new student("1", "Seifeddine Skini", 15),
				new student("2", "Ines Ben Youssef", 12)
				
				);
	}
	
	

}


