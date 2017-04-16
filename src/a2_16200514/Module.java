package a2_16200514;

public class Module {
	private String code;
	private String title;
	private Instructor instructor;
	private Student[] students = new Student[80];
	private double MAX_NUMBER_STUDENTS = 80;
	private int num_students = 0;
	
	public Module(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setInstructor(Instructor i) {
		this.instructor = i;
	}
	
	public boolean addStudent(Student s) {
		boolean confirm = false;
		if (num_students < MAX_NUMBER_STUDENTS) {
			students[num_students] = s;
			num_students ++;
			confirm = true;
		}
		return confirm;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("code: " + this.code + 
				"\ntitle: " + this.title);
		if (this.instructor == null)
			sb.append("\ninstructor: not set");
		else
			sb.append("\ninstructor: " + instructor.getName());
		sb.append("\nstudents:\n\t");
		if (students[0] == null)
			sb.append("none\n");
		else {
			for (Student student : students) {
				if (student != null) 
				sb.append(student.getName() + "\n\t");
			}
		}		
		return sb.toString();
	}
}
