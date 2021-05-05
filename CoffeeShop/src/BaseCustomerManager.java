
public abstract class BaseCustomerManager implements CustomerService{

	CustomerCheckService customerCheckService;
	
	public BaseCustomerManager(CustomerCheckService customerCheckService) {
		//super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName() + " " + customer.getLastName() );
		
	}

}
