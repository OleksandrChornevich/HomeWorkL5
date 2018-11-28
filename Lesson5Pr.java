import java.util.Scanner;

public class Lesson5Pr {

	public static void main(String[] args) {
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		
		//max
		int max;
		int arr[]= {5,-9,8,7,-3,0,12,11,-7,1,-15,4};
		max=arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {max=arr[i];};
		}
		
		System.out.println("value of max element: "+max);
		/*
		//sum positive
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>0) {sum+=arr[i];}
		}
		System.out.println(sum);
		*/
		
		//sum positive2
		int sum2=0;
		for(int element:arr)
		{
			if (element>0) {sum2+=element;}
		}
		System.out.println("sum of positive: "+sum2);
		//amount of negotive
		int amount=0;
		for(int element:arr){
			if(element <0) {amount++;}
		}
		System.out.println("amount of negotive: "+amount);
		//amount of positive
		int amountP=0;
		for(int element:arr){
		if(element >=0) {amountP++;}
		}
		System.out.println("amount of positive: "+amountP);
		
		if (amount>amountP) {System.out.println("Negative values are more than positive");}
		else {System.out.println("Positive values are more than negative");}
		

	}

}
