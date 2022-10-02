package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Html {

	public static void main(String[] args) throws IOException,Exception {
		// TODO Auto-generated method stub
		
		String title = "ABC";
		String msg ="Hello";
		
		if(title.isEmpty()) {//if something changes my title to empty,then i want to crash my code,tats y throw used.
			throw new Exception();//throw always pair with some condition 
		}
		String path1 ="myData//htmlWrite.html.";
		File f1= new File(path1);
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("<html>");
		bw.newLine();
		bw.write("<head>");
		bw.newLine();
		bw.write("<title>"+title+"</title>");
		bw.newLine();
		bw.write("</head>");
		bw.newLine();
		bw.write("<body>");
		bw.newLine();
		bw.write("<p>"+msg +"</p>");
		bw.newLine();
		bw.write("</body>");
		bw.newLine();
		bw.write("</html>");
		bw.newLine();
		bw.close();

	}

}
