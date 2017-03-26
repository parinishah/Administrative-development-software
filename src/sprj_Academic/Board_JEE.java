
package sprj_Academic;

public class Board_JEE 
{
	private String BoardRollNo_12th ,OverallPercentage_12th , JEEPercentile_12th ,PCMTheoryPercentage_12th ,PCMTheoryPercentile_12th
	,SchoolName ,SchoolBoard ,JEERollnum ,JEEScore ,AdmissionType;
	
	private int PassingYear_10th, PassingYear_12th;
	private int ACPCRank;
	
	public Board_JEE(){}
	
	public void setBoard_JEEDetails(String admtype, int pass10, int pass12, String brdroll, String schlbrd, String schlname, String overprcntg, String pcmprcntg, String pcmprcnl, String jeemark, String jeeprcntl, String jeeroll, int acpcrank)
	{
		this.setAdmissionType(admtype);
		this.setPassingYear_10th(pass10);
		this.setPassingYear_12th(pass12);
		this.setBoardRollNo_12th(brdroll);
		this.setSchoolBoard(schlbrd);
		this.setSchoolName(schlname);
		this.setOverallPercentage_12th(overprcntg);
		this.setJEEPercentile(jeeprcntl);
		this.setPCMTheoryPercentage_12th(pcmprcntg);
		this.setPCMTheoryPercentile_12th(pcmprcnl);
		this.setJEEScore(jeemark);
		this.setJEERollnum(jeeroll);
		this.setACPCRank(acpcrank);
	}

	public int getPassingYear_10th() {
		return PassingYear_10th;
	}

	public String getBoardRollNo_12th() {
		return BoardRollNo_12th;
	}

	public String getOverallPercentage_12th() {
		return OverallPercentage_12th;
	}

	public String getJEEPercentile() {
		return JEEPercentile_12th;
	}

	public String getPCMTheoryPercentage_12th() {
		return PCMTheoryPercentage_12th;
	}

	public String getPCMTheoryPercentile_12th() {
		return PCMTheoryPercentile_12th;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public String getSchoolBoard() {
		return SchoolBoard;
	}

	public String getJEERollnum() {
		return JEERollnum;
	}

	public String getJEEScore() {
		return JEEScore;
	}

	public int getACPCRank() {
		return ACPCRank;
	}

	public String getAdmissionType() {
		return AdmissionType;
	}

	public int getPassingYear_12th() {
		return PassingYear_12th;
	}

	public void setPassingYear_10th(int passingYear_10th) {
		PassingYear_10th = passingYear_10th;
	}

	public void setBoardRollNo_12th(String boardRollNo_12th) {
		BoardRollNo_12th = boardRollNo_12th;
	}

	public void setOverallPercentage_12th(String overallPercentage_12th) {
		OverallPercentage_12th = overallPercentage_12th;
	}

	public void setJEEPercentile(String jeePercentile_12th) {
		JEEPercentile_12th = jeePercentile_12th;
	}

	public void setPCMTheoryPercentage_12th(String pCMTheoryPercentage_12th) {
		PCMTheoryPercentage_12th = pCMTheoryPercentage_12th;
	}

	public void setPCMTheoryPercentile_12th(String pCMTheoryPercentile_12th) {
		PCMTheoryPercentile_12th = pCMTheoryPercentile_12th;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public void setSchoolBoard(String schoolBoard) {
		SchoolBoard = schoolBoard;
	}

	public void setJEERollnum(String jEERollnum) {
		JEERollnum = jEERollnum;
	}

	public void setJEEScore(String jEEScore) {
		JEEScore = jEEScore;
	}

	public void setACPCRank(int aCPCRank) {
		ACPCRank = aCPCRank;
	}

	public void setAdmissionType(String admissionType) {
		AdmissionType = admissionType;
	}

	public void setPassingYear_12th(int passingYear_12th) {
		PassingYear_12th = passingYear_12th;
	}
}
