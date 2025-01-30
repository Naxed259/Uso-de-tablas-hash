package ptabhashf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TablasH extends javax.swing.JFrame {
    private Map<Integer, String> tablaHash;
    private List<String> colisiones;


    public TablasH() {
        initComponents();
        tablaHash = new HashMap<>();
        colisiones = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reporte");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Convertir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String clave = JOptionPane.showInputDialog("Ingrese la clave:");
        int direccion = obtenerDireccion(clave);
        if (tablaHash.containsKey(direccion)) {
            colisiones.add(clave);
            jTextArea1.append("Colisión: " + clave + "\n");
        } else {
            tablaHash.put(direccion, clave);
            jTextArea1.append("Clave: " + clave + ",  Dirección: " + direccion + "\n");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private int obtenerDireccion(String clave) {
        // Implementar la función de hash adecuada para obtener la dirección de almacenamiento
        int sumaAscii = 0;
        for (char c : clave.toCharArray()) {
            sumaAscii += (int) c;
        }
        return sumaAscii % 10; // Modificar este valor para ajustarlo al tamaño de la tabla hash deseada
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String clave = JOptionPane.showInputDialog("Ingrese la clave a eliminar:");
        if (tablaHash.containsValue(clave)) {
            int direccion = buscarDireccion(clave);
            tablaHash.remove(direccion);
            jTextArea1.setText(eliminarEntrada(jTextArea1.getText(), clave));
            jTextArea1.append("Clave eliminada correctamente: " + clave + "\n");
        } else {
            jTextArea1.append("La clave no existe en la tabla hash.\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
    private String eliminarEntrada(String text, String clave) {
        String[] lines = text.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (!line.contains(clave)) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String clave = JOptionPane.showInputDialog("Ingrese la clave a buscar:");
        int direccion = buscarDireccion(clave);
        if (direccion != -1) {
            JOptionPane.showMessageDialog(this, "La clave '" + clave + "' se encuentra en la dirección: " + direccion);
        } else {
            JOptionPane.showMessageDialog(this, "La clave '" + clave + "' no existe en la tabla hash.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private int buscarDireccion(String clave) {
        for (Map.Entry<Integer, String> entry : tablaHash.entrySet()) {
            if (entry.getValue().equals(clave)) {
                return entry.getKey();
            }
        }
        return -1; // Si no se encuentra la clave, se retorna -1
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        generarReporte();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void generarReporte() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte\n");
        for (Map.Entry<Integer, String> entry : tablaHash.entrySet()) {

        }
        if (!colisiones.isEmpty()) {
            reporte.append("\nLista de colisiones:\n");
            for (String colision : colisiones) {
                reporte.append(colision).append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, reporte.toString());
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                leerArchivo(selectedFile);
                jTextArea1.append("carga exitosa.\n");
            } catch (IOException e) {
                jTextArea1.append("Error al leer el archivo.\n");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void leerArchivo(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String clave = generarClave(line);
            int direccion = obtenerDireccion(clave);
            if (tablaHash.containsKey(direccion)) {
                colisiones.add(clave);
            } else {
                tablaHash.put(direccion, clave);
            }
            jTextArea1.append("Clave: " + clave + ", Dirección: " + direccion + "\n");
        }
        reader.close();
    }
     private String generarClave(String dato) {
        return dato;
    }
     
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                guardarTabla(selectedFile);
                jTextArea1.append("Tabla guardada correctamente en el archivo.\n");
            } catch (IOException e) {
                jTextArea1.append("Error al guardar la tabla en el archivo.\n");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void guardarTabla(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Map.Entry<Integer, String> entry : tablaHash.entrySet()) {
            
            String clave = entry.getValue();
            writer.write( clave + "\n");
        }
        writer.close();
    }
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablasH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
