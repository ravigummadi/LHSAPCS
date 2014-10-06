package apcsweek2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerOverflow {
	public static void main(String[] args){
		boolean c;
		if(c=false)
			System.out.println(c);
		System.out.println('s' + 's');
		System.out.println(c);		
		int n = 0;
		Boolean isError = false;
		do{
			try{				
				n = new Scanner(System.in).nextInt();
				isError = false;
			}catch(InputMismatchException imException){
				System.out.println("The input type is not an integer, please enter only numbers");				
				isError = true;
			}
		}while(isError);
		System.out.println("You have input a valid number" + n);
		
	}
}
