package com.braindata.client;

import java.util.Scanner;

import com.braindata.model.Doctor;

public class DoctorTest extends Doctor {
	//	DoctorTest dt=new DoctorTest();
	void input()
	{
	DoctorTest dt=new DoctorTest();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Doctor ID = ");
	dt.did=sc.nextInt();
	System.out.print("Enter Doctor name = ");
	dt.dname=sc.next();
	System.out.print("Enter  Hospital name = ");
	dt.hname=sc.next();
    System.out.print("Enter Hospital Address = ");
	dt.haddr=sc.next();
    System.out.print("Enter Doctor Contact no = ");
	dt.dmobno=sc.nextLong();
    System.out.print("Enter Salary = ");
	dt.dsal=sc.nextDouble();
    System.out.println();
    
    
/*}
	
private void output()
{
	*/DoctorTest dt1=new DoctorTest();

	
	System.out.println("***** DOCTOR DETAILS ******"); 
	System.out.println("________________________________");
	System.out.println(" Doctor ID is = "+dt.did);
	System.out.println(" Doctor Name is = "+dt.dname);
	System.out.println(" Hospital Name is = "+dt.hname);
	System.out.println(" Hospital Address is = "+dt.haddr);
	System.out.println(" Doctor Contact is = "+dt.dmobno);
	System.out.println(" Salary = "+dt.dsal);
}

	public static void main(String args[])
	{
		DoctorTest dt2=new DoctorTest();
		dt2.input();
		//dt2.output();
	}

	}


