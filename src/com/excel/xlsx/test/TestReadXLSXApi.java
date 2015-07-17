package com.excel.xlsx.test;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.excel.xlsx.ReadXLSX;

public class TestReadXLSXApi {
	
	
	private File file;
	private ReadXLSX obj;
	@BeforeClass
	public void canOpenFile(){
		file = new File (".//excelFiles//username_passwords.xlsx");
		obj = new ReadXLSX(file);
	}
	
	@Test(priority=1)
	public void canOpenSheetwithName(){
		String name ="Sheet1";
		obj.setSheet(name);
	}
	@Test(priority=2)
	public void canOpenSheetwithIndex(){
		int ind =0;
		obj.setSheet(ind);
	}
	
}
