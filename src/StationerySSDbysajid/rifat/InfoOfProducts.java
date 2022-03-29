/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static StationerySSDbysajid.rifat.WelcomePage.NumberOfProducts;

/**
 *
 * @author ASUS
 */
public class InfoOfProducts {
    
    public String data;
	public String[] arr;
        public static ArrayList<String> name = new ArrayList<String>();
        public static ArrayList<Integer> qty = new ArrayList<Integer>();
        public static ArrayList<Float> bprice = new ArrayList<Float>();
        public static ArrayList<Float> sprice = new ArrayList<Float>();
        public static ArrayList<Integer> id = new ArrayList<Integer>();
    InfoOfProducts(){
        //System.out.println("HI");
        NumberOfProducts=0;
        read(10000);
    }
	public void read(int wordNumber){
            //System.out.println("InWord");
		String filename = "ProductsInformation.txt";
		File  file = new File(filename);
		try{
			Scanner inp  = new Scanner(file);
			for(int i=0;i<wordNumber;i++){
                        data = inp.next();
                        data = data.replace('_', ' ');
                                arr = data.split(",");
                                id.add(Integer.parseInt(arr[0]));
                                name.add(arr[1]);
                                bprice.add(Float.parseFloat(arr[2]));
                                sprice.add(Float.parseFloat(arr[3]));
                                qty.add(Integer.parseInt(arr[4]));
                                NumberOfProducts++;
			}
                        //System.out.println("HIHIHIH");
			//System.out.println("Data Read From ProductsInfoFile");
			inp.close();
		}catch(Exception e){
                        return;
		}
	}
        public static void main(String[] args) {
        InfoOfProducts i = new InfoOfProducts();
            System.out.println(NumberOfProducts);
    }
}
