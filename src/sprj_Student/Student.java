package sprj_Student;


import sprj_PersonalDetails.*;
import sprj_Academic.*;
import sprj_EnrollmentDetails.EnrollmentDetails;


public class Student 
{
	public PersonalDetails student;
	public GuardianDetails guard;
	public NRISponsoredStudent NRIspons;
	public NRIStudent NRIstud;
	public EnrollmentDetails enroll;
	public Board_JEE board_jee;
	
	
	public Student()
	{
		student = new PersonalDetails();
		guard = new GuardianDetails();
		//NRIspons = new NRISponsoredStudent();
		//nristud = new NRIStudent();
		enroll = new EnrollmentDetails();
		//board_jee = new Board_JEE();
	}
	
	public void ACPCAdmission()
	{
		board_jee = new Board_JEE();
	}
	
	public void NRIStudentAdmission()
	{
		NRIstud = new NRIStudent();
	}
	
	public void NRISponsoredAdmission()
	{
		NRIspons = new NRISponsoredStudent();
		board_jee = new Board_JEE();
	}

}
