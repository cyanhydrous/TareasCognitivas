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
public class ModeloCorrectas {
    double rcs,rcr,rca,rct;
    /**
     * constructor
     * @param rcs respuestas correctas sumas
     * @param rcr respuestas correcats restas
     * @param rca respuestas correctas alterno
     * @param rct respuestas correctas 3 bloques
     */
    public ModeloCorrectas(double rcs, double rcr, double rca, double rct) {
        this.rcs = rcs;
        this.rcr = rcr;
        this.rca = rca;
        this.rct = rct;
    }
    /**
     * respuestas correctas sumas
     * @return respuestas correctas sumas 
     */
    public double getRcs() {
        return rcs;
    }
    /**
     * respuestas correctas sumas
     * @param rcs respuestas correctas sumas
     */
    public void setRcs(double rcs) {
        this.rcs = rcs;
    }
    
    /**
     * respuestas correctas restas
     * @return respuestas correctas restas 
     */
    public double getRcr() {
        return rcr;
    }
    /**
     * respuestas correctas restas
     * @param rcr respuestas correctas restas
     */
    public void setRcr(double rcr) {
        this.rcr = rcr;
    }
    
    /**
     * respuestas correctas alterno
     * @return respuestas correctas alterno 
     */
    public double getRca() {
        return rca;
    }
    /**
     * respuestas correctas alterno
     * @param rca respuestas correctas alterno
     */
    public void setRca(double rca) {
        this.rca = rca;
    }
    /**
     * respuestas correctas 3 bloques
     * @return respuestas correctas 3 bloques
     */
    public double getRct() {
        return rct;
    }
    /**
     * respuestas correctas 3 bloques
     * @param rct respuestas correctas 3 bloques
     */
    public void setRct(double rct) {
        this.rct = rct;
    }

    @Override
    public String toString() {
        return "ModeloCorrectas{" + "rcs=" + rcs + ", rcr=" + rcr + ", rca=" + rca + ", rct=" + rct + '}';
    }
    
}
