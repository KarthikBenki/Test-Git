package com.blz.git;
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		//CONSTANTS
		int IS_FULL_TIME=1;
		//Random function
//		Random ran = new Random();
		// Computation
//		int empCheck = ran.nextInt(2);
		double random_ = Math.random()*10;
		System.out.println("1)random function is giving "+random_);
		
		double floor_ = Math.floor(random_);
		System.out.println("2)floor function is gives nearest integer\n"
				+ "of decimal given by random function "+floor_);
		
		System.out.println("3)Now need to values in the \n"
				+ "range of 0 to 1 so we are doing floor_%2");
		
		double empCheck = floor_%2;
		System.out.println(empCheck);

		if(empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}


	}

}
