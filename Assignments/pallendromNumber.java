// check number is pallendrom or not.

import java.util.Scanner;

public class pallendromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, reversedNum = 0, remainder;
	    
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		int originalNum = num;
		// get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum+ " is not Palindrome.");
	    }
	}

}
