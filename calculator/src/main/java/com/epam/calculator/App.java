package com.epam.calculator;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("Enter the first operand :");
            float first_operand = sc.nextFloat();
            System.out.println("Enter the second operand :");
            float second_operand = sc.nextFloat();
            System.out.println("Enter the operation symbol you want to perform\n 1 Addition\n 2 Subtraction\n 3 Multiplication\n 4 Division\n 5 Exit");
        	int operator = sc.nextInt();
            switch(operator) {
            	case 1 : Addition add = new Addition(first_operand,second_operand);
            				System.out.println(add.addTwoNumbers());
            				break;
            	case 2 : Subtraction sub = new Subtraction(first_operand,second_operand);
            				System.out.println(sub.subtractTwoNumbers());
            				break;
            	case 3 : Multiplication mul = new Multiplication(first_operand,second_operand);
    						System.out.println(mul.multiplyTwoNumbers());
    						break;
            	case 4 : Division div = new Division(first_operand,second_operand);
    						System.out.println(div.divideTwoNumbers());
    						break;
            	case 5 : sc.close();
            				return;
    			default : System.out.println("Invalid Operation");
            }
        }
    }
}
