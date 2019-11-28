/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp.Tawfiq.Client;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author tawfiq makram
 */
public abstract class ClientServiceBase implements Serializable{
    protected ArrayList<ClientData> Client=new ArrayList<ClientData>(); 
    String path="FileManager.bin";
    IFileManager Fileb=new FileManager();
    public  ArrayList<ClientData> getClients(){
        
        return (ArrayList<ClientData>)Fileb.read(path);
        
    }
    public boolean saveClients(){
        return Fileb.write(path, Client);
    }
}
