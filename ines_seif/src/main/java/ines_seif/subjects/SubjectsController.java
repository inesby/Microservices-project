package ines_seif.subjects;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectsController {
	
	@RequestMapping("/subjects")
	public List<subject> Subjects()
	{
		return Arrays.asList(
				new subject("1", "Microservices", "microservices desription"),
				new subject("2", "Architecture", "architecture desription"),
				new subject("3", "Model driven engineering", "model driven engineering desription")
				);
	}
	
	

}
