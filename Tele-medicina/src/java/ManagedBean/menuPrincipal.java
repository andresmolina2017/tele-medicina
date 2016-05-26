/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author carlos andres
 */
@ManagedBean
@RequestScoped
public class menuPrincipal {

    public void menuPrincipal() {
    }
     public String Citas(){
        return "Citasmedicas.xhtml";    
     } 
     public String Salud(){
        return "SaludDiaria.xhtml";    
     } 
     public String Resultados(){
        return "EnviarResultados.xhtml";    
     } 
     public String Ambulancia(){
        return "ServicioAmbulancia.xhtml";    
     } 
      public String Cancelar(){
        return "Logout.xhtml";
      }
}
