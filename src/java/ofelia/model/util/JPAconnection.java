/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jhordani
 */
public class JPAconnection {
     private static EntityManagerFactory ef;

    public JPAconnection() {
    }
    
    public static EntityManagerFactory getInstance(){
    
        if (ef==null) {
            ef=Persistence.createEntityManagerFactory("ofelia");
        }
    return ef;
    }
}
