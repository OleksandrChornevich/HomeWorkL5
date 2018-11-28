
public class HomeWork2 {

	public static void main(String[] args) {
		int arr[] = { 1, 1, -7, 1, 1, 1, 5, -1, -5, -2 };

		// first
		int sum = 0;
		int prod = 1;
		boolean b = true;
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0) {
				b = false;
				break;
			}
		}
		if (b == true) {
			for (int i = 0; i < 5; i++) {

				sum += arr[i];
			}
			;
			System.out.println("The sum of 5 element positive is: " + sum);
		} else

		{
			for (int i = 5; i < arr.length; i++) {
				prod *= arr[i];
			}
			;
			System.out.println("The sum of 5 element positive is: " + prod);

			// sescond
			int arr2[] = { 1, -8, -7, 1, 1 };
			// min
			int min = arr2[0];
			int minindex = 0;
			for (int i = 0; i < arr2.length - 1; i++) {
				if (arr2[i + 1] < min) {
					min = arr2[i + 1];
					minindex = i + 1;
				}
			}
			System.out.println("minimal element = " + min + " on position: " + minindex);
			//

			int position;
			boolean b2 = true;
			
			for (int i = 0; i < arr2.length; i++) {
				if ((arr2[i] > 0) && (b2 == true)) {
					b2 = false;
				} else if ((arr2[i] > 0) && (b == false)) {
					position = i;
					System.out.println("position second positive is:" + position);
					break;
				}

			}
			
			}
	}}

	


