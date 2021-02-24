/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Joshua
 */
public class Calculos {
    double es,esa;
    
    public double ES( double mti, double mtc,double tti, double ttc){
        this.es=(mti*(tti/60))-(mtc*(ttc/60));
        return this.es;
    }
    
    public double ESA(double ca,double mti, double mtc,double tti, double ttc){
        this.esa= (mti*(tti/ca))-(mtc*(ttc/ca));
        return this.esa;
    }
}
