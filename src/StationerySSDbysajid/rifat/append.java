/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author ASUS
 */
public class append {
    public boolean AppendToFile(String Path,int id,String name,float bprice,float sprice,int qty){
        try{
            Writer output;
            output = new BufferedWriter(new FileWriter(Path,true));
            output.append(String.valueOf(id)+","+name+","+String.valueOf(bprice)+","+String.valueOf(sprice)+","+String.valueOf(qty)+"\n");
            output.close();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
