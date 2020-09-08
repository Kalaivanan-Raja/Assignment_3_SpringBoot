package com.kalaivananraja.springboot.service;

import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.kalaivananraja.springboot.excel.ReadExcelFile;
import com.kalaivananraja.springboot.repository.BusinessRepository;
import com.kalaivananraja.springboot.model.BusinessPartner;

/**
 * ExcelService saves the read excel data to database
 * 
 * 
 * @author Kalaivanan Raja
 *
 */
@Service
public class ExcelService {
	@Autowired
	public BusinessRepository repo;
	@Autowired
	private Environment env;


	/**
	 * save the data to database
	 */
	public void save() {
		try {
			FileInputStream  file = new FileInputStream(env.getProperty("file"));
			List<BusinessPartner> business = ReadExcelFile.excelToDb(file);
			repo.saveAll(business);
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
