/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class AppendFile {
    public void AppendProducts(String Path,String name,int id,int qty,float bprice,float sprice){
        
        try {
            BufferedReader itemsCSV = new BufferedReader(new FileReader(Path));
            String dataRow = itemsCSV.readLine();
            String[] rows = new String[100];
            String[] dataArray = new String[200];
 
 
            while (dataRow != null){
     
                for(int x = 0; x < 1; x++){
     
                    dataArray = dataRow.split("\n");
          
                    rows[x] = dataArray[0];
                    dataRow = itemsCSV.readLine(); // Read next line of data.
     
                }
            }
            itemsCSV.close();
   
        FileWriter writer = new FileWriter(Path,true);
     
        for(int p = 0; p<rows.length; p++){
            writer.append(rows[p]);
        }
        
        writer.append(String.valueOf(id));
        writer.append(',');
        writer.append(name);
        writer.append(',');
        writer.append(String.valueOf(bprice));
        writer.append(',');
        writer.append(String.valueOf(sprice));
        writer.append(',');
        writer.append(String.valueOf(qty));
        writer.append(',');
        writer.append('\n');
        writer.append(',');
        writer.flush();
        writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        } 
    }
}
