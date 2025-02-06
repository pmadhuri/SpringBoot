package com.b.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary 
//o/p Report Generated from MySqlDaoImpl
public class MysqlReportDaoImpl implements ReportDaoI {

	@Override
	public String generateReport() {
		String report="Report Generated from MySqlDaoImpl";
		return report;
	}

}
