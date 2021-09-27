/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

//TODO Metodo congruencial mixto
//TODO Boton para mostrar grafico
//TODO Ultimo punto con los 15 intervalos
//TODO Meter lo que esta en consola en la pantalla
//TODO Habilitar las otras distribuciones
//TODO Nombres integrantes


import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private DefaultTableModel tabla = new DefaultTableModel();
    int N = 0;
    int desde = 0;
    int hasta = 0;
    private IActividad auxA1;
    private IActividad auxA2;
    private IActividad auxA3;
    private IActividad auxA4;
    private IActividad auxA5;
    private Fila aux1;
    private Fila aux2;
    private double promedio = 0;
    private double maximo = 0;
    private double minimo = 0;
    private int counterProbabilidad45dias = 0;
    
    DecimalFormat df = new DecimalFormat("#.###");
    
    
    private JFrame pantallaActual;

    private Object[] filaAImprimir = new Object[16];
    private Object[] columna = {"Simulacion", "Rand 1", "Tiempo A1", "Rand 2", "Tiempo A2", "Rand 3", "Tiempo A3", "Rand 4", "Tiempo A4", "Rand 5", "Tiempo A5", "Fin", "Acumulado" ,"Promedio", "Minimo", "Maximo"};

    private void llenarFila(Fila aux) {
        filaAImprimir[0] = (int) aux.getContadorN();
        filaAImprimir[1] = df.format(aux.getRandomA1());
        filaAImprimir[2] = df.format(aux.getTiempoA1());
        filaAImprimir[3] = df.format(aux.getRandomA2());
        filaAImprimir[4] = df.format(aux.getTiempoA2());
        filaAImprimir[5] = df.format(aux.getRandomA3());
        filaAImprimir[6] = df.format(aux.getTiempoA3());
        filaAImprimir[7] = df.format(aux.getRandomA4());
        filaAImprimir[8] = df.format(aux.getTiempoA4());
        filaAImprimir[9] = df.format(aux.getRandomA5());
        filaAImprimir[10] = df.format(aux.getTiempoA5());
        filaAImprimir[11] = df.format(aux.getTiempoA5());
        filaAImprimir[12] = df.format(aux.getAcumulador());
        filaAImprimir[13] = df.format(aux.getPromedio());
        filaAImprimir[14] = df.format(minimo);
        filaAImprimir[15] = df.format(maximo);

    }

    private void obtenerDistribucionA1() {
        if (radioButtonUniformeA1.isSelected()){
            double a = Double.parseDouble(textaA1.getText());
            double b = Double.parseDouble(textbA1.getText());
              
            auxA1=new ActividadUniforme(a,b);
        }
        if (radioButtonNormalA1.isSelected()){
            double mu = Double.parseDouble(textMuA1.getText());
            double sigma = Double.parseDouble(textSigmaA1.getText());
            
            auxA1 = new ActividadNormal(mu,sigma);
            
        }
        if(radioButtonExpA1.isSelected()){
            double media= Double.parseDouble(textLambdaA1.getText());
            
            auxA1 = new ActividadExponencial(media);
        }
    }
      private void obtenerDistribucionA2() {
        if (radioButtonUniformeA2.isSelected()){
            double a = Double.parseDouble(textaA2.getText());
            double b = Double.parseDouble(textbA2.getText());
              
            auxA2=new ActividadUniforme(a,b);
        }
        if (radioButtonNormalA2.isSelected()){
            double mu = Double.parseDouble(textMuA2.getText());
            double sigma = Double.parseDouble(textSigmaA2.getText());
            
            auxA2 = new ActividadNormal(mu,sigma);
            
        }
        if(radioButtonExpA2.isSelected()){
            double media= Double.parseDouble(textLambdaA2.getText());
            
            auxA2 = new ActividadExponencial(media);
        }
    }
      
       private void obtenerDistribucionA3() {
        if (radioButtonUniformeA3.isSelected()){
            double a = Double.parseDouble(textaA3.getText());
            double b = Double.parseDouble(textbA3.getText());
              
            auxA3=new ActividadUniforme(a,b);
        }
        if (radioButtonNormalA3.isSelected()){
            double mu = Double.parseDouble(textMuA3.getText());
            double sigma = Double.parseDouble(textSigmaA3.getText());
            
            auxA3 = new ActividadNormal(mu,sigma);
            
        }
        if(radioButtonExpA3.isSelected()){
            double media= Double.parseDouble(textLambdaA3.getText());
            
            auxA3 = new ActividadExponencial(media);
        }
    }
       
        private void obtenerDistribucionA4() {
        if (radioButtonUniformeA4.isSelected()){
            double a = Double.parseDouble(textaA4.getText());
            double b = Double.parseDouble(textbA4.getText());
              
            auxA4=new ActividadUniforme(a,b);
        }
        if (radioButtonNormalA4.isSelected()){
            double mu = Double.parseDouble(textMuA4.getText());
            double sigma = Double.parseDouble(textSigmaA4.getText());
            
            auxA4 = new ActividadNormal(mu,sigma);
            
        }
        if(radioButtonExpA4.isSelected()){
            double media= Double.parseDouble(textLambdaA4.getText());
            
            auxA4 = new ActividadExponencial(media);
        }
    }
        
         private void obtenerDistribucionA5() {
        if (radioButtonUniformeA5.isSelected()){
            double a = Double.parseDouble(textaA5.getText());
            double b = Double.parseDouble(textbA5.getText());
              
            auxA5=new ActividadUniforme(a,b);
        }
        if (radioButtonNormalA5.isSelected()){
            double mu = Double.parseDouble(textMuA5.getText());
            double sigma = Double.parseDouble(textSigmaA5.getText());
            
            auxA5 = new ActividadNormal(mu,sigma);
            
        }
        if(radioButtonExpA5.isSelected()){
            double media= Double.parseDouble(textLambdaA5.getText());
            
            auxA5 = new ActividadExponencial(media);
        }
    }

    public Principal() {

        initComponents();
        pantallaActual = new JFrame();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnSimular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        lblPrueba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radioButtonNormalA1 = new javax.swing.JRadioButton();
        radioButtonExpA1 = new javax.swing.JRadioButton();
        radioButtonUniformeA1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        textaA1 = new javax.swing.JTextField();
        textbA1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textLambdaA1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textMuA1 = new javax.swing.JTextField();
        textSigmaA1 = new javax.swing.JTextField();
        radioButtonNormalA2 = new javax.swing.JRadioButton();
        textMuA2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textSigmaA2 = new javax.swing.JTextField();
        radioButtonExpA2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        textLambdaA2 = new javax.swing.JTextField();
        radioButtonUniformeA2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        textaA2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textbA2 = new javax.swing.JTextField();
        radioButtonNormalA3 = new javax.swing.JRadioButton();
        textMuA3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        textSigmaA3 = new javax.swing.JTextField();
        radioButtonExpA3 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        textLambdaA3 = new javax.swing.JTextField();
        radioButtonUniformeA3 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        textaA3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textbA3 = new javax.swing.JTextField();
        radioButtonNormalA4 = new javax.swing.JRadioButton();
        textMuA4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        textSigmaA4 = new javax.swing.JTextField();
        radioButtonExpA4 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        textLambdaA4 = new javax.swing.JTextField();
        radioButtonUniformeA4 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        textaA4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        textbA4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        radioButtonNormalA5 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        textMuA5 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        textSigmaA5 = new javax.swing.JTextField();
        radioButtonExpA5 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        textLambdaA5 = new javax.swing.JTextField();
        radioButtonUniformeA5 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        textaA5 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        textbA5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        BtnSimular.setText("Simular");
        BtnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimularActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de Vuelos a Simular");

        txtCantidadFilas.setText("100000");

        jLabel3.setText("Desde");

        jLabel4.setText("Hasta");

        txtDesde.setText("0");

        txtHasta.setText("1000");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        lblPrueba.setText("jLabel1");

        jLabel1.setText("Actividad 1:");

        jLabel5.setText("Actividad 2:");

        jLabel6.setText("Actividad 3:");

        jLabel7.setText("Actividad 4:");

        buttonGroup1.add(radioButtonNormalA1);
        radioButtonNormalA1.setText("Normal");
        radioButtonNormalA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNormalA1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonExpA1);
        radioButtonExpA1.setText("Exponencial");
        radioButtonExpA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExpA1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonUniformeA1);
        radioButtonUniformeA1.setSelected(true);
        radioButtonUniformeA1.setText("Uniforme");

        jLabel8.setText("a:");

        textaA1.setText("20");
        textaA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textaA1ActionPerformed(evt);
            }
        });

        textbA1.setText("30");

        jLabel9.setText("b:");

        jLabel10.setText("media:");

        textLambdaA1.setEnabled(false);

        jLabel11.setText("μ:");

        jLabel12.setText("σ:");

        textMuA1.setEnabled(false);

        textSigmaA1.setEnabled(false);

        buttonGroup2.add(radioButtonNormalA2);
        radioButtonNormalA2.setText("Normal");
        radioButtonNormalA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNormalA2ActionPerformed(evt);
            }
        });

        textMuA2.setEnabled(false);

        jLabel13.setText("μ:");

        jLabel14.setText("σ:");

        textSigmaA2.setEnabled(false);

        buttonGroup2.add(radioButtonExpA2);
        radioButtonExpA2.setText("Exponencial");
        radioButtonExpA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExpA2ActionPerformed(evt);
            }
        });

        jLabel15.setText("media:");

        textLambdaA2.setEnabled(false);

        buttonGroup2.add(radioButtonUniformeA2);
        radioButtonUniformeA2.setSelected(true);
        radioButtonUniformeA2.setText("Uniforme");

        jLabel16.setText("a:");

        textaA2.setText("30");

        jLabel17.setText("b:");

        textbA2.setText("50");

        buttonGroup3.add(radioButtonNormalA3);
        radioButtonNormalA3.setText("Normal");
        radioButtonNormalA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNormalA3ActionPerformed(evt);
            }
        });

        textMuA3.setEnabled(false);

        jLabel18.setText("μ:");

        jLabel19.setText("σ:");

        textSigmaA3.setEnabled(false);

        buttonGroup3.add(radioButtonExpA3);
        radioButtonExpA3.setSelected(true);
        radioButtonExpA3.setText("Exponencial");
        radioButtonExpA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExpA3ActionPerformed(evt);
            }
        });

        jLabel20.setText("media:");

        textLambdaA3.setText("30");
        textLambdaA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLambdaA3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioButtonUniformeA3);
        radioButtonUniformeA3.setText("Uniforme");

        jLabel21.setText("a:");

        textaA3.setEnabled(false);

        jLabel22.setText("b:");

        textbA3.setEnabled(false);

        buttonGroup4.add(radioButtonNormalA4);
        radioButtonNormalA4.setText("Normal");
        radioButtonNormalA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNormalA4ActionPerformed(evt);
            }
        });

        textMuA4.setEnabled(false);

        jLabel23.setText("μ:");

        jLabel24.setText("σ:");

        textSigmaA4.setEnabled(false);

        buttonGroup4.add(radioButtonExpA4);
        radioButtonExpA4.setText("Exponencial");
        radioButtonExpA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExpA4ActionPerformed(evt);
            }
        });

        jLabel25.setText("media:");

        textLambdaA4.setEnabled(false);

        buttonGroup4.add(radioButtonUniformeA4);
        radioButtonUniformeA4.setSelected(true);
        radioButtonUniformeA4.setText("Uniforme");

        jLabel26.setText("a:");

        textaA4.setText("10");

        jLabel27.setText("b:");

        textbA4.setText("20");

        jLabel28.setText("Actividad 5:");

        buttonGroup5.add(radioButtonNormalA5);
        radioButtonNormalA5.setText("Normal");
        radioButtonNormalA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNormalA5ActionPerformed(evt);
            }
        });

        jLabel29.setText("μ:");

        textMuA5.setEnabled(false);

        jLabel30.setText("σ:");

        textSigmaA5.setEnabled(false);

        buttonGroup5.add(radioButtonExpA5);
        radioButtonExpA5.setSelected(true);
        radioButtonExpA5.setText("Exponencial");
        radioButtonExpA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonExpA5ActionPerformed(evt);
            }
        });

        jLabel31.setText("media:");

        textLambdaA5.setText("5");
        textLambdaA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLambdaA5ActionPerformed(evt);
            }
        });

        buttonGroup5.add(radioButtonUniformeA5);
        radioButtonUniformeA5.setText("Uniforme");

        jLabel32.setText("a:");

        textaA5.setEnabled(false);

        jLabel33.setText("b:");

        textbA5.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrueba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidadFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioButtonNormalA1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMuA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textSigmaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioButtonExpA1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textLambdaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(radioButtonUniformeA1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textbA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioButtonNormalA2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textMuA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textSigmaA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioButtonExpA2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textLambdaA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(radioButtonUniformeA2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textaA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textbA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioButtonNormalA3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textMuA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textSigmaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioButtonExpA3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textLambdaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(radioButtonUniformeA3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textbA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioButtonNormalA4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textMuA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textSigmaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioButtonExpA4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textLambdaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(radioButtonUniformeA4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textbA4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonNormalA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMuA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSigmaA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButtonExpA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLambdaA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(radioButtonUniformeA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textaA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textbA5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidadFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnSimular)
                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(btnEvaluar))
                    .addComponent(lblPrueba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radioButtonNormalA1)
                    .addComponent(radioButtonExpA1)
                    .addComponent(radioButtonUniformeA1)
                    .addComponent(jLabel8)
                    .addComponent(textaA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textbA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(textLambdaA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(textMuA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSigmaA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioButtonNormalA2)
                    .addComponent(radioButtonExpA2)
                    .addComponent(radioButtonUniformeA2)
                    .addComponent(jLabel16)
                    .addComponent(textaA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(textbA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(textLambdaA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(textMuA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSigmaA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioButtonNormalA3)
                    .addComponent(radioButtonExpA3)
                    .addComponent(radioButtonUniformeA3)
                    .addComponent(jLabel21)
                    .addComponent(textaA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(textbA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(textLambdaA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(textMuA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSigmaA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radioButtonNormalA4)
                    .addComponent(radioButtonExpA4)
                    .addComponent(radioButtonUniformeA4)
                    .addComponent(jLabel26)
                    .addComponent(textaA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(textbA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(textLambdaA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(textMuA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSigmaA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(radioButtonNormalA5)
                    .addComponent(radioButtonExpA5)
                    .addComponent(radioButtonUniformeA5)
                    .addComponent(jLabel32)
                    .addComponent(textaA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(textbA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(textLambdaA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(textMuA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSigmaA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimularActionPerformed
        // TODO add your handling code here:
        N = Integer.parseInt(txtCantidadFilas.getText());
        desde = Integer.parseInt(txtDesde.getText());
        hasta = Integer.parseInt(txtHasta.getText());
        
         promedio = 0;
         
        obtenerDistribucionA1();
        obtenerDistribucionA2();
        obtenerDistribucionA3();
        obtenerDistribucionA4();
        obtenerDistribucionA5();
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        tabla = new DefaultTableModel();
        tabla.setColumnIdentifiers(columna);
        Fila aux1 = new Fila(auxA1, auxA2, auxA3, auxA4, auxA5);
        Fila aux2 = new Fila(auxA1, auxA2, auxA3, auxA4, auxA5);
        aux1.CalcularPrimeraFila();
        maximo = aux1.getTiempoA5();
        minimo = aux1.getTiempoA5();
        for (int i = 0; i < N; i++) {
            aux2.CalcularNuevaFila(aux1.getContadorN(), aux1.getPromedio());
            if (aux1.getContadorN() >= desde && aux1.getContadorN() <= hasta || aux1.getContadorN() == N) {
                llenarFila(aux1);
                tabla.addRow(filaAImprimir);
                if (aux2.getContadorN() == 2) {
                    aux2.setAcumulador(aux1.getAcumulador()+aux2.getTiempoA5());
                    aux2.setPromedio(aux2.getAcumulador()/2);
                    llenarFila(aux2);
                    tabla.addRow(filaAImprimir);
                }
            }
            if (aux1.getContadorN() == N) {
                promedio=aux1.getPromedio();
            }
            if (i < 500){
                dataset.addValue(aux1.getPromedio(), "", String.valueOf(i));
            }
            if(aux1.getTiempoA5()<=45.0){
                counterProbabilidad45dias++;
            }
            aux1 = aux2;
            if (aux1.getTiempoA5() > maximo){
                maximo= aux1.getTiempoA5();
            }
            if(aux1.getTiempoA5() < minimo){
                minimo = aux1.getTiempoA5();
            }
        }
        double promedio45 = (double)counterProbabilidad45dias / (double) N;
        System.out.println("Maximo:" + maximo + " Minimo: " + minimo);
        System.out.println("Probabilidad de completar en 45 dias o menos: %" + 100*promedio45);
        Tabla.setModel(tabla);
        
        double all[] = new double[hasta];
        for (int i = 0; i < hasta; i++) {
            all[i] = Double.parseDouble(Tabla.getModel().getValueAt(i, 11).toString().replace(",", "."));
        }
        Arrays.sort(all);
        double masBajo=999999;
        for (int i = 0; i < all.length; i++) {
            double d = all[i];
            if((double)i/all.length > 0.9 ){
                if (d<masBajo){
                    masBajo=d;
                }
            }
        }
        
        System.out.println("Fecha mas baja posible con 90% de confianza: " + masBajo);
       /* JFreeChart lineChart = ChartFactory.createLineChart(
         "Prueba",
         "Years","Number of Schools",
         dataset,
         PlotOrientation.VERTICAL,
         true,true,false);
        ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
      ChartFrame frame = new ChartFrame("Gráfico de barras",lineChart);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);*/
      
      
       // CalcularRestantes();
      // lblPrueba.setText(String.valueOf(promedio31) + " || " + String.valueOf(promedio32) + " || " + String.valueOf(promedio33) + " || " + String.valueOf(promedio34));
    }//GEN-LAST:event_BtnSimularActionPerformed
    
    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        // TODO add your handling code here:

        pantallaActual.dispose();
//        pantallaActual = new Resultado(promedio31, promedio32, promedio33, promedio34);
        pantallaActual.setVisible(true);
        
      
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void radioButtonNormalA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNormalA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNormalA1ActionPerformed

    private void radioButtonExpA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExpA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonExpA1ActionPerformed

    private void radioButtonNormalA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNormalA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNormalA2ActionPerformed

    private void radioButtonExpA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExpA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonExpA2ActionPerformed

    private void radioButtonNormalA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNormalA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNormalA3ActionPerformed

    private void radioButtonExpA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExpA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonExpA3ActionPerformed

    private void radioButtonNormalA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNormalA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNormalA4ActionPerformed

    private void radioButtonExpA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExpA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonExpA4ActionPerformed

    private void radioButtonNormalA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNormalA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNormalA5ActionPerformed

    private void radioButtonExpA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonExpA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonExpA5ActionPerformed

    private void textaA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textaA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textaA1ActionPerformed

    private void textLambdaA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLambdaA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLambdaA3ActionPerformed

    private void textLambdaA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLambdaA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLambdaA5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSimular;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JRadioButton radioButtonExpA1;
    private javax.swing.JRadioButton radioButtonExpA2;
    private javax.swing.JRadioButton radioButtonExpA3;
    private javax.swing.JRadioButton radioButtonExpA4;
    private javax.swing.JRadioButton radioButtonExpA5;
    private javax.swing.JRadioButton radioButtonNormalA1;
    private javax.swing.JRadioButton radioButtonNormalA2;
    private javax.swing.JRadioButton radioButtonNormalA3;
    private javax.swing.JRadioButton radioButtonNormalA4;
    private javax.swing.JRadioButton radioButtonNormalA5;
    private javax.swing.JRadioButton radioButtonUniformeA1;
    private javax.swing.JRadioButton radioButtonUniformeA2;
    private javax.swing.JRadioButton radioButtonUniformeA3;
    private javax.swing.JRadioButton radioButtonUniformeA4;
    private javax.swing.JRadioButton radioButtonUniformeA5;
    private javax.swing.JTextField textLambdaA1;
    private javax.swing.JTextField textLambdaA2;
    private javax.swing.JTextField textLambdaA3;
    private javax.swing.JTextField textLambdaA4;
    private javax.swing.JTextField textLambdaA5;
    private javax.swing.JTextField textMuA1;
    private javax.swing.JTextField textMuA2;
    private javax.swing.JTextField textMuA3;
    private javax.swing.JTextField textMuA4;
    private javax.swing.JTextField textMuA5;
    private javax.swing.JTextField textSigmaA1;
    private javax.swing.JTextField textSigmaA2;
    private javax.swing.JTextField textSigmaA3;
    private javax.swing.JTextField textSigmaA4;
    private javax.swing.JTextField textSigmaA5;
    private javax.swing.JTextField textaA1;
    private javax.swing.JTextField textaA2;
    private javax.swing.JTextField textaA3;
    private javax.swing.JTextField textaA4;
    private javax.swing.JTextField textaA5;
    private javax.swing.JTextField textbA1;
    private javax.swing.JTextField textbA2;
    private javax.swing.JTextField textbA3;
    private javax.swing.JTextField textbA4;
    private javax.swing.JTextField textbA5;
    private javax.swing.JTextField txtCantidadFilas;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    // End of variables declaration//GEN-END:variables
}
