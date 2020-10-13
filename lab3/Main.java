package lab3;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> payroll = new ArrayList<Employee>();
		
		Employee e1 = new Staff (50,"Paita", "Allen", "123");
		payroll.add(e1); 
		Employee e2 = new Staff (35,"Steven", "Zapata", "456");
		payroll.add(e2);
		Employee e3 = new Staff (40,"Enrique", "Rios", "123");
		payroll.add(e3);
		
		
		
		Employee e4 = new Faculty (Faculty.Level.FU, "Anne", "Johnson", "243", "PH.D", "Engineering", 3);
		payroll.add(e4);
		Employee e5 = new Faculty (Faculty.Level.AO, "William", "Bouris", "791", "PH.D", "English", 1);
		payroll.add(e5);
		Employee e6 = new Faculty (Faculty.Level.AS, "Christopher", "Andrade", "623", "MS", "Physical Education", 0);
		payroll.add(e6);
		
		
		
		Employee e7 = new Partime ("Guzman", "Augusto", "455", 35, 30);
		payroll.add(e7);
		Employee e8 = new Partime ("Depirro", "Martin", "678", 30, 15);
		payroll.add(e8);
		Employee e9 = new Partime ("Aldaco", "Marque", "945", 20, 35);
		payroll.add(e9);

		
		// PART A
		for(Employee e : payroll){
			System.out.println();
			System.out.println(e.toString()); 
			}
		
		//PART B finding the total amount of salary for the part-time workers
		double ttlMonthlyPT =0.00;
		for(Employee e: payroll) {
			if(e instanceof Partime) {
				ttlMonthlyPT += e.monthlyEarning();
			}
		}
		
		System.out.println();
		System.out.println("The total monthly part-time salary for the staff: $" + ttlMonthlyPT);
		System.out.println();
		
		//PART C finding the total amount of salary of all the employees
		double ttlMonthlySalary = 0;
		for(Employee e: payroll) {
			ttlMonthlySalary += e.monthlyEarning();
		}
		
		System.out.println("The total monthly salary for all the part-time staff: $" + ttlMonthlySalary);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.println("Here are the Lists of the Employees according to ascending id number:");
		Collections.sort(payroll);
		for(Employee e : payroll){
			System.out.println();
			System.out.println(e.toString()); 
			}
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.println("Here are the Lists of the Employees according to decending Last Names:");
		
		
		Collections.sort(payroll, new EmployeeComparator()); //create a new obj; comparotor = noun/object 
		for(Employee e : payroll){
			System.out.println();
			System.out.println(e.toString()); 
			}
	
	}

}

