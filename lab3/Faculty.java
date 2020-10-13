package lab3;

public class Faculty extends Employee{
	
	public enum Level {
		AS, AO, FU, NA;
	}
	
	private Level fLvl; //another way to declare the var is this way
	private Education eLvl; //eLvl is an Instance of the Education object 
	
	
	public Faculty() { 
		super(); //using the parent's default constructor
		this.fLvl = Level.NA; //we are retrieving the value NA from the Level class
		this.eLvl = new Education();
		
	}
	
	public Faculty (Level fLvl, String firstName, String lastName, String id, String degree, String major, int research) {
		super(firstName, lastName, id);
		this.fLvl = fLvl;
		this.eLvl = new Education(degree, major, research);
	}

	public Level getfLvl() {
		return fLvl;
	}

	public void setfLvl(Level fLvl) {
		this.fLvl = fLvl;
	}

	public Education geteLvl() {
		return eLvl;
	}

	public void seteLvl(Education eLvl) {
		this.eLvl = eLvl;
	}

	public double monthlyEarning() {
		if (fLvl == Level.AS) {
			return FACULTY_MONTHLY_SALARY; 
		}
		if(fLvl == Level.AO) {
			return 1.5 * FACULTY_MONTHLY_SALARY;
		}
		if(fLvl== Level.FU) {
			return 2.0 * FACULTY_MONTHLY_SALARY;
		}
		else {
			return 0;
		}
	}
	
	
	public String toString() {
		//super.toString() takes the parameters from the public faculty method
		return super.toString() + "\n" +fLvl + " Professor " + "\nmonthly Salary: " + monthlyEarning() 
		+ "\nDegree: " + eLvl.getDegree() + "\nMajor: " + eLvl.getMajor() +"\nReasearch: " + eLvl.getResearch() ;
	}

}
