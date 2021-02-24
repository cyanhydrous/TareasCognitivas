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
public class desvEst {

    double MTTl;// media del bloque letras
    double DETl;

    double PSTl;
    double PITl;

    double MTTn;// media del bloque numeros
    double DETn;
    double PSTn;
    double PITn;

    double MTTa;// media del bloque alterno
    double DETa;
    double PSTa;
    double PITa;

    double MCTl;// media tiempo de reaccion
    double DECl;
    double PSCl;
    double PICl;

    double MTCn;//
    double DECn;
    double PSCn;
    double PICn;

    double MTCa;//
    double DECa;
    double PSCa;
    double PICa;

    //inferiores a 2.5 desviaciones estandar   
    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letras
     *
     * @param tl tiempo total en el bloque de letras
     * @param rl respuestas en el bloque de letras
     * @param a arreglo con las respuestas
     * @return mttl desviacion estandar de las letras
     *
     *
     */
    public double DesvEstTotResBloquLet(double tl, double rl, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MTTl = tl / rl;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MTTl), 2);

        }
        division = sumaCuadrados / rl;
        this.DETl = Math.sqrt(division);
        return this.DETl;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
     *
     */
    public double PuntoCorteSuperiorBloqueLetras() {
        this.PSTl = (MTTl) + ((this.DETl) * (2.5));
        return this.PSTl;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorBloqueLetras() {
        this.PITl = (MTTl) + ((DETl) * (2.5));
        return this.PITl;

    }
    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    //inferiores a 2.5 desviaciones estandar

    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letra
     *
     * @param tn tiempo total en el bloque de numeros
     * @param rn respuestas en el bloque de numeros
     * @param a arreglo con las respuestsa
     * @return mttn desviacion estandar de los numeros
     *
     */
    public double DesvEstTotResBloquNum(double tn, double rn, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MTTn = tn / rn;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MTTn), 2);

        }
        division = sumaCuadrados / rn;
        this.DETn = Math.sqrt(division);
        return this.DETn;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
     *
     */
    public double PuntoCorteSuperiorBloqueNum() {
        this.PSTn = (MTTn) + ((this.DETn) * (2.5));
        return this.PSTn;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorBloqueNum() {
        this.PITn = (MTTn) + ((DETn) * (2.5));
        return this.PITn;

    }
    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    //inferiores a 2.5 desviaciones estandar

    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letras
     *
     * @param ta tiempo total en el bloque alterno
     * @param ra respuestas en el bloque alterno
     * @param a arreglo
     * @return MTTa
     *
     */
    public double DesvEstTotResBloquAlt(double ta, double ra, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MTTa = ta / ra;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MTTa), 2);

        }
        division = sumaCuadrados / ra;
        this.DETa = Math.sqrt(division);
        return this.DETa;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
     *
     */
    public double PuntoCorteSuperiorBloqueAlterno() {
        this.PSTa = (MTTa) + ((this.DETa) * (2.5));
        return this.PSTa;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorBloqueAlterno() {
        this.PITa = (MTTa) + ((DETa) * (2.5));
        return this.PITa;

    }

    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    //inferiores a 2.5 desviaciones estandar
    //inferiores a 2.5 desviaciones estandar
    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letras
     *
     * @param tcl tiempo de reaccion de las respuestas correctas en el bloque de
     * solo letras
     * @param rcl respuestas correctas en el bloque de solo letras
     * @param a arreglo con las respuestas
     * @return mctl desviacion estandar
     *
     */
    public double DesvEstResCorrBloquLet(double tcl, double rcl, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MCTl = tcl / rcl;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MCTl), 2);

        }
        division = sumaCuadrados / rcl;
        this.DECl = Math.sqrt(division);
        return this.DECl;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
    *
     */
    public double PuntoCorteSuperiorResCorrBloqueLetras() {
        this.PSCl = (this.MCTl) + ((this.DECl) * (2.5));
        return this.PSCl;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorResCorrBloqueLetras() {
        this.PICl = (this.MCTl) + ((this.DECl) * (2.5));
        return this.PICl;

    }

    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    //inferiores a 2.5 desviaciones estandar  
    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letras
     *
     * @param tcn tiempo de reaccion de las respuestas en el bloque de solo
     * numeros
     * @param rcn respuestas correctas en el bloque de solo numeros
     * @param a arreglo con los tiempos de reaccion
     * @return MTCn desviacion estandar con las respuestas correctas en el
     * bloque de numeros
     *
     */
    public double DesvEstResCorrBloquNum(double tcn, double rcn, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MTCn = tcn / rcn;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MTCn), 2);

        }
        division = sumaCuadrados / rcn;
        this.DECn = Math.sqrt(division);
        return this.DECn;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
     *
     */
    public double PuntoCorteSuperiorResCorrBloqueNum() {
        this.PSCn = (MTCn) + ((this.DECn) * (2.5));
        return this.PSCn;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorResCorrBloqueNum() {
        this.PICn = (MTCn) + ((DECn) * (2.5));
        return this.PICn;

    }
    // con todas las respuestas sin distincion entre errores y aciertos descartando aquellas superiores e 
    //inferiores a 2.5 desviaciones estandar

    /**
     * este metodo permite calcular la desviacion estandar del total de
     * respuestas en el bloque de solo letras
     *
     * @param tca tiempo de reaccion de las respuestas en el bloque alterno
     * @param rca respuestas correctas en el bloque alterno
     * @param a arreglo con los tiempos de reaccion
     * @return MTCa desviacion estandar con las respuestas correctas en el
     * bloqeue alterno
     *
     */
    public double DesvEstResCorrBloquAlt(double tca, double rca, double a[]) {

        double sumaCuadrados = 0;
        double division;
        //paso 1 calcular la media de los tiempos de reaccion en el bloque de letras
        this.MTCa = tca / rca;

        //paso 2 calcular la diferencia entre la media de los tiempos de reaccion
        //registrados en el bloque de solo letras
        //excepto los que fueron igual o menores a 200ms
        //y elevar al cuadrado cada resultado
        for (int i = 0; i < a.length; i++) {
            // paso 3 sumar los valores que resultaron en el paso2
            sumaCuadrados += Math.pow((a[i] - this.MTCa), 2);

        }
        division = sumaCuadrados / rca;
        this.DECa = Math.sqrt(division);
        return this.DECa;
    }

    /**
     * este metodo permite calcular el punto de corte superior del bloque de
     * solo letras
     *
     * @return pstl punto de corte superior total de letras
     *
     */
    public double PuntoCorteSuperiorResCorrBloqueAlterno() {
        this.PSCa = (MTCa) + ((this.DECa) * (2.5));
        return this.PSCa;
    }

    /**
     * este metodo permite calcular el punto de corte inferior del bloque de
     * solo letras
     *
     * @return pitl punto de corte inferior total de letras
     *
     */
    public double PuntoCorteInferiorResCorrBloqueAlterno() {
        this.PICa = (MTCa) + ((DECa) * (2.5));
        return this.PICa;

    }
}
