/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import ofelia.model.dao.impl.periodoDaoImpl;
import ofelia.model.dao.periodoDao;
import ofelia.model.entity.periodo;

/**
 *
 * @author Jhordani
 */
public class MainJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainJPA m = new MainJPA();
       //m.listarperiodo();
       m.agregar();
    }
     public void listarperiodo(){
    periodoDao dao= new periodoDaoImpl();
        for (periodo col : dao.listarperiodo()) {
            System.out.println("Nombres :  "+col.getPeriodo());
        }    
    }

     public void agregar(){
         periodo p = new periodo();
         periodoDao pe = new periodoDaoImpl();
         p.setPeriodo("2015/12/07");
         if (pe.agregarPeriodo(p)) {
             System.out.println("agregado");
         }
     }
}
