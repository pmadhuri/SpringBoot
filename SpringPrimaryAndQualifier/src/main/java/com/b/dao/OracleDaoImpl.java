package com.b.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDaoImpl implements ReportDaoI {

	@Override
	public String generateReport() {
		String report="Report Generated from OracleDaoImpl";
		return report;
	}

}
