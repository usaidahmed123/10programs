package start;
import java.util.*;

public class add_input {

	public static void main(String[] args) {
		
		int num1, num2, sum;
        Scanner v = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = v.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = v.nextInt();
        
        v.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);	
	}

}
