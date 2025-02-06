package com.b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.b.dao.OracleDaoImpl;
import com.b.dao.ReportDaoI;
import com.b.dao.ReportDaoImpl;
@Service
public class ReportServiceImpl implements ReportServiceI {
	@Autowired
	@Qualifier("oracleDaoImpl")
public ReportDaoI reportDaoI;
	
//	@Autowired
//public OracleDaoImpl oraclrDaoImpl;
	@Override
	public String generateReport() {
		String report=reportDaoI.generateReport();
		return report;
	}

}
