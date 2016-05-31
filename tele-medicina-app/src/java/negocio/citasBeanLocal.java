/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


import entidades.registroVO;
import javax.ejb.Local;

/**
 *
 * @author carlos andres
 */
@Local
public interface citasBeanLocal {
    
    public boolean citas (registroVO registro);
    public String obtenerCita();
    
}
