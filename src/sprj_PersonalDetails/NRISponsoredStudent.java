
package sprj_PersonalDetails;

public class NRISponsoredStudent 
{
	private String SponsorName, SponsorGender, SponsorNationality, SponsorContact, SponsorNriStatus, SponsorAddress, 
	SponsorRelation;

	public NRISponsoredStudent(){}
	
	public void setNRISponsoredDetails(String sponsn, String sponsg, String sponsnation, String sponsnristat, String sponsrel, String sponscont, String sponsadd)
	{
		this.setSponsorName(sponsn);
		this.setSponsorGender(sponsg);
		this.setSponsorNationality(sponsnation);
		this.setSponsorContact(sponscont);
		this.setSponsorNriStatus(sponsnristat);
		this.setSponsorAddress(sponsadd);
		this.setSponsorRelation(sponsrel);
	}
	
	
	public String getSponsorName() 
	{
		return SponsorName;
	}

	public String getSponsorGender() 
	{
		return SponsorGender;
	}

	public String getSponsorNationality() 
	{
		return SponsorNationality;
	}

	public String getSponsorContact() 
	{
		return SponsorContact;
	}

	public String getSponsorNriStatus() 
	{
		return SponsorNriStatus;
	}

	public String getSponsorAddress()
	{
		return SponsorAddress;
	}

	public String getSponsorRelation() 
	{
		return SponsorRelation;
	}

	public void setSponsorName(String sponsorName) 
	{
		SponsorName = sponsorName;
	}

	public void setSponsorGender(String sponsorGender) 
	{
		SponsorGender = sponsorGender;
	}

	public void setSponsorNationality(String sponsorNationality) 
	{
		SponsorNationality = sponsorNationality;
	}

	public void setSponsorContact(String sponsorContact)
	{
		SponsorContact = sponsorContact;
	}

	public void setSponsorNriStatus(String sponsorNriStatus) 
	{
		SponsorNriStatus = sponsorNriStatus;
	}

	public void setSponsorAddress(String sponsorAddress) 
	{
		SponsorAddress = sponsorAddress;
	}

	public void setSponsorRelation(String sponsorRelation) 
	{
		SponsorRelation = sponsorRelation;
	}
}
