package com.b.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDaoI{

	@Override
	public String generateReport() {
		String result="report generaed by DB";
		return result;
	}

}
