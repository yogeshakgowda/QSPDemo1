package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDatainPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata1.properties");
		Properties pObj = new Properties();
		pObj.setProperty("Browser", "chrome");
		pObj.setProperty("url", "https://www.google.com");
		pObj.setProperty("username", "admin");
		pObj.setProperty("password", "admin");
		FileOutputStream fOut = new FileOutputStream("./src/test/resources/commondata1.properties");
		pObj.store(fOut, "Writing the data");
		

	}

}
