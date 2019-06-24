package scaits.bo.student;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import scaits.bo.employee.EmployeeBO;


@Entity(name = "t_student")
public class StudentBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STUDENT_NO", length = 25)
	private String studentNo;
	
	@Column(name = "REGISTRATION_FEE")
	private Long rFee;

	@Column(name = "PASS_WORD", length = 50)
	private String passwd;
	
	@Column(name = "SUR_NAME", length = 500)
	private String surName;

	@Column(name = "NAME", length = 500)
	private String name;

	@Column(name = "PARENT_NAME", length = 500)
	private String fname;
	
	@Column(name = "PARENT_OCCUPATION", length = 500)
	private String pOccupation;
	
	@Column(name = "LOCAL_GUARDIAN", length = 500)
	private String localGuardian;

	@Column(name = "COACHING", length = 50)
	private String coaching;


	@Column(name = "ACADEMIC_YEAR", length = 20)
	private String academicYear;
	
	
	public enum Student {
		DELETE, LEFT, CURRENT
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Student student;

	@Column(name = "RELIGION", length = 20)
	private String religion;
	
	@Column(name = "SUB_CAST", length = 20)
	private String subCost;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAST_ID")
	private CastBO cast;


	@Column(name = "PRESENT_ADDRESS", length = 350)
	private String pAddress;
	
	@Column(name = "PERMANANT_ADDRESS", length = 350)
	private String perAddress;

	@Column(name = "REMARKS", length = 50)
	private String remarks;

	@Column(name = "SCHOOL_NAME", length = 200)
	private String schoolName;

	@Column(name = "UUID", length = 200)
	private String uuid;

	@Column(name = "MOBILE_NO")
	private Long mobileNo;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACADEMIC_ID")
	private AcademicYearBO academicId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLASS_ID")
	private StudyClassBO classId;


	@Column(name = "EMAIL")
	private String email;


	@Column(name = "DOB")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	
	@Column(name = "DOJ")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date doj;
	
	@Column(name = "GENDER", length = 6)
	private String gender;

	@Column(name = "AADHAAR")
	private String aadhaar;
	
	
	@Column(name = "CREATED_ON")
	private Date createdOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CREATED_BY")
	private EmployeeBO createdBy;

	@Column(name = "CREATED_BY_NAME", length = 100)
	private String createdByName;

	@Column(name = "UPDATED_ON")
	private Date modifiedOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UPDATED_BY")
	private EmployeeBO modifiedBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SECTION_ID")
	private ClassSectionBO sectionId;

	

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getpOccupation() {
		return pOccupation;
	}

	public void setpOccupation(String pOccupation) {
		this.pOccupation = pOccupation;
	}

	public String getLocalGuardian() {
		return localGuardian;
	}

	public void setLocalGuardian(String localGuardian) {
		this.localGuardian = localGuardian;
	}

	public String getCoaching() {
		return coaching;
	}

	public void setCoaching(String coaching) {
		this.coaching = coaching;
	}


	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSubCost() {
		return subCost;
	}

	public void setSubCost(String subCost) {
		this.subCost = subCost;
	}

	public CastBO getCast() {
		return cast;
	}

	public void setCast(CastBO cast) {
		this.cast = cast;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getPerAddress() {
		return perAddress;
	}

	public void setPerAddress(String perAddress) {
		this.perAddress = perAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public AcademicYearBO getAcademicId() {
		return academicId;
	}

	public void setAcademicId(AcademicYearBO academicId) {
		this.academicId = academicId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public EmployeeBO getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(EmployeeBO createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public EmployeeBO getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(EmployeeBO modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public ClassSectionBO getSectionId() {
		return sectionId;
	}

	public void setSectionId(ClassSectionBO sectionId) {
		this.sectionId = sectionId;
	}

	public Long getrFee() {
		return rFee;
	}

	public void setrFee(Long rFee) {
		this.rFee = rFee;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public StudyClassBO getClassId() {
		return classId;
	}

	public void setClassId(StudyClassBO classId) {
		this.classId = classId;
	}



}
