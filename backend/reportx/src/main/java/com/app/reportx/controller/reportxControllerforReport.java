package com.app.reportx.controller;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.reportx.ResourceNotFoundException;
import com.app.reportx.model.Report;
import com.app.reportx.repository.ReportRepository;

@RestController
public class reportxControllerforReport {
	
	@Autowired
	private ReportRepository reportrepo;
	
	@PostMapping("/reportadded")
	public Report addreport(@RequestBody Report report) {
		return reportrepo.save(report);
	}
	
    @GetMapping("/reports")
    public List<Report> fetchreports() {
        return reportrepo.findAll();
    }

    @DeleteMapping("/deletereport/{id}")
    public List<Report> deletereport(@PathVariable int id) {
    	reportrepo.deleteById(id);
        return reportrepo.findAll();
    }
//    @PutMapping("/updatereport/{id}")
//    public ResponseEntity<Report> updateReport(@PathVariable(value = "id") Integer reportid,
//                                                   @RequestBody Report reportdetails) throws ResourceNotFoundException {
//        Report report = reportrepo.findById(reportid)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + reportid));
//
//        report.setReportname(reportdetails.getReportname());
//        report.setStartdate(reportdetails.getStartdate());
//        report.setEnddate(reportdetails.getEnddate());
//
//        final Report updatedreport = reportrepo.save(report);
//        return ResponseEntity.ok(updatedreport);
//    }
//    @PutMapping("/reports/{id}")
//    public ResponseEntity<Report> updatereport(@PathVariable(value="id") Integer reportid,@RequestBody Report reportdetails) {
//    	Report report = reportrepo.findById(reportid);
//        var report=reportrepo.findById(id);
//        report.set
//    }
}
