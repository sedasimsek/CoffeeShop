
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super(customerCheckService);
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not save.");
		}
		
	}
	
}
