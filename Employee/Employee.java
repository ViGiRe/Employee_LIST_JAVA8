package com.model.Employee;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private double salary;
	private int yearofjoining;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, String gender, String dept, double salary, int yearofjoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.salary = salary;
		this.yearofjoining = yearofjoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearofjoining() {
		return yearofjoining;
	}

	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", salary=" + salary + ", yearofjoining=" + yearofjoining + "]";
	}
	
	
	
}
