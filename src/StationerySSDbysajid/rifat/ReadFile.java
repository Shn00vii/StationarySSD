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
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class ReadFile {
    String[] PrdNames;
    int[] PrdIds;
    int[] PrdQtys;
    float[] PrdBuyingPrices;
    float[] PrdSellingPrices;
    int NumberOfPrds;
    ReadFile(){
        PrdNames = new String[10000];
        PrdIds = new int[10000];
        PrdQtys = new int[10000];
        PrdBuyingPrices = new float[10000];
        PrdSellingPrices = new float[10000];
        NumberOfPrds=0;
    }
    
    public int ReadProducts(String Path){
        String line = "";  
        String splitBy = ",";  
        
        try   
        {  
            BufferedReader br = new BufferedReader(new FileReader(Path));
            if (br.readLine() == null) {
                
                System.out.println("No errors, and file empty");
                return 0;
            }
            
            
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] Info = line.split(splitBy);    // use comma as separator
         
                             
                //System.out.println(Info[0]+" "+Info[1]+" "+Info[2]+" "+Info[3]+" "+Info[4]); 
                PrdIds[NumberOfPrds]=Integer.parseInt(Info[0]);
                PrdNames[NumberOfPrds]=Info[1];
                PrdBuyingPrices[NumberOfPrds]=Float.parseFloat(Info[2]);
                PrdSellingPrices[NumberOfPrds]=Float.parseFloat(Info[3]);
                PrdQtys[NumberOfPrds]=Integer.parseInt(Info[4]);
                NumberOfPrds++;
                
            } 
            br.close();
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
        return NumberOfPrds;
    }
    public String[] GetProductNames(){
        System.out.println("Prd Name sent");
        return PrdNames;
    }
    public int[] GetProductIds(){
        System.out.println("Prd Id sent");
        return PrdIds;
    }
    public float[] GetPrdBuyingPrices(){
        System.out.println("Prd BPrice sent");
        return PrdBuyingPrices;
    }
    public float[] GetPrdSellingPrices(){
        System.out.println("Prd SPrice sent");
        return PrdSellingPrices;
    }
    public int[] GetPrdQtys(){
        System.out.println("Prd Qty sent");
        return PrdQtys;
    }
    
}
