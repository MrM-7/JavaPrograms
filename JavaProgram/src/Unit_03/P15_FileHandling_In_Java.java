package Unit_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
//import java.util.List;

public class P15_FileHandling_In_Java {

	public static void main(String[] args) throws IOException {
		
		Test1 obj = new Test1();
		obj.takeInputFromAFile();
		obj.saveOutputIntoAFile();
		obj.saveLogOfProgram();
	}

}


class Test1{
	
	static int a = 10;
	
	void takeInputFromAFile() throws IOException{
		String  path = "C:\\Users\\Mehul raj\\git\\JavaPrograms\\JavaProgram\\src\\Unit_03\\Input.txt";
		
		File file = new File(path);
		// FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
//		String st;
//		
//		while((st = br.readLine()) != null) {
//			System.out.println(st);
//		}
		
		//List<String> listOfStrings = new ArrayList<String>();
		
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		String line = br.readLine();
		while(line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}
		
		for(String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println();
		
		br.close();
	}
	
	
	void saveOutputIntoAFile() throws IOException{
		FileWriter obj = null;
		
		try {
			
//			File file = new File("output.txt");
//			obj = new FileWriter(file);
			
			obj = new FileWriter("C:\\Users\\Mehul raj\\git\\JavaPrograms\\JavaProgram\\src\\Unit_03\\output.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(obj);
		
		String str = "Cristiano\nRonaldo CR7";
		
		f_writer.write(str);
		
		f_writer.close();
 	}
	
	void saveLogOfProgram() throws IOException {
		
		++a;
		//Find current time and Date
		LocalTime ltime = LocalTime.now();
		LocalDate ldate = LocalDate.now();
		
		FileWriter fr = null;
		
		
		try {
			fr = new FileWriter("C:\\Users\\Mehul raj\\git\\JavaPrograms\\JavaProgram\\src\\Unit_03\\log.txt",true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter br = new BufferedWriter(fr);
		
		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";
		
		try {
			br.write("Value of a: " + a + ", ");
			br.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		br.close();
 	}
}

















