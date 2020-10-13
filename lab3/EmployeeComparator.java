package lab3;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e, Employee ee) {
		return -1 * (e.getLname().compareTo(ee.getLname())); //Boolean needs to reversed cause before we were doing 
	}

}
