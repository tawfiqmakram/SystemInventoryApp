/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp.Tawfiq.Client;

import java.util.ArrayList;

/**
 *
 * @author tawfiq makram
 */
public class ClientService extends ClientServiceBase implements IClientService{
    String name;
    @Override
    public boolean loginClients(String name, String password) {
        this.name =name;
        super.Client = getClients();
        for(ClientData myclient : Client){
            if(myclient.name.equals(name)){
                if( password.equals(myclient.password)){
                    return true;
                }
            }
        }
        return false;
    }    
    @Override
    public boolean register(String name, String password) {
        super.Client = getClients();
        
        if(Client != null){// for check on the name if it is unique or not
            for(ClientData myclient:Client){
            if( name.equals(myclient.name)){
                return false;
            }
           }
        }
        
        ClientData a=new ClientData();
        if(Client == null){//set id for new user this is special case when the array list is null 
            Client=new ArrayList<ClientData>();
            a.id = 1;
        }
        else{//set id for new user
            a.id =Client.get(Client.size() -1).id +1;
        }
        
        a.name=name;
        a.password=password;
        
        super.Client.add(a);
        super.saveClients();
        return true;
    }
   
}
