package JavaPropertiesExcel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing2filetxtcsv {

	public static void main(String[] args) throws IOException {
	
//		File f = new File(System.getProperty("user.dir")+"\\FilesDemo\\myTextFile.txt"); // flat file createtion 
		File f = new File(System.getProperty("user.dir")+"\\FilesDemo\\myTextFile.csv"); // excel file createtion 
		
		FileWriter fw = new FileWriter(f,false); // true for append data , false for overwrite data 
		BufferedWriter writer = new BufferedWriter(fw);
		
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				
				int num = (int) (Math.random()*100);
//				writer.write(num+"\t"); // tab separated file
				writer.write(num+",");
			}
			writer.newLine();
		}
		
		
		writer.close();
		System.out.println("File Created ...!!!");
		

	}

}
