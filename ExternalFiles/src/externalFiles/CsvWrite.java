package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path1 ="myData//csvwrite.csv";
		File f1= new File(path1);
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("hello all here,mary");
		bw.newLine();
		bw.close();

	}

}
