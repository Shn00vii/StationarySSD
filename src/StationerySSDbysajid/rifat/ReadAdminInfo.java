/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
/**
 *
 * @author ASUS
 */
public class ReadAdminInfo {
    public String data;
    public String[] arr;
	public String[] read(int wordNumber){
		String filename = "AdminUsernamePasswordFile.txt";
		File  file = new File(filename);
		try{
			Scanner inp  = new Scanner(file);
			
			for(int i=1;i<=wordNumber;i++){
				data = inp.next();
			}
			data = data.replace('_', ' ');
			arr = data.split(",");
			System.out.println( arr[2]);
			//List<String> lst = Arrays.asList(arr);
			inp.close();
                        System.out.println("Data Read From AdminUsernamePasswordFile");
		}catch(Exception e){
			System.out.println("file not found");
		}
		return arr;
	}
}
