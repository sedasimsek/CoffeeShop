
public class Main {
	
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		
		customerManager.save(new Customer(1,"seda","şimşek","27.04.1998","123456789"));
	}

}
