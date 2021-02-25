/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Joshua
 */
public class ModeloIncorrectas {
    double ris,rir,ria,rit;

    /**
     * constructor
     * @param ris respuestas incorrectas sumas
     * @param rir respuestas incorrectas restas
     * @param ria respuestas incorrectas alterno
     * @param rit  respuestas incorrectas 3 bloques
     */
    public ModeloIncorrectas(double ris, double rir, double ria, double rit) {
        this.ris = ris;
        this.rir = rir;
        this.ria = ria;
        this.rit = rit;
    }
    
    /**
     * respuestas incorrectas suma
     * @return respuestas incorrectas suma
     */
    public double getRis() {
        return ris;
    }
    /**
     * respuestas incorectas suma
     * @param ris respuestas incorrectas sumas
     */
    public void setRis(double ris) {
        this.ris = ris;
    }
    /**
     * respuestas incorrectas restas
     * @return respuestas incorrectas restas
     */
    public double getRir() {
        return rir;
    }

    /**
     * respuestas incorrectas restas
     * @param rir  respuestas incorrectas restas
     */
    public void setRir(double rir) {
        this.rir = rir;
    }
    
    /**
     * respuestas incorrectas alterno
     * @return respuestas incorrectas alterno
     */
    public double getRia() {
        return ria;
    }
    
    /**
     * respuestas incorrectas alterno
     * @param ria respuestas incorrectas alterno
     */
    public void setRia(double ria) {
        this.ria = ria;
    }
    
    /**
     * respuestas incorrectas 3 bloques
     * @return respuestas incorrectas 3 bloques
     */
    public double getRit() {
        return rit;
    }

    /**
     * respuestas incorrectas 3 bloques
     * @param rit respuestas incorrectas 3 bloques
     */
    public void setRit(double rit) {
        this.rit = rit;
    }

    @Override
    public String toString() {
        return "ModeloIncorrectas{" + "ris=" + ris + ", rir=" + rir + ", ria=" + ria + ", rit=" + rit + '}';
    }
    
}
