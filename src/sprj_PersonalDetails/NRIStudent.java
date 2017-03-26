
package sprj_PersonalDetails;

public class NRIStudent 
{
	private String Nationality,NriStatus,Address, Grade12, RollNumber12, Admission_Type;

	public NRIStudent(){}
	
	public void setNRIStudentDetails(String g12, String r12, String nrination, String nristat, String nriadd, String admtype)
	{
		this.setNationality(nrination);
		this.setNriStatus(nristat);
		this.setAddress(nriadd);
		this.setGrade12(g12);
		this.setRollNumber12(r12);
		this.setAdmissionType(admtype);
	}
	
	
	public void setAdmissionType(String admtype)
	{
		Admission_Type = admtype;
	}
	
	public String getAdmissionType()
	{
		return Admission_Type;
	}
	
	
	public String getNRIGrade12() {
		return Grade12;
	}

	public String getNRIRollNumber12() {
		return RollNumber12;
	}

	public void setGrade12(String grade12) {
		Grade12 = grade12;
	}

	public void setRollNumber12(String rollNumber12) {
		RollNumber12 = rollNumber12;
	}

	public String getNationality() 
	{
		return Nationality;
	}

	public String getNriStatus() 
	{
		return NriStatus;
	}

	public String getAddress()
	{
		return Address;
	}

	public void setNationality(String nationality) 
	{
		Nationality = nationality;
	}

	public void setNriStatus(String nriStatus) 
	{
		NriStatus = nriStatus;
	}

	public void setAddress(String address) 
	{
		Address = address;
	}
	
	
}
