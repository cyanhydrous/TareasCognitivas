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
public class DAOInvalida {
    // Reactivos sin respuestas y con respuestas invalida

    double ONt;
    double ONat;

    /**
     * este metodo permite calcular las omisiones y respuestas nulas en toda la
     * tarea
     *
     * @param onl omisiones y respuestas nulas en el bloque de solo letras
     * @param onn omisiones y respuestas nulas en el bloque de solo numeros
     * @param ona omisiones y respuestas nulas en el bloque alternado
     * @return ont omisiones y respuestas nulas en toda la tarea
     *
     */
    public double OmiResNulTodTar(double onl, double onn, double ona) {
        this.ONt = onl + onn + ona;
        return this.ONt;
    }

    /**
     * este metodo permite calcular las omisiones y respuestas nulas en toda la
     * tarea
     *
     * @param onal omisiones y respuestas nulas en el bloque de solo letras
     * @param onan omisiones y respuestas nulas en el bloque de solo numeros
     * @param onaa omisiones y respuestas nulas en el bloque alternado
     * @return onat omisiones y respuestas nulas en toda la tarea
    *
     */
    public double OmiResNulTodTarea(double onal, double onan, double onaa) {
        this.ONat = onal + onan + onaa;
        return this.ONat;
    }

}
