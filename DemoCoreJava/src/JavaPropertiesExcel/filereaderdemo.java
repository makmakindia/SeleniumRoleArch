package JavaPropertiesExcel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereaderdemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\FilesDemo\\myTextFile.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
	
		String line=null;
		
		while((line= reader.readLine())!=null) {
			System.out.println(line);
		}
		
		
		
		reader.close();

	}

}
