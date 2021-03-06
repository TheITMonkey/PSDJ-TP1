package UniversalCalculatorModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UniversalCalculatorData 
{
    public static void saveUsers(String nomeFicheiro, Users users) throws FileNotFoundException
    {
       try
       {
           File file = new File(nomeFicheiro);
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           
           oos.writeObject(users);
           oos.flush();
           oos.close();
           fos.close();
       }
       catch(Exception e)
       {
       }        
    }
    
    public static Users loadUsers(String nomeFicheiro) throws FileNotFoundException
    {   
       Users users = new Users();
       try
       {
           File toRead = new File(nomeFicheiro);
            try (FileInputStream fis = new FileInputStream(toRead); 
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                
                users = (Users)ois.readObject();
                
            }
       }
       catch(IOException | ClassNotFoundException e)
       {
       } 
       
       return users;
    }
}