package JavaPropertiesExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileStreamOut {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\JavaPropertiesExcel\\objects.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("Address"));
		

	}

}
