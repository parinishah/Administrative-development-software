
package sprj_PersonalDetails;

public class GuardianDetails
{
	private String FatherName, MotherName, FatherContact, MotherContact, FatherOccupation, MotherOccupation,
			FatherQualification, MotherQualification, FatherIncome, MotherIncome, FatherEmailId;
	
	public GuardianDetails(){}
	
	public void setGuardianDetails(String fatn, String fatcont, String fatqual, String fatocc, String fatinc, String fatemail, String motn, String motcont, String motqual, String motocc, String motinc)
	{
		this.setFatherName(fatn);
		this.setMotherName(motn);
		this.setFatherContact(fatcont);
		this.setMotherContact(motcont);
		this.setFatherOccupation(fatocc);
		this.setMotherOccupation(motocc);
		this.setFatherQualification(fatqual);
		this.setMotherQualification(motqual);
		this.setFatherIncome(fatinc);
		this.setMotherIncome(motinc);
		this.setFatherEmailId(fatemail);
		
	}

	public String getFatherName()
	{
		return FatherName;
	}

	public String getMotherName()
	{
		return MotherName;
	}

	public String getFatherContact()
	{
		return FatherContact;
	}

	public String getMotherContact()
	{
		return MotherContact;
	}

	public String getFatherOccupation() 
	{
		return FatherOccupation;
	}

	public String getMotherOccupation() 
	{
		return MotherOccupation;
	}

	public String getFatherQualification()
	{
		return FatherQualification;
	}

	public String getMotherQualification()
	{
		return MotherQualification;
	}

	public String getFatherIncome()
	{
		return FatherIncome;
	}

	public String getMotherIncome()
	{
		return MotherIncome;
	}

	public String getFatherEmailId()
	{
		return FatherEmailId;
	}

	public void setFatherName(String fatherName)
	{
		FatherName = fatherName;
	}

	public void setMotherName(String motherName)
	{
		MotherName = motherName;
	}

	public void setFatherContact(String fatherContact)
	{
		FatherContact = fatherContact;
	}

	public void setMotherContact(String motherContact)
	{
		MotherContact = motherContact;
	}

	public void setFatherOccupation(String fatherOccupation)
	{
		FatherOccupation = fatherOccupation;
	}

	public void setMotherOccupation(String motherOccupation)
	{
		MotherOccupation = motherOccupation;
	}

	public void setFatherQualification(String fatherQualification)
	{
		FatherQualification = fatherQualification;
	}

	public void setMotherQualification(String motherQualification) 
	{
		MotherQualification = motherQualification;
	}

	public void setFatherIncome(String fatherIncome)
	{
		FatherIncome = fatherIncome;
	}

	public void setMotherIncome(String motherIncome) 
	{
		MotherIncome = motherIncome;
	}

	public void setFatherEmailId(String fatherEmailId) 
	{
		FatherEmailId = fatherEmailId;
	}

}
