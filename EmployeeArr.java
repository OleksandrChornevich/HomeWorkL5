import java.util.Arrays;

public class EmployeeArr {
	private Employee[] employeearr;
	private int counter=0;

	public EmployeeArr(int countLength) {
		employeearr = new Employee[countLength];
	}

	public Employee[] getEmployeeArr() {
		return employeearr;
	}

	public void setEmployeeArr(Employee employee) {
		employeearr[counter] = employee;
		counter++;
	}
		
	public Employee[] getSortDecArr() {
		Employee[] arr = this.employeearr;
		Employee buf;
		int n=counter;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if ( arr[i].getSalary() < arr[j].getSalary()) {buf=arr[i];arr[i]=arr[j];arr[j]=buf;};}
		}
		return arr;}
		
	public Employee[] getSelectArr(){
		int s=5;
		int selectcount=0;
		int n=counter;
		Employee[] arr = this.employeearr;
		for (int i=0;i<n;i++) {
			if (arr[i].getDepartmentNumber()==s) {selectcount++;};
			}
		
		Employee[] arr2 = new Employee[selectcount];	
		int j=0;
			for (int i=0;i<n;i++) {
				if (arr[i].getDepartmentNumber()==s) {arr2[j]=arr[i];j++;};
		}
			return arr2;}
	}
	
	

