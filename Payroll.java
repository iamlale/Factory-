
public class Payroll {
	private int workHour;
	private int itemCount;
	
	public Payroll (int workHour, int itemCount) {
		this.workHour=workHour;
		this.itemCount=itemCount;
		
	}
	
	public int calculateSalary() {
		return workHour*3+itemCount*2;
		
	}
	
	public String toString() {
		return "The work hour is "+ workHour +"and the produced item count is "+ itemCount ;
		
	}
	
	public int getWorkHour() {
		return workHour;
	}
	
	public void setWorkHour(int workHour) {
		this.workHour=workHour;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount=itemCount;
	}

	
}
