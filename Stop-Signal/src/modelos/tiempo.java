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
public class tiempo {
    double ttc,tti;

    public tiempo(double ttc, double tti) {
        this.ttc = ttc;
        this.tti = tti;
    }

    public double getTtc() {
        return ttc;
    }

    public void setTtc(double ttc) {
        this.ttc = ttc;
    }

    public double getTti() {
        return tti;
    }

    public void setTti(double tti) {
        this.tti = tti;
    }

    @Override
    public String toString() {
        return "tiempo{" + "ttc=" + ttc + ", tti=" + tti + '}';
    }
    
}
