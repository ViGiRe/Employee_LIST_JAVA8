package com.model.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.model.Employee.Employee;

public class Test {
	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "Asha negi", 24, "female", "HR", 34000, 2018);
		Employee e2=new Employee(2, "Dipti Aware", 34, "female", "Marketing", 64000, 2019);
		Employee e3=new Employee(3, "Sneha Sharma", 44, "female", "HR", 32400, 2016);
		Employee e4=new Employee(4, "Aman Mandeep", 64, "male", "IT", 24000, 2018);
		Employee e5=new Employee(5, "Ajit Mehta", 44, "male", "Research", 98000, 2018);
		Employee e6=new Employee(6, "Shubham Jeurkar", 23, "male", "BD", 64000, 2014);	
		Employee e7=new Employee(7, "Preeti Shah", 23, "female", "BD", 84000, 2018);
		Employee e8=new Employee(8, "Avinash Bapat",27, "male", "Marketing", 24000, 2012);
		Employee e9=new Employee(9, "Shubham Singh", 30, "male", "BD", 34000, 2016);
		Employee e10=new Employee(10, "Jiwan Prakash", 25, "male", "Marketing", 32000, 2018);
		
		List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
		
		//Query 1 
		System.out.println("find out the number of male and female employees");
		Map<String, Long> numberofmalefemale= emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(numberofmalefemale);
		
		System.out.println();
		
		//Query 2 
		System.out.println("print all the distinct departments in organisation");
		emp.stream().map(Employee::getDept).distinct().forEach(System.out::println);
		
		System.out.println();
		
		//Query 3
		System.out.println("age below 30 of all the Employee");
		emp.stream().filter(n ->n.getAge()<30).forEach(System.out::println);
		
		System.out.println();
		
		//Query 4
		System.out.println("average age of male and female empoyee");
		Map<String, Double> avgagemf=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgagemf);
		
		System.out.println();
		
		//Query 5
		System.out.println("Details of highest paid employee");
		Optional<Employee>	highestpaidemp=emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestpaidemp.get().getName());
		
		System.out.println();
		
		//Query 5
		System.out.println("Details of lowest paid employee");
		Optional<Employee> minsal=emp.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(minsal.get().getName());
		
		System.out.println();
		//Query 5
		System.out.println("get the name of employes who have joined after 2016");
		
		
	}
	

}
