import java.util.Scanner;

public class Sumofdigits {
public static void main(String[] args) {
	int r,sum=0;
	System.out.println("enter the nummber");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0) {
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println("sum of the number"+ sum);
}
}
