package com.revature.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.EmployeeBean;

public class EmployeeToFile {

	public static final String employeeFile = "employeeFile.txt";
	
	public static void writeEmployeeFile (List<EmployeeBean> a) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(employeeFile));
			objectOut.writeObject(a);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void readEmployeeFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(employeeFile));
			UserLists.employeeFile = (ArrayList<EmployeeBean>) objectIn.readObject();
			objectIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
