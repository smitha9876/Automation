package qsp;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//to check whether maven dependency is works fine r not
public class DemoA {
	public static void main (String[] args)throws Exception{
	Workbook w = WorkbookFactory.create(new File("./data/Book1.xlsx"));
	String s=w.getSheet("sheet1").getRow(0).getCell(0).toString();
	System.out.println(s);
	

}
}
