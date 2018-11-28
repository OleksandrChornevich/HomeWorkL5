import java.util.Scanner;

public class HomeWork1 {
	private int[] month; 
	//private int arrayMonthLength=12;

public HomeWork1() {
	this.month=new int [12];
}
				
public int[] getMonth(){ 
	return month;
}

public void setMonth(int month,int days) {
	this.month[month-1] = days;
	}

public MONTHS getMONTH(int month) {
	
	MONTHS months = null;
	switch (month) {
	
	case 1:
		months = MONTHS.JANUARY;
		break;
	case 2:
		months = MONTHS.FEBRUARY;
		break;
	case 3:
		months = MONTHS.MARCH;
		break;
	case 4:
		months = MONTHS.APRIL;
		break;
	case 5:
	    months = MONTHS.MAY;
	    break;
	case 6:
		months = MONTHS.JUNE;
		break;
	case 7:
		months = MONTHS.JULY;
		break;
	case 8:
		months = MONTHS.AUGUST;
		break;
	case 9:
		months = MONTHS.SEPTEMBER;
		break;
	case 10:
		months = MONTHS.OCTOBER;
		break;
	case 11:
		months = MONTHS.NOVEMBER;
		break;
	case 12:
		months = MONTHS.DECEMBER;
		break;
	default: System.out.println("is not the number of months by ALEX");	};

	return months;
}

public String toString() {
	
	String str="";
	
	for (int arr:this.month)
	{
		str+=arr+";";		
	};
	return str;
}

	public static void main(String[] args) {
		HomeWork1 year = new HomeWork1();
		
	    int count=1;
		while (count<=12) {
			System.out.println("Please enter the number of month");
			Scanner scan = new Scanner(System.in);
			int month=scan.nextInt();
			
			MONTHS months=year.getMONTH(month);
			if (year.getMonth()[month-1]!=0) {
				System.out.println("Month " + months + " is already with amount of days, it's" + year.getMonth()[month-1]);
				
				System.out.print("if do you want to correct this write YES or pres enter");
				Scanner scan2 = new Scanner(System.in);				
				String answer=scan2.nextLine();
					
				if (answer.equals("YES")){
					System.out.println("Enter the correct amount of days in " + months);
					int days=0;
					days=scan.nextInt();
					year.setMonth(month, days);
					};
				}
			else{
				System.out.println("Enter the amount of days in " + months);
			int days=0;
			days=scan.nextInt();
			year.setMonth(month, days);
			count++;
			};
			
			
	    	
	    }
		System.out.println("you enter all months result");
		System.out.println(year);
		
		
		
		

		
		
		
		
	}

}
