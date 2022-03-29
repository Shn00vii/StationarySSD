/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */

public class UpdateFile {      
    private static Scanner s;
    public static void main(String[] args) {
         String Path = "CSVDemo.csv";
         String RemoveItem = "string";
        removeRecord(Path,RemoveItem);
    }
    
   
    public static void removeRecord(String Path,String RemoveItem){
        String tmpFile = "tmp1.csv";
        File OldFile = new File(Path);
        File NewFile = new File(tmpFile);
        int id,qty;
        String name ="";
        float bp,sp;
        try{
            FileWriter fw = new FileWriter(tmpFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            s = new Scanner(new File(Path));
            s.useDelimiter("[,\n]");
            while(s.hasNext()){
                id=s.nextInt();
                name=s.next();
                bp=s.nextFloat();
                sp=s.nextFloat();
                qty=s.nextInt();
                //System.out.println(name);
                if(!name.equals(RemoveItem)){
                    pw.println(Integer.toString(id)+","+name+","+Float.toString(bp)+","+Float.toString(sp)+","+Integer.toString(qty));
                }
            }
            s.close();
            pw.flush();
            pw.close();
            OldFile.delete();
            File dmp = new File(Path);
            NewFile.renameTo(dmp);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
}
