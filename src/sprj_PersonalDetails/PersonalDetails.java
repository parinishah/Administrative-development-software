
package sprj_PersonalDetails;

public class PersonalDetails 
{
	private String FirstName,MiddleName,LastName,Gender,AddL1,City,State,Pincode,PrimaryContact,
	SecondaryContact,EmailId,DOB,Category,Disability,Nationality;

	public PersonalDetails(){}
	
	public void setStudentDetails(String firstn, String middlen, String lastn, String gndr, String disab, String addl1, String stt, String cty, String pinc, String primc, String secc, String email, String categ, String dob)
	{
		this.setFirstName(firstn);
		this.setMiddleName(middlen);
		this.setLastName(lastn);
		this.setGender(gndr);
		this.setAddL1(addl1);
		//this.setAddL2(addl2);
		this.setCity(cty);
		this.setState(stt);
		this.setPincode(pinc);
		this.setPrimaryContact(primc);
		this.setSecondaryContact(secc);
		this.setEmailId(email);
		this.setDOB(dob);
		this.setCategory(categ);
		this.setDisability(disab);
		//this.setNationality(nation);
	}
	
	
	public String getFirstName() 
	{
		return FirstName;
	}

	public String getMiddleName() 
	{
		return MiddleName;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public String getGender() 
	{
		return Gender;
	}

	public String getAddL1() 
	{
		return AddL1;
	}


	public String getCity() 
	{
		return City;
	}

	public String getState() 
	{
		return State;
	}

	public String getPincode() 
	{
		return Pincode;
	}

	public String getPrimaryContact() 
	{
		return PrimaryContact;
	}

	public String getSecondaryContact() 
	{
		return SecondaryContact;
	}

	public String getEmailId() 
	{
		return EmailId;
	}

	public String getDOB() 
	{
		return DOB;
	}

	public String getCategory() 
	{
		return Category;
	}

	public String getDisability() 
	{
		return Disability;
	}

	public String getNationality() 
	{
		return Nationality;
	}

	public void setFirstName(String firstName) 
	{
		FirstName = firstName;
	}

	public void setMiddleName(String middleName) 
	{
		MiddleName = middleName;
	}

	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}

	public void setGender(String gender) 
	{
		Gender = gender;
	}

	public void setAddL1(String addL1) 
	{
		AddL1 = addL1;
	}


	public void setCity(String city) 
	{
		City = city;
	}

	public void setState(String state) 
	{
		State = state;
	}

	public void setPincode(String pincode) 
	{
		Pincode = pincode;
	}

	public void setPrimaryContact(String primaryContact) 
	{
		PrimaryContact = primaryContact;
	}

	public void setSecondaryContact(String secondaryContact) 
	{
		SecondaryContact = secondaryContact;
	}

	public void setEmailId(String emailId) 
	{
		EmailId = emailId;
	}

	public void setDOB(String dOB) 
	{
		DOB = dOB;
	}

	public void setCategory(String category) 
	{
		Category = category;
	}

	public void setDisability(String disability) 
	{
		Disability = disability;
	}

	public void setNationality(String nationality) 
	{
		Nationality = nationality;
	}
}
