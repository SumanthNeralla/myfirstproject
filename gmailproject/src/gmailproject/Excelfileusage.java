package gmailproject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfileusage {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		Workbook workbook =WorkbookFactory.create(new File("./Samplefile.xlsx"));
		System.out.println("Number of work sheets"+ workbook.getNumberOfSheets());
	
		 //Iterator<Sheet> sheetIterator = workbook.sheetIterator();
		
		for (Sheet sheet: workbook)
		{
			System.out.println(sheet.getSheetName());
			
		}
		
		Sheet sheet=workbook.getSheet("Employee");
		
		int Totalnumberofrows=sheet.getPhysicalNumberOfRows();				
		Row row=sheet.createRow(Totalnumberofrows);
		row.createCell(0).setCellValue("Nishchith");
		row.createCell(0).setCellValue("Nishchith@gmail.com");
		
		
		DataFormatter dataformatter=new DataFormatter();
		Iterator<Row> roi=sheet.rowIterator();
		while(roi.hasNext())
		{
			row=roi.next();
	
			System.out.println("Current Row "+ row.getRowNum());
			Iterator<Cell> ci=row.cellIterator();
			while(ci.hasNext())
			{
				Cell cell=ci.next();
				String cellvalue=dataformatter.formatCellValue(cell);
				System.out.print(cellvalue+ "\t");
			}
			System.out.println(" ");
			
		}
		
		
		}
		
	}


