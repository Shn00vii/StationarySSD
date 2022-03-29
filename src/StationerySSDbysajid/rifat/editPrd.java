/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class editPrd {
    public boolean edit(String Path, String name, String newName , int newQty , float newBprice , float newSprice){
        ReadFile r = new ReadFile();
        int n = r.ReadProducts(Path);
        String[] names = r.GetProductNames();
        int[] qtys = r.GetPrdQtys();    
        int[] ids = r.GetProductIds();
        float[] bprices = r.GetPrdBuyingPrices();
        float[] sprices = r.GetPrdSellingPrices(); 
        File file = new File(Path);
        if(file.delete()){
            System.out.println("deleted");
            append a = new append();
        a.AppendToFile(Path, 0,"0",  0, 0, 0);
        for(int i=0;i<n;i++){
            if(!names[i].equals(name)){
                a.AppendToFile(Path,  ids[i], names[i], bprices[i], sprices[i],qtys[i]);   
            }
            else{
                a.AppendToFile(Path,  ids[i], newName, newBprice, newSprice,newQty);
            }
        }
            return true;
        }
        return false;
        
    }
    public boolean remove(String Path, String name){
        ReadFile r = new ReadFile();
        int n = r.ReadProducts(Path);
        String[] names = r.GetProductNames();
        int[] qtys = r.GetPrdQtys();    
        int[] ids = r.GetProductIds();
        float[] bprices = r.GetPrdBuyingPrices();
        float[] sprices = r.GetPrdSellingPrices(); 
        File file = new File(Path);
        if(file.delete()){
            System.out.println("deleted");
            append a = new append();
        a.AppendToFile(Path, 0,"0",  0, 0, 0);
        for(int i=0;i<n;i++){
            if(!names[i].equals(name)){
                a.AppendToFile(Path,  ids[i], names[i], bprices[i], sprices[i],qtys[i]);   
            }
        }
        return true;
        }
        return false;
    } 
}
