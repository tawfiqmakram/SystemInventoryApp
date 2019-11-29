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
    IFileManager <ArrayList<ClientData>> Fileb=new FileManager ArrayList<ClientData>();
    public  boolean getClients(){
        try{
            Client=Fileb.read(path);
            return true;
        }
        catch(Exception e){
            return false;
        }
        
    }
    public boolean saveClients(){
        return Fileb.write(path, Client);
    }
}
