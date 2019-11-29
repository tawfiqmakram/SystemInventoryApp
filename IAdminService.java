/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp.Tawfiq.Admin;

/**
 *
 * @author tawfiq makram
 */
public interface IAdminService {
    public boolean loginAdmin(String name,String password);
    public boolean register(String name,String password);
}
