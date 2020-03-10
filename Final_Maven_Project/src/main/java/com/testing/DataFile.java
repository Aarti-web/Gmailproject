package com.testing;

public interface DataFile {

	Xls_Reader d = new Xls_Reader("D:\\DEV_IT_Training\\DIT002\\Myworkspace\\Final_Maven_Project\\Project_Data\\FinalProject.xlsx");
	
	

	public String URL = d.getCellData("URL", 1, 1);

	///public String NOEmail = d.getCellData("gmail", 1, 1);
	//public String NOEmail = d.getCellData("gmail", 1, 2);
	//public String searchCanada = d.getCellData("gmail", 1, 2);
	
}