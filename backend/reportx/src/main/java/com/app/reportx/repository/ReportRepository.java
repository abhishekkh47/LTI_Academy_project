package com.app.reportx.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.reportx.model.Report;

public interface ReportRepository extends JpaRepository<Report,Integer>{
//	List<Report> findByReportName(String reportName);
}
