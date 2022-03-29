package StationerySSDbysajid.rifat;

import java.io.IOException; 
import java.nio.file.*; 
  
public class Test3 
{ 
    public static void main(String[] args) 
    { 
        String Path = "CSVDemo.csv";
        try
        { 
            Files.deleteIfExists(Paths.get(Path)); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
} 