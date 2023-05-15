package application;
import java.util.Comparator;

public class NameSorter implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getCustomerName().compareToIgnoreCase(o2.getCustomerName());
	}
	
	
}
