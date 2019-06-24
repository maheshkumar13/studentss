package scaits.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil {
	
	public static List<List<String>> getRows(InputStream inputStream, int colCnt) {
		List<List<String>> rows = new ArrayList<List<String>>();
		try {
			Workbook workbook = new XSSFWorkbook(inputStream);
			return getRows(workbook, colCnt);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	
	public static List<List<String>> getRows(File file, int colCnt) {
		List<List<String>> rows = new ArrayList<List<String>>();
		try {
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			return getRows(workbook, colCnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
	
	public static List<List<String>> getRows(Workbook workbook, int colCnt) {
		List<List<String>> rows = new ArrayList<List<String>>();
		try {
			Sheet sheet = workbook.getSheetAt(0);
			int rowCnt = sheet.getLastRowNum();
			for (int r = 0; r < rowCnt; r++) {
				List<String> row = new ArrayList<String>();
				int cnt = 0;
				for (Sheet sh : workbook) {
					row.add(sh.getRow(r).getSheet().getSheetName());
					if (sh.getLastRowNum() == 0) {
						cnt++;
					}
				}
			/*	for (int c = 0; c < colCnt; c++) {
					// System.out.println(sheet.getColumn(c)[r].getContents());
					try {
						row.add(sheet.getColumn(c)[r].getContents());
						if (row.get(c).length() == 0) {
							cnt++;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}*/
				

				if (cnt != colCnt) {
					rows.add(row);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}


}
