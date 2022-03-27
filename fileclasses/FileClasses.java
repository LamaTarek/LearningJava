
package fileclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClasses {

    public static void main(String[] args) throws IOException {
        
        //Create new file
        File newFile=new File("newFile.txt");
        try {
            boolean flag=newFile.createNewFile();
            if(flag)System.out.println("Created");
            else System.out.println("Cancel");
        } catch (IOException ex) {
            Logger.getLogger(FileClasses.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Write
        try {
            FileWriter newWrite=new FileWriter("newFile.txt");
            String s="Hello Java!";
            newWrite.write(s);
            newWrite.close();
        } catch (IOException ex) {
            Logger.getLogger(FileClasses.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Read
        try {
            FileReader newRead=new FileReader("newFile.txt");
            char[]arr=new char[20];
            newRead.read(arr);
            newRead.close();
            System.out.println(arr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClasses.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        //Delete
        File deleFile=new File("newFile.txt");
        deleFile.delete();
        
    }
    
}
