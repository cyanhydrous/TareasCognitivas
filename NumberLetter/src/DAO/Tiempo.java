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
public class Tiempo implements IDAO {
        double Tt;
        double CGt;
        double CLt;


    /**
     *este metodo calcula el tiempo tiempo total en la tarea
    *@param x tiempo total en el bloque de letras
     *@param y tiempo total en el bloque de numeros
    *@param z tiempo total enn el bloque de letras
    *@return tt=tiempo total tarea
     **/
    @Override
    public double Total(double x, double y, double z) {
        this.Tt = x + y + z;
        return this.Tt;
    }
    
      /**
    * este metodo calcula el costo del shifting global con el tiempo total
    *@param x tiempo total en el bloque de letras 
     *@param y tiempo total en el bloque de numeros
    *@param z tiempo total en el bloque alternado
    *@return cgt=costo del shifting global con el tiempo total
     **/
    @Override
    public double CostoShiftingGlobal(double x, double y, double z) {
        this.CGt = z - ((x - y) / 2);
        return this.CGt;
    }
 
    /**
     *este metodo calcula el costo del shifting local con el tiempo total
    *@param x tiempo total en los cuadrantes impares del bloque alternado
    *@param y tiempo total en los cuadrantes pares del bloque alternado
    *@return clt costo del shifting local con el tiempo total
     **/
    @Override
    public double CostoShiftingLocal(double x, double y) {
    this.CLt = x - y;
        return this.CLt;
    }
}
