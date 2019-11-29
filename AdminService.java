/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp.Tawfiq.Admin;

import java.util.ArrayList;

/**
 *
 * @author tawfiq makram
 */
public class AdminService extends AdminServiceBase implements IAdminService {
    String name;
    @Override
    public boolean loginAdmin(String name, String password) {
        this.name =name;
        super.Admin = getAdmins();
        for(AdminData myadmin : Admin){
            if(myadmin.name.equals(name)){
                if( password.equals(myadmin.password)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean register(String name, String password) {
        super.Admin = getAdmins();
        
        if(Admin != null){// for check on the name if it is unique or not
            for(AdminData myadmin:Admin){
            if( name.equals(myadmin.name)){
                return false;
            }
           }
        }
        
        AdminData a=new AdminData();
        if(Admin == null){//set id for new user this is special case when the array list is null 
            Admin=new ArrayList<AdminData>();
            a.id = 1;
        }
        else{//set id for new user .
            a.id =Admin.get(Admin.size() -1).id +1;
        }
        
        a.name=name;
        a.password=password;
        
        super.Admin.add(a);
        super.saveAdmins();
        return true;
    }
}
