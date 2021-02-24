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

    double tl, tn, ta, ti, tp, tal, tan, taa, tai, tap;

    public ModeloTiempo(double tl, double tn, double ta, double ti, double tp, double tal, double tan, double taa, double tai, double tap) {
        this.tl = tl;
        this.tn = tn;
        this.ta = ta;
        this.ti = ti;
        this.tp = tp;
        this.tal = tal;
        this.tan = tan;
        this.taa = taa;
        this.tai = tai;
        this.tap = tap;
    }

    public double getTl() {
        return tl;
    }

    public void setTl(double tl) {
        this.tl = tl;
    }

    public double getTn() {
        return tn;
    }

    public void setTn(double tn) {
        this.tn = tn;
    }

    public double getTa() {
        return ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public double getTal() {
        return tal;
    }

    public void setTal(double tal) {
        this.tal = tal;
    }

    public double getTan() {
        return tan;
    }

    public void setTan(double tan) {
        this.tan = tan;
    }

    public double getTaa() {
        return taa;
    }

    public void setTaa(double taa) {
        this.taa = taa;
    }

    public double getTai() {
        return tai;
    }

    public void setTai(double tai) {
        this.tai = tai;
    }

    public double getTap() {
        return tap;
    }

    public void setTap(double tap) {
        this.tap = tap;
    }

    @Override
    public String toString() {
        return "ModeloTiempo{" + "tl=" + tl + ", tn=" + tn + ", ta=" + ta + ", ti=" + ti + ", tp=" + tp + ", tal=" + tal + ", tan=" + tan + ", taa=" + taa + ", tai=" + tai + ", tap=" + tap + '}';
    }


}
