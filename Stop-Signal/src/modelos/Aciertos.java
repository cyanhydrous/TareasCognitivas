/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Joshua
 */
public class Aciertos {
    int acierto;

    public int getAcierto() {
        return acierto;
    }

    public void setAcierto(int acierto) {
        this.acierto = acierto;
    }

    public Aciertos(int acierto) {
        this.acierto = acierto;
    }

    @Override
    public String toString() {
        return "Aciertos{" + "acierto=" + acierto + '}';
    }
    
}
