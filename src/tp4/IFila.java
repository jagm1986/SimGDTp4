/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author Matias
 */
public interface IFila {
    void CalcularPrimeraFila();
    void CalcularNuevaFila(double contadorN, double promedio);
    double getContadorN();
    double getFin();
    double getAcumulador();
    void setContadorN(double contadorN);
    void setPromedio(double promedio);
    double getRandomA1();
    double getRandomA2();
    double getRandomA3();
    double getRandomA4();
    double getRandomA5();
    double getTiempoA1();
    double getTiempoA2();
    double getTiempoA3();
    double getTiempoA4();
    double getTiempoA5();
    double getFinA4();
    double getPromedio();
    void setAcumulador(double acumulador);
    long getSemilla();
    void setSemilla(long s);
    boolean esMenor();
}
