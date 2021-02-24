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
public class ModeloProporcionAciertos {
    double rl,rn,ra,ri,rp,ral,ran,raa,rai,rap;

    public ModeloProporcionAciertos(double rl, double rn, double ra, double ri, double rp, double ral, double ran, double raa, double rai, double rap) {
        this.rl = rl;
        this.rn = rn;
        this.ra = ra;
        this.ri = ri;
        this.rp = rp;
        this.ral = ral;
        this.ran = ran;
        this.raa = raa;
        this.rai = rai;
        this.rap = rap;
    }

    public double getRl() {
        return rl;
    }

    public void setRl(double rl) {
        this.rl = rl;
    }

    public double getRn() {
        return rn;
    }

    public void setRn(double rn) {
        this.rn = rn;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public double getRi() {
        return ri;
    }

    public void setRi(double ri) {
        this.ri = ri;
    }

    public double getRp() {
        return rp;
    }

    public void setRp(double rp) {
        this.rp = rp;
    }

    public double getRal() {
        return ral;
    }

    public void setRal(double ral) {
        this.ral = ral;
    }

    public double getRan() {
        return ran;
    }

    public void setRan(double ran) {
        this.ran = ran;
    }

    public double getRaa() {
        return raa;
    }

    public void setRaa(double raa) {
        this.raa = raa;
    }

    public double getRai() {
        return rai;
    }

    public void setRai(double rai) {
        this.rai = rai;
    }

    public double getRap() {
        return rap;
    }

    public void setRap(double rap) {
        this.rap = rap;
    }

    @Override
    public String toString() {
        return "ModeloProporcionAciertos{" + "rl=" + rl + ", rn=" + rn + ", ra=" + ra + ", ri=" + ri + ", rp=" + rp + ", ral=" + ral + ", ran=" + ran + ", raa=" + raa + ", rai=" + rai + ", rap=" + rap + '}';
    }

    
}
