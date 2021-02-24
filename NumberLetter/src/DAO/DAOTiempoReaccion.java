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
public class DAOTiempoReaccion implements IDAO {

    double Tat;
    double CGat;
    double CLat;

    /**
     * este metodo permite calcular el tiempo total en la tarea
     *
     * @param x tiempo total en el bloque de letras
     * @param y tiempo total en el bloque de numeros
     * @param z tiempo total en el bloque alternado
     * @return tat tiempo total en la tarea
     *
     */
    @Override
    public double Total(double x, double y, double z) {
        double Tat = x + y + z;
        return Tat;
    }

    /**
     * este metodo eprmite calcular el costo del shifting global con el tiempo
     * total
     *
     * @param z tiempo total en el bloque alternado
     * @param x tiempo total en el bloque de letras
     * @param y tiempo total en el bloque de numeros
     * @return cgat costo del shifting global con el tiempo total
     *
     */
    @Override
    public double CostoShiftingGlobal(double x, double y, double z) {
        double CGat = z - ((x + y) / 2);
        return CGat;
    }

    /**
     * este metodo permite calcular el costo del shifting local con el tiempo
     * total
     *
     * @param x tiempo total en los cuadrantes impares del bloque alternado
     * @param y tiempo total en los cuadrantes pares del bloque alternado
     * @return clat costo del shifting local con el tiempo total
     *
     */
    @Override
    public double CostoShiftingLocal(double x, double y) {
        double CLat = x - y;
        return CLat;
    }

}
