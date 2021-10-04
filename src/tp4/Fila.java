/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import org.apache.commons.math3.distribution.TDistribution;

/**
 *
 * @author Usuario
 */
public class Fila implements IFila{


    double randomA1 = 0;
    double randomA2 = 0;
    double randomA3 = 0;
    double randomA4 = 0;
    double randomA5 = 0;
    double tiempoA1 = 0;
    double tiempoA2 = 0;
    double tiempoA3 = 0;
    double tiempoA4 = 0;
    double tiempoA5 = 0;
    double diferencia = 0;
    double contadorN = 0;
    double acumulador = 0;
    double promedio = 0;
    double fin = 0;
    int prob45 = 0;
    double varianza=0;
    double tStudentFormula;
   
    double finA4= 0;
    IActividad A1;
    IActividad A2;
    IActividad A3;
    IActividad A4;
    IActividad A5;

    public Fila(IActividad a1, IActividad a2, IActividad a3, IActividad a4, IActividad a5) {
        this.A1=a1;
        this.A2=a2;
        this.A3=a3;
        this.A4=a4;
        this.A5=a5;
    }

    public void CalcularPrimeraFila() {
        randomA1 = Math.random();

               randomA2 = Math.random();

               randomA3 = Math.random();

               randomA4 = Math.random();

               randomA5 = Math.random();

        
        tiempoA1=A1.calcularTiempo(randomA1);
        tiempoA2=A2.calcularTiempo(randomA2);
        tiempoA3=A3.calcularTiempo(randomA3);
        tiempoA4=A4.calcularTiempo(randomA4);
        finA4 = tiempoA4 + tiempoA1;
        tiempoA5=A5.calcularTiempo(randomA5);
        if(tiempoA2>=finA4){
        fin = tiempoA5 + tiempoA2;
        }
        else{
            fin=tiempoA5 + finA4;
        }
        
        contadorN = 1;
        acumulador = fin;
        promedio = fin;
        //varianza = (1/(contadorN-1))*(contadorN/(contadorN-1)*(promedio-fin));
        //System.out.println(cantidadPasajerosPresentes + " " + promedio + " " + acumulador);

    }

    public void CalcularNuevaFila(double contadorN, double promedio, double varianza) {
        prob45 = 0;
        randomA1 = Math.random();

               randomA2 = Math.random();

               randomA3 = Math.random();

               randomA4 = Math.random();

               randomA5 = Math.random();

        
        tiempoA1=A1.calcularTiempo(randomA1);
        tiempoA2=A2.calcularTiempo(randomA2);
        tiempoA3=A3.calcularTiempo(randomA3);
        tiempoA4=A4.calcularTiempo(randomA4);
        finA4 = tiempoA4 + tiempoA1;
        tiempoA5=A5.calcularTiempo(randomA5);
        if(tiempoA2>=finA4){
        fin = tiempoA5 + tiempoA2;
        }
        else{
            fin=tiempoA5 + finA4;
        }
        this.contadorN = contadorN + 1;
        this.acumulador = acumulador+fin;
        this.promedio = 1/contadorN*((contadorN-1)*promedio+fin);
        this.varianza = (1/(this.contadorN-1))*((this.contadorN-2)*varianza+(this.contadorN/(this.contadorN-1)*Math.pow((promedio-fin),2)));
        TDistribution tds = new TDistribution(this.contadorN-1);
        this.tStudentFormula = this.promedio+tds.inverseCumulativeProbability(0.975)*Math.sqrt(this.varianza)/Math.sqrt(this.contadorN);

    }
    public long getSemilla(){
        return -1;
    }
    public void setSemilla(long s){
        
    }
    public double getRandomA1() {
        return randomA1;
    }

    public void setRandomA1(double randomA1) {
        this.randomA1 = randomA1;
    }

    public double getRandomA2() {
        return randomA2;
    }

    public void setRandomA2(double randomA2) {
        this.randomA2 = randomA2;
    }

    public double getRandomA3() {
        return randomA3;
    }

    public void setRandomA3(double randomA3) {
        this.randomA3 = randomA3;
    }

    public double getRandomA4() {
        return randomA4;
    }

    public void setRandomA4(double randomA4) {
        this.randomA4 = randomA4;
    }

    public double getRandomA5() {
        return randomA5;
    }

    public void setRandomA5(double randomA5) {
        this.randomA5 = randomA5;
    }

    public double getTiempoA1() {
        return tiempoA1;
    }

    public void setTiempoA1(double tiempoA1) {
        this.tiempoA1 = tiempoA1;
    }

    public double getTiempoA2() {
        return tiempoA2;
    }

    public void setTiempoA2(double tiempoA2) {
        this.tiempoA2 = tiempoA2;
    }

    public double getTiempoA3() {
        return tiempoA3;
    }

    public void setTiempoA3(double tiempoA3) {
        this.tiempoA3 = tiempoA3;
    }

    public double getTiempoA4() {
        return tiempoA4;
    }

    public void setTiempoA4(double tiempoA4) {
        this.tiempoA4 = tiempoA4;
    }

    public double getTiempoA5() {
        return tiempoA5;
    }

    public void setTiempoA5(double tiempoA5) {
        this.tiempoA5 = tiempoA5;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public double getContadorN() {
        return contadorN;
    }

    public void setContadorN(double contadorN) {
        this.contadorN = contadorN;
    }

    public double getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public IActividad getA1() {
        return A1;
    }

    public void setA1(IActividad A1) {
        this.A1 = A1;
    }

    public IActividad getA2() {
        return A2;
    }

    public void setA2(IActividad A2) {
        this.A2 = A2;
    }

    public IActividad getA3() {
        return A3;
    }

    public void setA3(IActividad A3) {
        this.A3 = A3;
    }

    public IActividad getA4() {
        return A4;
    }

    public void setA4(IActividad A4) {
        this.A4 = A4;
    }

    public IActividad getA5() {
        return A5;
    }

    public void setA5(IActividad A5) {
        this.A5 = A5;
    }
    
 public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    public double getFinA4() {
        return finA4;
    }

    public void setFinA4(double finA4) {
        this.finA4 = finA4;
    }

    public int getProb45() {
        return prob45;
    }

    public void setProb45(int prob45) {
        this.prob45 = prob45;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }

    public double gettStudentFormula() {
        return tStudentFormula;
    }

    public void settStudentFormula(double tStudentFormula) {
        this.tStudentFormula = tStudentFormula;
    }
    

    

}
