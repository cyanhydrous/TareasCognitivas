/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Joshua
 */
public class DAORespuestasCorrectas implements IDAO{
    double PCs, PCr,PCa,PCt;
    
    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en el bloque de sumas
     * @param rcs respuestas correctas en el bloque de sumas
     * @param is  total de reactivos en el bloque de sumas
     * @return  PCs porcentaje de respuestas correctas en el bloque de sumas
     */
    public double PorcRespCorrBloqSum(double rcs,double is){
        this.PCs=(rcs*100)/is;
        return this.PCs;
    }
    
    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en el bloque de restas
     * @param rcr respuestas correctas en el bloque de sumas
     * @param ir  total de reactivos en el bloque de restas
     * @return PCr porcentaje de respuestas correctas en el bloque de restas
     */
    public double PorcRespCorrBloqRest(double rcr,double ir){
         this.PCr= (rcr*100)/ir;
        return this.PCr;
    }
    
    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en el bloque alterno
     * @param rca respuestas correctas en el bloque  alterno
     * @param ia total de reactivos en el bloque alterno
     * @return PCa porcentaje de respuestas correctas en el bloque alterno
     */
    public double PorcRespCorrBloqAlt(double rca,double ia){
        this.PCa=(rca*100)/ia;
        return this.PCa;
    }
    
    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en los 3 bloques
     * @param rct respuestas correctas en los 3 bloques
     * @param it total de reactivos de los 3 bloques 
     * @return PCt porcentaje de respuestas correctas en los 3 bloques
     */
    public double PorcRespCorrTot(double rct,double it){
        this.PCt= (rct*100)/it;
        return this.PCt;
    }
    
    /**
     * este metodo permite calcular el costo del shifting con  porcentaje de respuestas correctas
     * @return 
     */
    @Override
    public double CostoShiftingGlobal() {
        double Cpc= this.PCa-((this.PCs+this.PCr)/2);
        return Cpc;
    }
    
}
