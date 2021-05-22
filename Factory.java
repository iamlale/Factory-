
public class Factory {
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;
	
	public Factory (String name, int capacity, double itemPrice) {
		this.storage=new Storage(capacity);
		this.name=name;
		this.itemPrice=itemPrice;
		this.employees=new Employee[0];
		this.payrolls=new Payroll[0];
	
	}
	
	public double getRevenue() {
		return Item.numberOfItems*itemPrice;
		
	}
	
	public double getPaidSalaries() {
		double total = 0;
		for(int i=0; i<payrolls.length; i++) {
			total=total+payrolls[i].calculateSalary();
		}
		return total;
		
	}
	
	public void addEmployee(Employee employee) {
		Employee[] newEmployees=new Employee[employees.length+1];
		for (int i=0; i<employees.length; i++) {
			newEmployees[i]=employees[i];
		}
		newEmployees[employees.length]=employee;
		employees=newEmployees;
		
		Item[] itemss=employee.startShift();
		for (int i=0; i<itemss.length; i++) {
			storage.addItem(itemss[i]);
		}	
	}
	
	
	public Employee removeEmployee(int id) {
		Employee temp=null;
		if (employees.length==0) {
			System.out.println("There are no employees!");
		}
		else {
			for (int i=0; i<employees.length; i++) {
				if (employees[i].getId()==id) {
					temp=employees[i];
					employees[i]=employees[employees.length-1];
					employees[employees.length-1]=temp;
				}
			}	
			if (temp==null) {
				System.out.println("Employee does not exist!");
			}
			else {
				Employee [] newEmployees=new Employee[employees.length-1];
				for(int i=0; i<newEmployees.length; i++) {
					newEmployees[i]=employees[i];
				}
				employees=newEmployees;
			
			addPayroll(temp.endShift());
		}
		}
		return temp;
		
	}
	
	private void addPayroll(Payroll payroll) {
		Payroll[] newPayrolls=new Payroll[payrolls.length+1];
		for (int i=0; i<payrolls.length; i++) {
			newPayrolls[i]=payrolls[i];	
		}
		newPayrolls[payrolls.length]=payroll;
		payrolls=newPayrolls;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	public void setEmployees(Employee[] employees) {
		this.employees=employees;
	}
	
	public Storage getStorage() {
		return storage;
	}
	
	public void setStorage(Storage storage) {
		this.storage=storage;
	}
	
	public Payroll[] getPayrolls() {
		return payrolls;
	}
	
	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls=payrolls;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice=itemPrice;
	}


}
