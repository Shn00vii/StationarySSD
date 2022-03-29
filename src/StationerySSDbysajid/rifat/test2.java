package StationerySSDbysajid.rifat;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class test2 {
    public static void main(String[] args){
        salepanel sa = new salepanel();
        
        sa.setVisible(true);
        try{
            Writer output;
            String username="shad reza";
            String phnnumber="01779575995";
            output = new BufferedWriter(new FileWriter("new.txt",true));
            java.util.Date date=new java.util.Date();  
            String s = String.valueOf(date);
            output.append(s+"\n"+username+"---"+phnnumber+"\n");
            String[]name={"a","b","c","d"};
            float[]pr={1,2,3,4};
            int[]qt={1,2,3,4};
            float c=0,p=0;
            for(int i=0;i<4;i++){
                p=(pr[i]*qt[i]);
                c+=(pr[i]*qt[i]);
                output.append(name[i]+"-"+String.valueOf(qt[i])+"-"+String.valueOf(qt[i])+"-"+String.valueOf(p)+"\n");
                
            }
            output.append("Total Cost : "+String.valueOf(c)+"\n@\n");
            
            output.close();
            //read();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static  void read(){
        
        try {
      File myObj = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\StationerySSD\\new.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        
        String data = myReader.nextLine();
        if(data.equals("@")){
            System.out.println("\n\n");
        }
        else{        
            System.out.println(data);
        }
        
        
      }
      myReader.close();
    } catch (FileNotFoundException e) {
        
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}