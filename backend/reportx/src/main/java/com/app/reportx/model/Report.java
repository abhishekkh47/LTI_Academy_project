package com.app.reportx.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reports")
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="reportname")
	private String reportname;
	
	@Column(name="startdate")
	private String startdate;

	@Column(name="enddate")
	private String enddate;
	
	@Override
	public String toString() {
		return "Report [id=" + id + ", reportname=" + reportname + ", startdate=" + startdate + ", enddate=" + enddate
				+ "]";
	}

	public Report(int id, String reportname, String startdate, String enddate) {
		super();
		this.id = id;
		this.reportname = reportname;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReportname() {
		return reportname;
	}

	public void setReportname(String reportname) {
		this.reportname = reportname;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

}
