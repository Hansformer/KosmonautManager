
package kosmonautmanager.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Reads text files and assigns names for cosmonauts
 * @author Hansformer
 */
public class Namecontrol {
    private ArrayList<String> males = new ArrayList<>();
    private ArrayList<String> females = new ArrayList<>();
    private ArrayList<String> surnames = new ArrayList<>();
    
    public Namecontrol(){
        try {
            fillNameLists();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    private void fillNameLists() throws IOException{
        
        String thisLine = null;
        
         try {
            BufferedReader br = new BufferedReader(new FileReader("src/resource/nameslast.txt"));
            while ((thisLine = br.readLine()) != null) {
//            System.out.println(thisLine);
            surnames.add(thisLine);
            }
            
            br.close();
            
            BufferedReader br2 = new BufferedReader(new FileReader("src/resource/namesmale.txt"));
            while ((thisLine = br2.readLine()) != null) {
//            System.out.println(thisLine);
            males.add(thisLine);
            }
            
            br2.close();
            
            BufferedReader br3 = new BufferedReader(new FileReader("src/resource/namesfemale.txt"));
            while ((thisLine = br3.readLine()) != null) {
//            System.out.println(thisLine);
            females.add(thisLine);
            }
            
            br3.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
             System.out.println(ex);
        }
    }
    
    public String getFirstMale(int offset) {
        return males.get(offset);
    }
    
    public String getSurname(int offset) {
        return surnames.get(offset);
    }
    
    public String getFirstFemale(int offset) {
        return females.get(offset);
    }
    
    public int getArraySizeMale() {
        return males.size();
    }
    
    public int getArraySizeSurname() {
        return surnames.size();
    }
    
    public int getArraySizeFemale() {
        return females.size();
    }
}
