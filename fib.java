package week1.day1;

public class fib {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum=0;
		for (int i = 1; i<=6; i++) {
			
			sum=num1+num2;
			System.out.println(sum);
			
			num1=num2;
			num2=sum;
			
		}

	}

}
