package sprj_EnrollmentDetails;

public class EnrollmentDetails 
{
	private String EDBranch;
	private String EDAdmissionStatus;
	private int EDYearofJoining;

	public EnrollmentDetails(){}
	
	public void setEnrollmentDetails(String Branch, String admstat, int y)
	{
		this.setEDAdmissionStatus(admstat);
		this.setEDBranch(Branch);
		this.setEDYearofJoining(y);
		
	}
	

	
	public String getEDBranch() 
	{
		return EDBranch;
	}	
	public String getEDAdmissionStatus()
	{
		return EDAdmissionStatus;
	}
	public int getEDYearofJoining() 
	{
		return EDYearofJoining;
	}
	
	
	public void setEDBranch(String eDBranch) 
	{
		EDBranch = eDBranch;
	}
	public void setEDAdmissionStatus(String eDAdmissionStatus) 
	{
		EDAdmissionStatus = eDAdmissionStatus;
	}
	public void setEDYearofJoining(int eDYearofJoining) 
	{
		EDYearofJoining = eDYearofJoining;
	}
	
	
	
}
