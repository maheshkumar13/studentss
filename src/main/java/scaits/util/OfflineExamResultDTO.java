package scaits.util;

import java.util.Date;

public class OfflineExamResultDTO {
	private String studentId;
	private String testCode;
	private String testMode;
	private String testType;
	private Date testDate;
	private String subject;
	private float marks;
	private long maxMarks;
	private long rank;
	private long stRank;
	private long campusRank;
	private long orderBy;

	// MPC
	private String value1;
	private String value2;
	private String value3;
	private String value4;
	private String value5;
	private String value6;

	private long stateRank;
	private long allIndiaRank;
	
	private String maths;
	private String physics;
	private String chemistry;
	private String botany;
	private String zoology;
	
	public long getStateRank() {
		return stateRank;
	}

	public void setStateRank(long stateRank) {
		this.stateRank = stateRank;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestMode() {
		return testMode;
	}

	public void setTestMode(String testMode) {
		this.testMode = testMode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getRank() {
		return rank;
	}

	public void setRank(long rank) {
		this.rank = rank;
	}

	public long getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(long orderBy) {
		this.orderBy = orderBy;
	}

	public long getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(long maxMarks) {
		this.maxMarks = maxMarks;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getValue5() {
		return value5;
	}

	public void setValue5(String value5) {
		this.value5 = value5;
	}

	public String getValue6() {
		return value6;
	}

	public void setValue6(String value6) {
		this.value6 = value6;
	}

	public String getValue4() {
		return value4;
	}

	public void setValue4(String value4) {
		this.value4 = value4;
	}

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public long getStRank() {
		return stRank;
	}
	
	

	public long getCampusRank() {
		return campusRank;
	}

	public void setCampusRank(long campusRank) {
		this.campusRank = campusRank;
	}

	public void setStRank(long stRank) {
		this.stRank = stRank;
	}

	public long getAllIndiaRank() {
		return allIndiaRank;
	}

	public void setAllIndiaRank(long allIndiaRank) {
		this.allIndiaRank = allIndiaRank;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getBotany() {
		return botany;
	}

	public void setBotany(String botany) {
		this.botany = botany;
	}

	public String getZoology() {
		return zoology;
	}

	public void setZoology(String zoology) {
		this.zoology = zoology;
	}
	

}
