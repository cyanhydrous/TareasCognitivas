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
public class ModeloTiempo {
    double ts,tr,ta,tt;
    /**
     * constructor
     * @param ts tiempo sumas
     * @param tr tiempo restas
     * @param ta tiempo alterno
     * @param tt  tiempo 3 bloques
     */
    public ModeloTiempo(double ts, double tr, double ta, double tt) {
        this.ts = ts;
        this.tr = tr;
        this.ta = ta;
        this.tt = tt;
    }
    
    /**
     * tiempo sumas
     * @return tiempo sumas
     */
    public double getTs() {
        return ts;
    }
    /**
     * tiempo sumas
     * @param ts tiempo sumas
     */
    public void setTs(double ts) {
        this.ts = ts;
    }
    
    /**
     * tiempo restas
     * @return tiempo restas
     */
    public double getTr() {
        return tr;
    }
    /**
     * tiempo restas
     * @param tr tiempo restas
     */
    public void setTr(double tr) {
        this.tr = tr;
    }
    /**
     * tiempo alterno
     * @return tiempo alterno
     */
    public double getTa() {
        return ta;
    }
    /**
     * tiempo alterno
     * @param ta tiempo alterno
     */
    public void setTa(double ta) {
        this.ta = ta;
    }
    /**
     * tiempo 3 bloques
     * @return tiempo 3 bloques
     */
    public double getTt() {
        return tt;
    }
    /**
     * tiempo 3 bloques
     * @param tt tiempo 3 bloques
     */
    public void setTt(double tt) {
        this.tt = tt;
    }

    @Override
    public String toString() {
        return "ModeloTiempo{" + "ts=" + ts + ", tr=" + tr + ", ta=" + ta + ", tt=" + tt + '}';
    }
    
    
}
