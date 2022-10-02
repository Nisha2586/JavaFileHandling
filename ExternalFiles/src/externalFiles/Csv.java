package externalFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv {

	public static void main(String[] args) throws IOException {
		
		
		List<String> myList = new ArrayList<String>();
		String path ="myData//mycsv.csv";
		File f= new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//System.out.println(br.readLine());
		
		String line ="";
		while((line=br.readLine())!= null){
			//System.out.println(line);
			myList.add(line);
		}
		System.out.println(myList);
		System.out.println(myList.get(1).split(",")[0]);
		
		
	}

}
