package scaits.bo.exam;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import scaits.bo.employee.EmployeeBO;
import scaits.bo.student.StudyClassBO;

@Entity(name = "t_exam")
public class ExamBO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

	@Column(name = "MATHEMATICS", length = 10)
	private Double mathematics;
	
	@Column(name = "PHYSICS", length = 10)
	private Double physics;
	
	@Column(name = "COMPUTER", length = 10)
	private Double computer;
	
	@Column(name = "HINDI", length = 10)
	private Double hindi;
	
	@Column(name = "chemistry", length = 10)
	private Double chemistry;
	
	@Column(name = "MAT_Per", length = 10)
	private Double mathematics;
	
	@Column(name = "PHY_PER", length = 10)
	private Double physics;
	
	@Column(name = "COMPUTER", length = 10)
	private Double computer;
	
	@Column(name = "HINDI", length = 10)
	private Double hindi;
	
	@Column(name = "chemistry", length = 10)
	private Double chemistry;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CREATED_BY")
	private EmployeeBO createdBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UPDATED_BY")
	private EmployeeBO modifiedBy;

	@Column(name = "UPDATED_ON")
	private Date modifiedOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLASS_ID")
	private StudyClassBO studyclass;

	@Column(name = "SCHOOL_NAME", length = 10)
	private String schoolName;
	

	@Column(name = "STATUS")
	private boolean status;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}