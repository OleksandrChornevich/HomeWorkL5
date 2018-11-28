

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;
    
	
public Employee(String name,int departmentNumber,double salary) {
	this.name=name;
	this.departmentNumber=departmentNumber;
	this.salary=salary;
	
	
}
/////////////////////////////////////////////////////////////
public void setArr(EmployeeArr objArr,Employee obj) {
	objArr.setEmployeeArr(obj);	
	
}
public Employee() {
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDepartmentNumber() {
	return departmentNumber;
}

public void setDepartmentNumber(int departmentNumber) {
	this.departmentNumber = departmentNumber;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Name of Employee: " + this.name + "; DepartmentNumber: " + this.departmentNumber + "; Salary: "+this.salary;
 	
}


	public static void main(String[] args) {
		
		int countlength=5;
		EmployeeArr empArr= new EmployeeArr(countlength);
		
		
		Employee emp1 = new Employee("Bil",5,15000);
		emp1.setArr(empArr,emp1);
		Employee emp2 = new Employee("Ron",5,12000);
		emp2.setArr(empArr,emp2);
		Employee emp3 = new Employee("Dgon",5,17000);
		emp3.setArr(empArr,emp3);
		Employee emp4 = new Employee("Bon",0,18000);
		emp4.setArr(empArr,emp4);
		Employee emp5 = new Employee("Peter",5,7000);
		emp5.setArr(empArr,emp5);

		Employee[] all = empArr.getEmployeeArr();
		
		System.out.println(all[0]);
		System.out.println(all[1]);
		System.out.println(all[2]);
		System.out.println(all[3]);
		System.out.println(all[4]);
		
		System.out.println();
		
//		EmployeeArr empArr2= new EmployeeArr(2);
//		
//		
//		Employee emp4 = new Employee("Bon",0,15000);
//		emp4.setArr(empArr2,emp4);
//		Employee emp5 = new Employee("Peter",4,12000);
//		emp5.setArr(empArr2,emp5);
//		
//		Employee[] all2 = empArr2.getEmployeeArr();
//		System.out.println(all2[0]);
//		System.out.println(all2[1]);

		Employee[] all3;// = empArr.getEmployeeArr();
		
		all3=empArr.getSortDecArr();
		System.out.println(all3[0]);
		System.out.println(all3[1]);
		System.out.println(all3[2]);
		System.out.println(all3[3]);
		System.out.println(all3[4]);
		System.out.println();
		
		Employee[] all4;// = empArr.getEmployeeArr();
		all4=empArr.getSelectArr();
		System.out.println(all4[0]);
		System.out.println(all4[1]);
		System.out.println(all4[2]);
		System.out.println(all4[3]);
		
		
		
		
//		System.out.println();
	
		
	
		
		
		

	}

}
