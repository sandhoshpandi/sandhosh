package utility;

import java.util.ArrayList;
import com.excel.lib.util.*;

public class LoginTestutility {
	static Xls_Reader reader;
public static ArrayList<Object[]> getDataFromExcel1() {
	// TODO Auto-generated method stub
	ArrayList<Object[]> mydata=new ArrayList<Object[]>();
	try {
	reader=new Xls_Reader("E:\\MedeilAutomation\\MedeilLogin\\src\\test\\java\\utility\\testdata.xlsx");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	int rowcount=reader.getRowCount("Sheet2");
	for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String username=reader.getCellData("Sheet2", "username", rowNum);
		String password=reader.getCellData("Sheet2", "password", rowNum);
		
	     Object ob[]= {username,password};
	     mydata.add(ob);
	}
	return mydata;
}
}

