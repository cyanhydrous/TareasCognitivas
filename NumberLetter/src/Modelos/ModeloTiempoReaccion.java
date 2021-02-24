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
public class ModeloTiempoReaccion {
    double tcal,tcan,tcaa,tcai,tcap;

    public ModeloTiempoReaccion(double tcal, double tcan, double tcaa, double tcai, double tcap) {
        this.tcal = tcal;
        this.tcan = tcan;
        this.tcaa = tcaa;
        this.tcai = tcai;
        this.tcap = tcap;
    }

    public double getTcal() {
        return tcal;
    }

    public void setTcal(double tcal) {
        this.tcal = tcal;
    }

    public double getTcan() {
        return tcan;
    }

    public void setTcan(double tcan) {
        this.tcan = tcan;
    }

    public double getTcaa() {
        return tcaa;
    }

    public void setTcaa(double tcaa) {
        this.tcaa = tcaa;
    }

    public double getTcai() {
        return tcai;
    }

    public void setTcai(double tcai) {
        this.tcai = tcai;
    }

    public double getTcap() {
        return tcap;
    }

    public void setTcap(double tcap) {
        this.tcap = tcap;
    }

    @Override
    public String toString() {
        return "ModeloTiempoReaccion{" + "tcal=" + tcal + ", tcan=" + tcan + ", tcaa=" + tcaa + ", tcai=" + tcai + ", tcap=" + tcap + '}';
    }
    
}
