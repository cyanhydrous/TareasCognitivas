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
public class TiempoReaccion implements IDAO{
     double TRs, TRr,TRa,TRt;
    /**
     * este metodo permite calcular el tiempo de reaccion promedio en el bloque de solo sumas
     * @param ts tiempo total del bloque de sumas
     * @param rs respuestas del bloque de sumas
     * @return TRs tiempo de reaccion en el bloque de sumas
     */
    public double TieReaccPromBloqSum(double ts,double rs){
         this.TRs=ts/rs;
        return this.TRs;
    }
    
    /**
     * este metodo permite calcular el tiempo de reaccion promedio en el bloque de solo restas
     * @param tr tiempo total  empleado para resolber el bloque de restas
     * @param rr respuestas totales del bloque de restas
     * @return TRr tiempo de reaccion promedio en el bloque de solo restas
     */
    public double TieReaccPromBloqRest(double tr,double rr){
         this.TRr = tr/rr;
        return this.TRr;
    }
    
    /**
     * este metodo permite calcular el tiempo de reaccion promedio en el bloque alternado
     * @param ta tiempo total empleado para resolver el bloque alterno 
     * @param ra respuestas totales del bloque alterno
     * @return TRa tiempo de reaccion promedio en el bloque alterno
     */
    public double TieReaccPromBloquAlt(double ta,double ra){
        this.TRa=ta/ra;
        return this.TRa;
    }
    
    /**
     * este metodo permite calcular el tiempo de reaccion promedio de los 3 bloques
     * @param tt tiempo total empleado para resolver los 3 bloques
     * @param rtrespuestas totales en los 3 bloques
     * @return TRt tiempo de reaccion promedio de los 3 bloques
     */
    public double TieReaccPromTot(double tt,double rt){
        this.TRt= tt/rt;
        return this.TRt;
    }
    
    /**
     * este metodo permite calcular  el costo del shifting con el tiempo de reaccion promedio
     * de todas las respuestas
     * @return Ctr costo del shifting con el tiempo de reaccion promedio de todas las respuestas
     */
    @Override
    public double CostoShiftingGlobal() {
        double Ctr= TRa-((TRs+TRr)/2);
        return Ctr;
    }
    
    
    
}
