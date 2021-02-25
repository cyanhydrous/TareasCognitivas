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
public class RespuestasCorrectasRelacionDes implements IDAO {
    double PDs,PDr,PDa,PDt;
    
    /**
     * este metodo permite calcula el porcentaje de respuestas correctas
     * en relacion con el desempeño individual en el bloque de sumas
     * @param rcs respuestas correctas en el bloque de sumas
     * @param rs respuestas en el bloque de sumas
     * @return PDs porcentaje de respuestas correctas en relacion con el 
     *             desempeño individual en el bloque de sumas
     */
    public double PorcRespCorrRelDesBloqSum(double rcs,double rs){
        this.PDs= (rcs*100)/rs;
        return this.PDs;
    }
    /**
     *  este metodo permite calcular el porcentaje de respuestas correctas
     *  en relacion con el desempeño individual en el bloque de restas
     * @param rcr respuestas correctas en el bloque de restas
     * @param rr respuestas en el bloque de restas
     * @return PDr porcentaje de respuestas correctas en relacion con el 
     *             desempeño individual en el bloque de restas
     */
    public double PorcRespCorrRelDesBloqRest(double rcr,double rr){
        this.PDr= (rcr*100)/rr;
        return this.PDr;
    }
    
    /**
     *  este metodo permite calcular el porcentaje de respuestas correctas 
     *  en relacion con el desempeño  individual en el bloque alterno
     * @param rca respuestas correctas en el bloque alterno
     * @param ra respuestas en el bloque alterno
     * @return  PDa porcentaje de respuestas correctas en relacion con el 
     *              desempeño individual en el bloque alterno
     */
    public double porcRespCorrRelDesBloqAlt(double rca,double ra){
        this.PDa = (rca*100)/ra;
        return this.PDa;
    }
    
    /**
     * este metodo permite calcular el porcentaje de respuestas correctas
     * en relacion con el desempeño individual en los 3 bloques
     * @param rct respuestas correctas totales
     * @param rt respuestas en los 3 bloques
     * @return PDt porcentaje de respuestas correctas en relacion  con el 
     *             desempeño individual en los 3 bloques
     */
    public double porcRespCorrRelDesTot(double rct,double rt){
        this.PDt=(rct*100)/rt;
        return this.PDt;
    }
    
    
    /**
     * costo del shifting con el procentaje de respuestas correctas con
     * relacion al desempeño individual
     * @return Cpd shifting con el porcentaje de respuestas con 
     *             relacion al desempeño individual
     */
    @Override
    public double CostoShiftingGlobal() {
        double Cpd=PDa-((PDs+PDr)/2);
        return Cpd;
    }
    
}
