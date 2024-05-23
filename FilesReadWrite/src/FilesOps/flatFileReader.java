package FilesOps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class flatFileReader {

	public static void main(String[] args) throws IOException {
		
		//File Reae opens file along wit buffered reader
		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\filesdemoreadwrite\\myFlatFile.txt");
		BufferedReader freader=new BufferedReader(fr);
		
//		System.out.println(freader.readLine());
//		System.out.println(freader.readLine());
		
		String i="";
		// freader.readline -> reads one line , loop to output whole content
		while((i = freader.readLine()) !=null)
		{
			
			System.out.println(i);
			
		}
		freader.close();
		

	
	}

}
