/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
/**
 *
 * @author Joshua
 */
public interface IDAO {
    /**
     * este metodo calcula el total de las 3 variables
     * @param x variable a sumar
     * @param y variable a sumar
     * @param z variable a sumar
     * @return total total obtenido de la suma de las variables
     */
    public double Total(double x,double y,double z);
    /**
     * este metodo calcula el costo del shifting global
     * @param x variable que sumado a y y dividido entre 2 se le resta a z
     * @param y varialbe que sumado a x y dividido entre 2 se le resta a z
     * @param z variable a la que se le resta la suma de x y y divididos entre 2
     * @return CSg costo shifting global
     */
    public double CostoShiftingGlobal(double x,double y,double z);
    /**
     * este metodo calcula el costo del shifting local
     * @param x variable a la que se le substrae y
     * @param y variable que substrae a x
     * @return CSl costo del shifting local
     */
    public double CostoShiftingLocal(double x,double y);
}
