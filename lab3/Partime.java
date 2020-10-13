package lab3;

public class Partime extends Staff{
	
	private int hrsPerWeek;
	
	public Partime() {
		super();
		this.hrsPerWeek = 0; 
	}
	
	public Partime(String Lname, String Fname, String id, double hourlyRate, int hrsPerWeek) {
		super( hourlyRate, Fname, Lname, id);
		this.hrsPerWeek = hrsPerWeek;
	}
	
	
	public int getHrsPerWeek() {
		return hrsPerWeek;
	}

	public void setHrsPerWeek(int hrsPerWeek) {
		this.hrsPerWeek = hrsPerWeek;
	} 
	
	public int hrsPerMonth(){
		return getHrsPerWeek() * 4;
	}
	
	/**this method calculates the total amount earned per month
	 * @return the total hours worked in a month 
	 */
	public double monthlyEarning() {
		return getHrsPerWeek() * super.getHourlyRate() * 4;
	}
	
	public String toString() {
		return "First Name: " + super.getFname() + "\nLast Name: " + super.getLname() + "\nID: "
				+ super.getId() + "\nHourly rate: " + super.getHourlyRate() + "\nHours worked per week:  " 
				+ getHrsPerWeek() + "\nMonthly Salary: " + hrsPerMonth();
	}

}
