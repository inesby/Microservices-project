package ines_seif.students;

public class student {
	
	private String id ;
	private String name ;
	private int score ;
	public student(String id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public student() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
