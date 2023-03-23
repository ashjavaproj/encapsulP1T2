package com.braindata.client1;

import com.braindata.model1.Doctor;

public class DoctorTest {
	public static void main(String args[])
	{
		Doctor d=new Doctor();
		d.setDid(101);
		d.setDname("RohitKumar");
		d.setHname("RamHospital");
		d.setHaddr("RKNager");
		d.setDmobno(9876543243l);
		d.setDsal(24242543d);
		
		System.out.println("***** DOCTOR DETAILS ******"); 
		System.out.println("________________________________");
		System.out.println(" Doctor ID is = "+d.getDid());
		System.out.println(" Doctor Name is = "+d.getDname());
		System.out.println(" Hospital Name is = "+d.getHname());
		System.out.println(" Hospital Address is = "+d.getHaddr());
		System.out.println(" Doctor Contact is = "+d.getDmobno());
		System.out.println(" Salary = "+d.getDsal());

	}

}
