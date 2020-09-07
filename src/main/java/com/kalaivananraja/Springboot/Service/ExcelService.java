package com.kalaivananraja.Springboot.Service;

import java.io.FileInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.kalaivananraja.Springboot.Controller.ReadExcelFile;
import com.kalaivananraja.Springboot.Repository.BusinessRepository;
import com.kalaivananraja.Springboot.Model.BusinessPartner;

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
	BusinessRepository repo;
	@Autowired
	private Environment env;

	FileInputStream file;

	/**
	 * save the data to database
	 */
	public void save() {
		try {
			file = new FileInputStream(env.getProperty("file"));
			List<BusinessPartner> business = ReadExcelFile.excelToDb(file);
			repo.saveAll(business);
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
