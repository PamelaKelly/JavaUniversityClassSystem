package a2_16200514;

public class Student extends Person {
	private String programme;
	private Module[] modules = new Module[12];
	private static double MAX_NUMBER_MODULES = 12;
	private int num_modules = 0;
	
	public Student (Name name, Address address, String programme) {
		super(name, address);
		this.programme = programme;
	}
	
	public boolean addModule(Module m) {
		boolean confirm = false;
		if (num_modules < MAX_NUMBER_MODULES) {
			modules[num_modules] = m;
			num_modules ++;
			confirm = true;
		}
		return confirm;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		//super gives name and address from super class - person
		sb.append(super.toString() + "\n" + "programme: " + this.programme);
		if (modules[0] == null) {
			sb.append("\n" + "modules:\n\tnone\n");
		}
		//putting the loop in the else so that we don't loop through the array if the first element is null
		//could make this even more efficient by using a while loop
		else {
			sb.append("\nmodules:\n");
			for (Module module : modules) {
				if (module != null) {
					sb.append("\t" + module.getCode() + " (" + module.getTitle() + ")\n");
				}
			}
		}
		return sb.toString();
	}
}
