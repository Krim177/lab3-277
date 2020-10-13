package lab3;

public class Staff extends Employee{
	
	private double hourlyRate;
	
	public Staff() {
		super();
	}
	
	public Staff(double hourlyRate, String firstName, String lastName, String id) {
		super(firstName, lastName, id); //invoking the superclass (Employee class) 
		this.hourlyRate = hourlyRate;
		
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double monthlyEarning() {
		return STAFF_MONTHLY_HOURS_WORKED * hourlyRate;
	}
	
	public String toString() {
		String id = super.getId();
		String fn = super.getFname();
		String ln = super.getLname();
	
		return "Last Name: "+ ln+ "\nFirst Name: " + fn + "\nID: " + id + "\nHourly rate: $" 
		+ getHourlyRate() + " \nMonthly Salary: " + monthlyEarning();
				
	}

}
