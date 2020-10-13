package lab3;

public abstract class Employee implements EmployeeInfo, Comparable<Employee>{
	private String Fname;
	private String Lname; //String, int, double etc. is also a class 
	private String id;
	
	//default constructor
	public Employee () {
		this.Fname = "Frank";
		this.Lname = "Dean";
		this.id = "0902";	
	}
	
	//argument = parameter constructor 
	public Employee(String Fname, String Lname, String id) {
		this.Fname = Fname; 
		this.Lname = Lname;
		this.id = id;
	}
	
	public String toString() {
		return "ID Employee number: " + id + "\nLast name: " + Lname + "\nFirst name " + Fname;
		
	}
	
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		this.Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		this.Lname = lname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public abstract double monthlyEarning(); 
	
	@Override
    public int compareTo(Employee e) {
		//converting the strings into ints so that we can compare them
		if((Integer.valueOf(this.id)) < Integer.valueOf(e.id)){
			return -1; 
		}
		if((Integer.valueOf(this.id)) > Integer.valueOf(e.id)) {
			return 1;
		}
		return 0;
	}
	
	
}

    
    
    
    