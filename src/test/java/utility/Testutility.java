package utility;

import java.util.ArrayList;
import com.excel.lib.util.*;

public class Testutility {
	static Xls_Reader reader;
public static ArrayList<Object[]> getDataFromExcel() {
	// TODO Auto-generated method stub
	ArrayList<Object[]> mydata=new ArrayList<Object[]>();
	try {
	reader=new Xls_Reader("E:\\MedeilAutomation\\MedeilLogin\\src\\test\\java\\utility\\testdata.xlsx");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++) {
		String patientname=reader.getCellData("Sheet1", "PatientFirstName", rowNum);
		String PatientLastName=reader.getCellData("Sheet1", "PatientLastName", rowNum);
		String VATGST=reader.getCellData("Sheet1", "VATGST", rowNum);
		String Address1=reader.getCellData("Sheet1", "Address1", rowNum);
		String Address2=reader.getCellData("Sheet1", "Address2", rowNum);
		String PINCode=reader.getCellData("Sheet1", "PINCode", rowNum);
		String Country=reader.getCellData("Sheet1", "Country", rowNum);
		String State=reader.getCellData("Sheet1", "State", rowNum);
		String MobileNumber=reader.getCellData("Sheet1", "MobileNumber", rowNum);
		String EmailId=reader.getCellData("Sheet1", "EmailId", rowNum);
		String PhoneNumber=reader.getCellData("Sheet1", "PhoneNumber", rowNum);
	     Object ob[]= {patientname,PatientLastName,VATGST,Address1,Address2,PINCode,Country,State,MobileNumber,EmailId,PhoneNumber};
	     mydata.add(ob);
	}
	return mydata;
}
}

