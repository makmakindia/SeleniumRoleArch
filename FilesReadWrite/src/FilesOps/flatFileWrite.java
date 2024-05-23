package FilesOps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class flatFileWrite {

	public static void main(String[] args) throws IOException {
	
		// file creation 
//		System.out.println(System.getProperty("user.dir"));
		File f=new File(System.getProperty("user.dir")+"\\filesdemoreadwrite\\myFlatFile.txt");
		f.createNewFile();
		
		//Writing into Fie 
		FileWriter fw= new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This the first text writing into file programatically...!!!");
		bw.newLine();
		
		// close connection 
		bw.flush();
		
		System.out.println("File created succesfully ....!");

	}

}
