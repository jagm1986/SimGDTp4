/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author Usuario
 */
public class Fila {


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
        tiempoA4=A4.calcularTiempo(randomA4) + tiempoA1;
        if(tiempoA2>=tiempoA4){
        tiempoA5=A5.calcularTiempo(randomA5) + tiempoA2;
        }
        else{
            tiempoA5=A5.calcularTiempo(randomA5) + tiempoA4;
        }
        
        contadorN = 1;
        acumulador = tiempoA5;
        promedio = tiempoA5;
        
        //System.out.println(cantidadPasajerosPresentes + " " + promedio + " " + acumulador);

    }

    public void CalcularNuevaFila(double contadorN, double promedio) {

        randomA1 = Math.random();

               randomA2 = Math.random();

               randomA3 = Math.random();

               randomA4 = Math.random();

               randomA5 = Math.random();

        
 tiempoA1=A1.calcularTiempo(randomA1);
        tiempoA2=A2.calcularTiempo(randomA2);
        tiempoA3=A3.calcularTiempo(randomA3);
        tiempoA4=A4.calcularTiempo(randomA4) + tiempoA1;
        if(tiempoA2>=tiempoA4){
        tiempoA5=A5.calcularTiempo(randomA5) + tiempoA2;
        }
        else{
            tiempoA5=A5.calcularTiempo(randomA5) + tiempoA4;
        }
        
        this.contadorN = contadorN + 1;
        this.acumulador = acumulador+tiempoA5;
        this.promedio = 1/contadorN*((contadorN-1)*promedio+tiempoA5);

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
    

    

}
