package generic;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data {
	public static String  get_data(String sh, int r,int c) 
	{
		String value=null;
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/Excel1.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sheet=(Sheet) book.getSheet(sh);
			Row row=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(r);
			Cell cell=row.getCell(row);
			value=cell.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value

}
