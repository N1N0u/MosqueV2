package interfaces;

import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;

import chart.ModelChart;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Statistics extends javax.swing.JPanel {

    public Statistics() {
        initComponents();
        setOpaque(false);
        gaugeChart1.setValueWithAnimation(75);
        gaugeChart2.setValueWithAnimation(90);
       // gaugeChart3.setValueWithAnimation(45);
        init();
    }

    private void init() {
        barChart.addLegend("المداخيل", new Color(12, 84, 175), new Color(0, 108, 247));
        barChart.addLegend("المخاريج", new Color(54, 4, 143), new Color(104, 49, 200));
       
        barChart.addData(new ModelChart("جانفي", new double[]{500, 200, 80, 89}));
        barChart.addData(new ModelChart("فيفري", new double[]{600, 750, 90, 150}));
        barChart.addData(new ModelChart("مارس", new double[]{200, 350, 460, 900}));
        barChart.addData(new ModelChart("أفريل", new double[]{480, 150, 750, 700}));
        barChart.addData(new ModelChart("ماي", new double[]{350, 540, 300, 150}));
        barChart.addData(new ModelChart("جوان", new double[]{190, 280, 81, 200}));
        barChart.start();
        
        lineChart.addLegend("المداخيل", new Color(12, 84, 175), new Color(0, 108, 247));
        lineChart.addLegend("المخاريج", new Color(54, 4, 143), new Color(104, 49, 200));
   
        lineChart.addData(new ModelChart("جانفي", new double[]{500, 200, 80, 89}));
        lineChart.addData(new ModelChart("فيفري", new double[]{600, 750, 90, 150}));
        lineChart.addData(new ModelChart("مارس", new double[]{200, 350, 460, 900}));
        lineChart.addData(new ModelChart("أفريل", new double[]{480, 150, 750, 700}));
        lineChart.addData(new ModelChart("ماي", new double[]{350, 540, 300, 150}));
        lineChart.addData(new ModelChart("جوان", new double[]{190, 280, 81, 200}));
        lineChart.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new com.raven.swing.PanelShadow();
        gaugeChart1 = new chart.GaugeChart();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelShadow2 = new com.raven.swing.PanelShadow();
        gaugeChart2 = new chart.GaugeChart();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelShadow3 = new com.raven.swing.PanelShadow();
        gaugeChart3 = new chart.GaugeChart();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelShadow4 = new com.raven.swing.PanelShadow();
        lineChart = new chart.LineChart();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelShadow5 = new com.raven.swing.PanelShadow();
        barChart = new chart.Chart();
        jLabel24 = new javax.swing.JLabel();

        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        gaugeChart1.setColor1(new java.awt.Color(255, 255, 255));
        gaugeChart1.setColor2(new java.awt.Color(69, 71, 252));
        gaugeChart1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel1.setFont(new Font("Sakkal Majalla", Font.BOLD, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 97, 97));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("المداخيل");

//        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel2.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel2.setText("September");
//        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel3.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel3.setText("$ 8,150");
//        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel4.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel4.setText("October");
//        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel5.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel5.setText("$ 5,205");
//        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel6.setForeground(new java.awt.Color(80, 116, 253));
//        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel6.setText("$ 6,700");
//        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel7.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel7.setText("November");
//        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelShadow2.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        gaugeChart2.setColor1(new java.awt.Color(255, 255, 255));
        gaugeChart2.setColor2(new java.awt.Color(119, 26, 217));
        gaugeChart2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel8.setFont(new Font("Sakkal Majalla", Font.BOLD, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(97, 97, 97));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المخاريج");

//        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel9.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel9.setText("September");
//        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel10.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel10.setText("$ 8,150");
//        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel11.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel11.setText("October");
//        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel12.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel12.setText("$ 5,205");
//        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel13.setForeground(new java.awt.Color(150, 56, 248));
//        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel13.setText("$ 6,700");
//        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel14.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel14.setText("November");
//        jLabel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)))
                    .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

//        panelShadow3.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//        gaugeChart3.setColor1(new java.awt.Color(255, 255, 255));
//        gaugeChart3.setColor2(new java.awt.Color(248, 78, 78));
//        gaugeChart3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//
//        jLabel15.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
//        jLabel15.setForeground(new java.awt.Color(97, 97, 97));
//        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        jLabel15.setText("Total Income");
//
//        jLabel16.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel16.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel16.setText("September");
//        jLabel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel17.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel17.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel17.setText("$ 8,150");
//        jLabel17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel18.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel18.setText("October");
//        jLabel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel19.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel19.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel19.setText("$ 5,205");
//        jLabel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel20.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel20.setForeground(new java.awt.Color(255, 111, 111));
//        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
//        jLabel20.setText("$ 6,700");
//        jLabel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        jLabel21.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
//        jLabel21.setForeground(new java.awt.Color(133, 133, 133));
//        jLabel21.setText("November");
//        jLabel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
//
//        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
//        panelShadow3.setLayout(panelShadow3Layout);
//        panelShadow3Layout.setHorizontalGroup(
//            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelShadow3Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
//                    .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(panelShadow3Layout.createSequentialGroup()
//                        .addComponent(jLabel16)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jLabel17))
//                    .addGroup(panelShadow3Layout.createSequentialGroup()
//                        .addComponent(jLabel18)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jLabel19))
//                    .addGroup(panelShadow3Layout.createSequentialGroup()
//                        .addComponent(jLabel21)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jLabel20)))
//                .addContainerGap())
//        );
//        panelShadow3Layout.setVerticalGroup(
//            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
//                .addComponent(jLabel15)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addGroup(panelShadow3Layout.createSequentialGroup()
//                        .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel16)
//                            .addComponent(jLabel17))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel18)
//                            .addComponent(jLabel19))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel21)
//                            .addComponent(jLabel20)))
//                    .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap())
//        );

        panelShadow4.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineChart, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        jLabel22.setFont(new Font("Sakkal Majalla", Font.BOLD, 26)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(56, 56, 56));
        jLabel22.setText("منحنى بياني");
      //  jLabel22.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel23.setFont(new Font("Sakkal Majalla", Font.BOLD, 26)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(241, 241, 241));
        jLabel23.setText("تقرير الإحصائيات");
        jLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        panelShadow5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addComponent(barChart, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel24.setFont(new Font("Sakkal Majalla", Font.BOLD, 26)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(56, 56, 56));
        jLabel24.setText("أعمدة بيانية");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panelShadow4, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(panelShadow1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        			.addGap(0)
        			.addComponent(panelShadow2, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        			.addGap(0))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel23)
        			.addContainerGap(632, Short.MAX_VALUE))
        		.addComponent(panelShadow5, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(415)
        			.addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        			.addGap(413))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(449)
        			.addComponent(jLabel24, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        			.addGap(372))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(jLabel23)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panelShadow1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelShadow2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(2)
        			.addComponent(jLabel22)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panelShadow4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel24)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panelShadow5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chart.Chart barChart;
    private chart.GaugeChart gaugeChart1;
    private chart.GaugeChart gaugeChart2;
    private chart.GaugeChart gaugeChart3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private chart.LineChart lineChart;
    private com.raven.swing.PanelShadow panelShadow1;
    private com.raven.swing.PanelShadow panelShadow2;
    private com.raven.swing.PanelShadow panelShadow3;
    private com.raven.swing.PanelShadow panelShadow4;
    private com.raven.swing.PanelShadow panelShadow5;
    // End of variables declaration//GEN-END:variables
}
