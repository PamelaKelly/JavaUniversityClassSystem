package a2_16200514;

public class Instructor extends Person {
	private String position;
	private Module module = new Module(null, null);
	
	public Instructor(Name name, Address address, String position) {
		super(name, address);
		this.position = position;
	}
	
	public void setModule(Module m) {
		this.module = m;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(super.toString() + "\nposition: " + this.position);
		if (module.getCode() == null) {
			sb.append("\nmodule: not set\n");
		}
		else {
			sb.append("\nmodule: " + module.getCode() + " (" + module.getTitle() + ")\n");
		}
		return sb.toString();
	}
}
