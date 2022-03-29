/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class getvatordisc {
    public float getvatordiscget(String Path){
        String data="";
        float f;
        try {
            File myObj = new File(Path);
            Scanner myReader = new Scanner(myObj);  
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            try{
                f=Float.parseFloat(data);
                return f;
            }
            catch(Exception e){
                System.out.println("iner An error occurred.");
                e.printStackTrace();
                
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return 0;
        }
        return 0;
    }
}
