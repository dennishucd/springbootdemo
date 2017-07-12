package cn.dennishucd.springbootdemo;

public class User {
	private String name;
	private boolean employee;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEmployee() {
		return employee;
	}
	public void setEmployee(boolean employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", employee=" + employee + "]";
	}
}
