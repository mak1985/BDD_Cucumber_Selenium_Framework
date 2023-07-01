package com.orangehrmlive.helpers;


import com.orangehrmlive.utils.CommonUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ExcelHelper extends CommonUtils {
    public FileInputStream fis;
    public FileOutputStream fos;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    String path=null;
    ExcelHelper(String path)
    {
        this.path=path;
    }

    public int getRowCount(String sheetName) throws IOException {
        fis= new FileInputStream(path);
        workbook=new XSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);
        int rowcount=sheet.getLastRowNum();
        workbook.close();
        fis.close();
        return rowcount;
    }
    public int getCellCount(String sheetName, int rownumber) throws IOException {
        fis=new FileInputStream(path);
        workbook=new XSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownumber);
        int cellcount=row.getLastCellNum();
        fis.close();
        return cellcount;
    }
    public String getCellData(String sheetName, int rownumber, int columnnumber) throws IOException {
        fis=new FileInputStream(path);
        workbook=new XSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownumber);
        cell=row.getCell(columnnumber);

        DataFormatter formatter = new DataFormatter();
        String data;
        try{
            data = formatter.formatCellValue(cell);
        }
        catch (Exception e)
        {
            data="";
        }
        workbook.close();
        fis.close();
        return data;
    }

    public void writeCellData(String sheetName, int rownum, int colnum, String data) throws IOException
    {
        fis=new FileInputStream(path);
        workbook=new XSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);

        row=sheet.getRow(rownum);
        cell=row.createCell(colnum);
        cell.setCellValue(data);

        fos=new FileOutputStream(path);
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();
    }
}
