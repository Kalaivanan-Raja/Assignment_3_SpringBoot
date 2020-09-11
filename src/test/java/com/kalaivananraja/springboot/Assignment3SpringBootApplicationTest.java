package com.kalaivananraja.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kalaivananraja.springboot.excel.ReadExcelFile;
import com.kalaivananraja.springboot.model.BusinessPartner;
import com.kalaivananraja.springboot.service.ExcelService;

/**
 * @author Kalaivanan Raja
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Assignment3SpringBootApplicationTest {

	/**
	 * test the Assignment3SpringBootApplication
	 */
	@Autowired
	private ExcelService excelservice;
	private ReadExcelFile ref;
	private BusinessPartner bp;
	@Test
	public void contextLoads() throws Exception {
		assertThat(excelservice).isNotNull();
		assertThat(ref).isNotNull();
		assertThat(bp).isNotNull();
	}
}
