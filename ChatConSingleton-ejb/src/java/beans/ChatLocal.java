/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Queue;
import javax.ejb.Local;

/**
 *
 * @author Rusok
 */
@Local
public interface ChatLocal {

    void agregarMensaje(String mensaje, String autor);

    Queue obtenerMensajes();
    
}
