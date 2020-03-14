/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import javax.ejb.Singleton;

/**
 *
 * @author Rusok
 */
@Singleton
public class Chat implements ChatLocal {
    Queue<String> mensajes = new LinkedList<String>();
    /*
    Cola de objetos Mensaje {mensaje, autor, fecha}
    */
    @Override
    public void agregarMensaje(String mensaje, String autor) {
        Date d = new Date();
        String msg = autor + ": "
                + mensaje + "(" +
                d.getTime() + ")";
        mensajes.add(msg);
    }

    @Override
    public Queue obtenerMensajes() {
        return mensajes;
    }
    
    
}
