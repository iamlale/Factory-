import java.lang.*;
public class Employee {
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items;
	private Payroll payroll;
	
	public Employee (int id, String name, String surname, int workHour, int speed) {
		
		Item[] items=new Item[workHour*speed];
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.workHour=workHour;
		this.speed=speed;
		this.items=items;
		
	}
	
	public  Item[] startShift() {
		
		for(int i=0; i<workHour*speed; i++) {
			items[i]=new Item ((int) Math.random()*100);
		}
		return items;
	}
	
	public Payroll endShift() {
		Payroll payroll=new Payroll(workHour, workHour*speed);
		return payroll;
	}
	
	public String toString() {
		return "This is the employee with id "+id+" speed "+speed+". The work hour is "+workHour+" and the produced item count is "+workHour*speed+".";
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	public int getWorkHour() {
		return workHour;
	}
	
	public void setWorkHour(int workHour) {
		this.workHour=workHour;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items=items;
	}
	
	public Payroll getPayroll() {
		return payroll;
	}
	
	public void setPayroll(Payroll payroll) {
		this.payroll=payroll;
	}

}
