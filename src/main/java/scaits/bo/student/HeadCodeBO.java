package scaits.bo.student;

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

@Entity(name = "t_head_code")
public class HeadCodeBO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HEAD_CODE_ID")
	private long id;

	@Column(name = "HEAD_NAME", length = 10)
	private String headName;
	
	@Column(name = "HEAD_CODE", length = 10)
	private String headCode;

	@Column(name = "STATUS")
	private boolean status;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getHeadName() {
		return headName;
	}


	public void setHeadName(String headName) {
		this.headName = headName;
	}


	public String getHeadCode() {
		return headCode;
	}


	public void setHeadCode(String headCode) {
		this.headCode = headCode;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


}