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
public class Errores {
    int errores;

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public Errores(int errores) {
        this.errores = errores;
    }

    @Override
    public String toString() {
        return "Errores{" + "errores=" + errores + '}';
    }
    
}
