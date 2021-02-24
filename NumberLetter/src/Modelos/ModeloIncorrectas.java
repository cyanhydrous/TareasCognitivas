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

    double il, in, ia, ii, ip,rial,ruan,riaa,riai,riap;

    public ModeloIncorrectas(double il, double in, double ia, double ii, double ip) {
        this.il = il;
        this.in = in;
        this.ia = ia;
        this.ii = ii;
        this.ip = ip;
    }

    public ModeloIncorrectas(double il, double in, double ia, double ii) {
        this.il = il;
        this.in = in;
        this.ia = ia;
        this.ii = ii;
    }

    public ModeloIncorrectas(double il, double in, double ia) {
        this.il = il;
        this.in = in;
        this.ia = ia;
    }

    public ModeloIncorrectas(double il, double in) {
        this.il = il;
        this.in = in;
    }

    public ModeloIncorrectas(double il) {
        this.il = il;
    }

    public double getIl() {
        return il;
    }

    public void setIl(double il) {
        this.il = il;
    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public double getIa() {
        return ia;
    }

    public void setIa(double ia) {
        this.ia = ia;
    }

    public double getIi() {
        return ii;
    }

    public void setIi(double ii) {
        this.ii = ii;
    }

    public double getIp() {
        return ip;
    }

    public void setIp(double ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "ModeloIncorrectas{" + "il=" + il + ", in=" + in + ", ia=" + ia + ", ii=" + ii + ", ip=" + ip + '}';
    }

}
