package test.com;

import java.util.Map;

public class Institute {
	private Map <String ,String> students;

	public Institute(Map<String, String> students) {
		this.students = students;
	}
	public void details() {
		for(Map.Entry<String, String> entry : students.entrySet()) {
			System.out.println("Student Id ->" +entry.getKey()+","+ "CourseName ->"+entry.getValue());
			
		}
	}
	
	

}
