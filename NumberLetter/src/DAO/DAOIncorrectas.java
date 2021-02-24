/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Joshua
 */
public class DAOIncorrectas {

    double It;
    double RIat;

    /**
     * este metodo permite calcular las respuestas incorrectas en toda la tarea
     *
     * @param il respuestas incorrectas en el bloque de solo letras
     * @param in respuestas incorrectas en el bloque de solo numeros
     * @param ia respuestas incorrectas del bloque alternado
     * @return it respuestas incorrectas en toda la tarea
     *
     */
    public double ResIncTodTar(double il, double in, double ia) {
        this.It = il + in + ia;
        return this.It;

    }

    /**
     * este metodo permite calcular las respuestas incorrectas en toda la tarea
     *
     * @param rial respuestas incorrectas del bloque de solo letras
     * @param rian respuestas incorrectas del bloque de solo numeros
     * @param riaa respuestas incorrectas del bloque alterno
     * @return riat respuestas incorrectas en toda la tarea
    *
     */
    public double ResIncTodTarea(double rial, double rian, double riaa) {
        this.RIat = rial + rian + riaa;
        return this.RIat;
    }
}
