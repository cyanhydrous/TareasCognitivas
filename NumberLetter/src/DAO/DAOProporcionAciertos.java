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
public class DAOProporcionAciertos implements IDAO {

    double Rt;
    double Pl;
    double Pn;
    double Pa;
    double Pt;
    double CGp;
    double Pi;
    double Pp;
    double CLp;
    double Rat;

    double Pal;
    double Pan;
    double Paa;
    double Pat;
    double CGap;
    double Pai;
    double Pap;
    double CLap;

    // DAOCalculos con la proporcion de aciertos
    /**
     * este metodo calcula las respuestas en los 3 bloques
     *
     * @param x respuestas en el bloque de letras
     * @param y respuestas en el bloque de numeros
     * @param z respuestas en el bloque alternado
     * @return rt respuestas en los 3 bloques
     *
     */
    @Override
    public double Total(double x, double y, double z) {
        this.Rt = x + y + z;
        return Rt;
    }

    /**
     * este metodo calcula el porcentaje de respuestas correctas en el bloque de
     * solo numeros
     *
     * @param rcl respuestas correctas en el bloque de solo letras
     * @param rl respuestas en el bloque de letras
     * @return pl porcentaje de respuestas correctas en el bloque de solo letras
    *
     */
    public double PorcResCorrBloLet(double rcl, double rl) {
        this.Pl = ((rcl) * (100)) / rl;
        return this.Pl;
    }

    /**
     * este metodo calcula el porcentaje de respuestas correctas en el bloque de
     * solo numeros
     *
     * @param rcn respuestas correctas en el bloque de solo numeros
     * @param rn respuestas en el bloque de numeros
     * @return pn porcentaje de respuestas correctas en el bloque de solo
     * numeros
     *
     */
    public double PorResCorrBloNum(double rcn, double rn) {
        this.Pn = ((rcn) * (100)) / rn;
        return this.Pn;
    }

    /**
     * este metodo calcula el porcentaje de respuestas correctas en el bloque
     * alternado
     *
     * @param rca respuestas correctas en el bloque alternado
     * @param ra respuestas en el bloque alternado
     * @return pa porcentaje de respuestas correctas en el bloque alternado
    *
     */
    public double PorResCorrBloAlt(double rca, double ra) {
        this.Pa = ((rca) * (100)) / ra;
        return this.Pa;
    }

    /**
     * este metodo calcula el porcentaje de respuestas correctas en los 3
     * bloques
     *
     * @param rct respuestas correctas en toda la tarea
     * @param rt respuestas en los 3 bloques
     * @return pt porcentaje de respuestas correctas en los 3 bloques
     *
     */
    public double PorResCorrTresBloq(double rct, double rt) {
        this.Pt = ((rct) * (100)) / rt;
        return this.Pt;
    }

    /**
     * este metodo permite calcular las respuesas correctas en los cuadrantes
     * impares del bloque alternado
     *
     * @param rci respuestas correctas en los cuadrantes impares del bloque
     * alternado
     * @param ri respuestas en los cuadrantes impares del bloque alternado
     * @return pi porcentaje de respuestas correctas en los cuadrantes impares
     * del bloque alternado
    *
     */
    public double PorResCorrCuadImpBloqAlt(double rci, double ri) {
        this.Pi = ((rci) * (100)) / ri;
        return this.Pi;
    }

    /**
     * este metodo calcula el porcentaje de respuestas correctas en los
     * cuadrantes pares del bloque alternado
     *
     * @param rcp respuestas correcas en los cuadrantes pares del bloque
     * alternado
     * @param rp respuestas en los cuadrantes pares del bloque alternado
     * @return pp porcentaje de respuestas correctas en los cuadrantes de pares
     * del bloque alternado
    *
     */
    public double PorResCorrCuadParBloqAlt(double rcp, double rp) {
        this.Pp = ((rcp) * (100)) / rp;
        return this.Pp;
    }

    /**
     * este metodo calcula el shifting global con porcentaje de respuestas
     * correctas
     *
     * @param z porcentaje de respuestas correctas en el bloque alternado
     * @param x porcentaje de respuestas correctas en el bloque de solo numeros
     * @param y porcentaje de respuestas correctas en el bloque de numeros
     * @return cgp costo del shifting global con porcentaje de respuestas
     * correctas
     *
     */
    @Override
    public double CostoShiftingGlobal(double x, double y, double z) {
        this.CGp = z - ((x + y) / 2);
        return this.CGp;
    }

    /**
     * este metodo permite calcular el costo del shifting local con porcentajes
     * de respuestas correctas
     *
     * @param x porcentaje de respuestas correctas en los cuadrantes impares del
     * bloque alternado
     * @param y porcentaje de respuestas correctas en los cuadrantes pares del
     * bloque alternado
     * @return clp costo del shifting local con porcentajes de respuestas
     * correctas
     *
     */
    @Override
    public double CostoShiftingLocal(double x, double y) {
        this.CLp = x - y;
        return this.CLp;
    }

    /**
     * este metodo permite calcular las respuestas totales en los 3 bloques
     *
     * @param ral respuestas en el bloque de letras
     * @param ran respuestas en el bloque de numeros
     * @param raa respuestas en el bloque alterno
     * @return rat respuestas en los 3 bloques
    *
     */
    public double RespuestasTresBloques(double ral, double ran, double raa) {
        this.Rat = ral + ran + raa;
        return this.Rat;
    }

    /**
     * este metodo permite calcular el procentaje de respuestas correctas en el
     * bloque de solo letras
     *
     * @param rcal respuestas correctas bloque solo letras
     * @param ral respuestas en el bloque de letras
     * @return pal porcentaje de respuestas correctas en el bloque de solo
     * letras
   *
     */
    public double PorcResCorrBloqueLetras(double rcal, double ral) {
        this.Pal = ((rcal) * (100)) / ral;
        return this.Pal;
    }

    /**
     * este metodo permite calcular el porcentaje de respuestas
     *
     * @param rcan respuestas correctas en el bloque de solo numeros
     * @param ran respuestas en el bloque de numeros
     * @return pan porcentaje de respuestas correctas en el bloque de numeros
    *
     */
    public double PorcResCorrBloqueNumeros(double rcan, double ran) {
        this.Pan = ((rcan) * (100)) / ran;
        return this.Pan;
    }

    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en el
     * bloque alternado
     *
     * @param rcaa respuestas correctas en el bloque alterno
     * @param raa respuestas en el bloque alterno
     * @return paa porcentaje de respuestas correcctas en el bloque alternado
    *
     */
    public double PorcResCorrBloqueAlterno(double rcaa, double raa) {
        this.Paa = ((rcaa) * (100)) / raa;
        return this.Paa;
    }

    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en los
     * 3 bloques
     *
     * @param rcat respuestas correctas en los 3 bloques
     * @param rat respuestas en los 3 bloques
     * @return pat porcentaje de respuestas correctas en los 3 bloques
    *
     */
    public double ProcResCorrTresBloqu(double rcat, double rat) {
        this.Pat = ((rcat) * (100)) / rat;
        return this.Pat;
    }

    /**
     * este metodo permite calcular el costo del shifting global con el
     * porcentaje de respuesas correctas
     * @return cgap costo del shifting global con porcentaje de respuestas
     * correcatas
    *
     */
    public double CosShiftGloPorcResCorr() {
        this.CGap = this.Paa - ((this.Pal + this.Pan) / 2);
        return this.CGap;
    }

    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en los
     * cuadrantes impares del bloque alternado
     *
     * @param rcai respuestas correctas en el cuadrante impar
     * @param rai respuestas totales en los cuadrantes impares
     * @return pai porcentaje de respuestas correctas en los cuadrantes impares
     * del bloque alternado
    *
     */
    public double PorcResCorrCuadImpBloqAlt(double rcai, double rai) {
        this.Pai = ((rcai) * (100)) / rai;
        return this.Pai;
    }

    /**
     * este metodo permite calcular el porcentaje de respuestas correctas en los
     * cuadrantes pares del bloque alternado
     *
     * @param rcap respuestas corerctas en el cuadrante par
     * @param rap respuestas totales en los cuadrantes pares
     * @return pap porcentaje de respuestas correctas en los cuadrantes pares
     * del bloque alterno
    *
     */
    public double PorcResCorrCuadParBloqAlt(double rcap, double rap) {
        this.Pap = ((rcap) * (100)) / rap;
        return this.Pap;
    }

    /**
     * este metodo permite calcular el costo del shifting local con porcetnaje
     * de respuestas correctas
     *
     * @return clap costo del shifting local con porcetnaje de respuestas
     * correctas
    *
     */
    public double CosShiftLocPorcResCorr() {
        this.CLap = this.Pai - this.Pap;
        return this.CLap;
    }

}
