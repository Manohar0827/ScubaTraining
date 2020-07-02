package com.calculator;

public class Calculation {
	
	/*
	 * int result; //Method for addition public int add(int num1, int num2){ result
	 * = num1+num2; return result; } //Method for subtraction public int
	 * substract(int num1, int num2){ result = num1-num2; return result; } //Method
	 * for multiplication public int multiply(int num1, int num2){ result =
	 * num1*num2; return result; } //Method for division public float divide(int
	 * num1, int num2){ result = num1/num2; return result; }
	 */
	
	public static int add(int number1, int number2) {
	      return number1 + number2;
	   }
	 
	   public static int sub(int number1, int number2) {
	      return number1 - number2;
	   }
	 
	   public static int mul(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	   // Integer divide. Return a truncated int.
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 
	   // Real number divide. Return a double.
	   public static double divReal(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (double) number1 / number2;
	   }
	   
	   
	   // Exponent
	   public static double exp(double number1, double number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return Math.pow(number1, number2);
	   }
	   
	   
	   // Modulus
	   public static int mod(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1%number2;
	   }
	       
	     
	   // Inverse
	   public static double inverse(int number1) {
	      if (number1 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (double) 1 / number1;
	   }
	         
	   
	   // Negate
	   public static int negate(int number1) {
	      if (number1 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (-1) * number1;
	   }   
	 

}
