package StationerySSDbysajid.rifat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class ReadWordClass {
	public String data;
	public String[] arr;
	public String[] read(int wordNumber){
		String filename = "ProductsInfoFile.txt";
		File  file = new File(filename);
		try{
			Scanner inp  = new Scanner(file);
			
			for(int i=0;i<wordNumber;i++){
				data = inp.next();
			}
			data = data.replace('_', ' ');
			arr = data.split(",");
			System.out.println( arr[2]);
			System.out.println("Data Read From ProductsInfoFile");
			inp.close();
		}catch(Exception e){
			System.out.println("file not found");
		}
		return arr;
	}
}