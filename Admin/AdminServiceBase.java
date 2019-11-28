/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp.Tawfiq.Admin;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author tawfiq makram
 */
public abstract class  AdminServiceBase implements Serializable{
    protected ArrayList<AdminData> Admin=new ArrayList<AdminData>(); 
    String path="FileManager.bin";
    IFileManager Fileb=new FileManager();
    public  ArrayList<AdminData> getAdmins(){
        
        return (ArrayList<AdminData>)Fileb.read(path);
        
    }
    public boolean saveAdmins(){
        return Fileb.write(path, Admin);
    }

            
}
