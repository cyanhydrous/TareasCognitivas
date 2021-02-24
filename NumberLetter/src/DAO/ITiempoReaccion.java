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
public interface ITiempoReaccion {
    public double RespuestasTotalTarea(double x, double y,double z);
    public double TiempoReaccionPromedioBloqueLetras(double x,double y);
    public double TiempoReaccionPromedioBloqueNumeros(double x,double y);
    public double TiempoReaccionPromedioBloqueAlterno(double x, double y);
    public double TiempoReaccionPromedioTodaTarea(double x, double y);
    public double CostoShiftingGlobalTiempoReaccion(double x, double y, double z);
    public double TiempoReaccionPromedioCuadranteImparAlternado(double x,double y);
    public double TiempoReaccionPromedioCuadranteParAlternado(double x, double y);
    public double CostoShiftingLocalTiempoReaccion(double x, double y);
}
