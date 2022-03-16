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
	int rowcount=reader.getRowCount("Sheet1");
	for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String patientname=reader.getCellData("Sheet1", "PatientFirstName", rowNum);
		String PatientLastName=reader.getCellData("Sheet1", "PatientLastName", rowNum);
		String Gender=reader.getCellData("Sheet1", "Gender", rowNum);
		String dob=reader.getCellData("Sheet1", "dob", rowNum);
		String VATGST=reader.getCellData("Sheet1", "VATGST", rowNum);
		String Category=reader.getCellData("Sheet1", "Category", rowNum);
		String patienttype=reader.getCellData("Sheet1", "patienttype", rowNum);
		String Address1=reader.getCellData("Sheet1", "Address1", rowNum);
		String Address2=reader.getCellData("Sheet1", "Address2", rowNum);
		String PINCode=reader.getCellData("Sheet1", "PINCode", rowNum);
		String Country=reader.getCellData("Sheet1", "Country", rowNum);
		String State=reader.getCellData("Sheet1", "State", rowNum);
		String City=reader.getCellData("Sheet1", "City", rowNum);
		String MobileNumber=reader.getCellData("Sheet1", "MobileNumber", rowNum);
		String EmailId=reader.getCellData("Sheet1", "EmailId", rowNum);
		String PhoneNumber=reader.getCellData("Sheet1", "PhoneNumber", rowNum);
	     Object ob[]= {patientname,PatientLastName,Gender,dob,VATGST,Category,patienttype,Address1,Address2,PINCode,Country,State,City,MobileNumber,EmailId,PhoneNumber};
	     mydata.add(ob);
	}
	return mydata;
}
}

