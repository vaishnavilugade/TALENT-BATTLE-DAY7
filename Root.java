import java.util.*;
import static java.lang.Math.*;
class Root{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Enter values of a,b,c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double d = Math.pow(b,2) - 4*a*c;
		double sqrt_val = sqrt(abs(d));
		if(d > 0){
			System.out.println("There are two real roots");
            System.out.println("Roots are " + (-b+Math.sqrt(d))/(2*a) + " and " + (-b-Math.sqrt(d))/(2*a));
 }
 else if (d == 0){
	 System.out.println("Roots are equal");
	 System.out.println("Roots are " + -b/(2*a));
 }
 else{
	 System.out.println("No real roots");
	 System.out.println("Roots are " + -b/(2*a) + "+i" + 
 Math.sqrt(-d)/(2*a) + " and "
 + -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a));
 }
	}
}

			