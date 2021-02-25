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
public class ModeloRespuestas {
    double rs,rr,ra,rt;

    public ModeloRespuestas(double rs, double rr, double ra, double rt) {
        this.rs = rs;
        this.rr = rr;
        this.ra = ra;
        this.rt = rt;
    }

    public double getRs() {
        return rs;
    }

    public void setRs(double rs) {
        this.rs = rs;
    }

    public double getRr() {
        return rr;
    }

    public void setRr(double rr) {
        this.rr = rr;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public double getRt() {
        return rt;
    }

    public void setRt(double rt) {
        this.rt = rt;
    }

    @Override
    public String toString() {
        return "ModeloRespuestas{" + "rs=" + rs + ", rr=" + rr + ", ra=" + ra + ", rt=" + rt + '}';
    }
    
    
}
