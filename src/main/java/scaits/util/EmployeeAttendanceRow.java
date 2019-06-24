package scaits.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeAttendanceRow implements Serializable {

	private Long empCampusId;
	private String name;
	private String desig;
	private String subject;
	private Long attendCampusId;
	private Long employeeId;
	private Date attendDate;
	private String attendance;
	private String remarks;
	private String p1;
	private String p2;
	private String p3;
	private String p4;
	private String p5;
	private String p6;
	private String p7;
	private String p8;
	private String session1;
	private String session2;

	private Long p1CampusId;
	private Long p2CampusId;
	private Long p3CampusId;
	private Long p4CampusId;
	private Long p5CampusId;
	private Long p6CampusId;
	private Long p7CampusId;
	private Long p8CampusId;

	private int attendanceOrderby;
	private String empPayRollId;
	private Long attendRowId;

	private String inDateStr;
	private String outDateStr;

	private Date inDate;
	private Date outDate;

	private String inTime;
	private String outTime;

	private int OnDuty;

	private Long breakTime;
	private String availableTime;
	private String description;

	public Long getEmpCampusId() {
		return empCampusId;
	}

	public void setEmpCampusId(Long empCampusId) {
		this.empCampusId = empCampusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Long getAttendCampusId() {
		return attendCampusId;
	}

	public void setAttendCampusId(Long attendCampusId) {
		this.attendCampusId = attendCampusId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Date getAttendDate() {
		return attendDate;
	}

	public void setAttendDate(Date attendDate) {
		this.attendDate = attendDate;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
	}

	public String getP5() {
		return p5;
	}

	public void setP5(String p5) {
		this.p5 = p5;
	}

	public String getP6() {
		return p6;
	}

	public void setP6(String p6) {
		this.p6 = p6;
	}

	public String getP7() {
		return p7;
	}

	public void setP7(String p7) {
		this.p7 = p7;
	}

	public String getP8() {
		return p8;
	}

	public void setP8(String p8) {
		this.p8 = p8;
	}

	public Long getP1CampusId() {
		return p1CampusId;
	}

	public void setP1CampusId(Long p1CampusId) {
		this.p1CampusId = p1CampusId;
	}

	public Long getP2CampusId() {
		return p2CampusId;
	}

	public void setP2CampusId(Long p2CampusId) {
		this.p2CampusId = p2CampusId;
	}

	public Long getP3CampusId() {
		return p3CampusId;
	}

	public void setP3CampusId(Long p3CampusId) {
		this.p3CampusId = p3CampusId;
	}

	public Long getP4CampusId() {
		return p4CampusId;
	}

	public void setP4CampusId(Long p4CampusId) {
		this.p4CampusId = p4CampusId;
	}

	public Long getP5CampusId() {
		return p5CampusId;
	}

	public void setP5CampusId(Long p5CampusId) {
		this.p5CampusId = p5CampusId;
	}

	public Long getP6CampusId() {
		return p6CampusId;
	}

	public void setP6CampusId(Long p6CampusId) {
		this.p6CampusId = p6CampusId;
	}

	public Long getP7CampusId() {
		return p7CampusId;
	}

	public void setP7CampusId(Long p7CampusId) {
		this.p7CampusId = p7CampusId;
	}

	public Long getP8CampusId() {
		return p8CampusId;
	}

	public void setP8CampusId(Long p8CampusId) {
		this.p8CampusId = p8CampusId;
	}

	public int getAttendanceOrderby() {
		return attendanceOrderby;
	}

	public void setAttendanceOrderby(int attendanceOrderby) {
		this.attendanceOrderby = attendanceOrderby;
	}

	public String getEmpPayRollId() {
		return empPayRollId;
	}

	public void setEmpPayRollId(String empPayRollId) {
		this.empPayRollId = empPayRollId;
	}

	public Long getAttendRowId() {
		return attendRowId;
	}

	public void setAttendRowId(Long attendRowId) {
		this.attendRowId = attendRowId;
	}

	public int getOnDuty() {
		return OnDuty;
	}

	public void setOnDuty(int onDuty) {
		OnDuty = onDuty;
	}

	public String getSession1() {
		return session1;
	}

	public void setSession1(String session1) {
		this.session1 = session1;
	}

	public String getSession2() {
		return session2;
	}

	public void setSession2(String session2) {
		this.session2 = session2;
	}

	public String getInDateStr() {

		return inDateStr;
	}

	public void setInDateStr(String inDateStr) throws ParseException {
		if (!inDateStr.equals("")) {
			this.inDateStr = inDateStr;

			String oldScheduledDate = inDateStr;
			DateFormat oldFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			Date oldDate = oldFormatter.parse(oldScheduledDate);

			this.inDate = oldDate;
		}
		this.inDateStr = inDateStr;
	}

	public String getOutDateStr() {
		return outDateStr;
	}

	public void setOutDateStr(String outDateStr) throws ParseException {
		if (!outDateStr.equals("")) {
			this.outDateStr = outDateStr;

			String oldScheduledDate = outDateStr;
			DateFormat oldFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			Date oldDate = oldFormatter.parse(oldScheduledDate);

			this.outDate = oldDate;
		}
		this.outDateStr = outDateStr;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public Long getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(Long breakTime) {
		this.breakTime = breakTime;
	}

	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}