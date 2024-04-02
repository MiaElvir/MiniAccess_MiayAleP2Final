/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop2_miniaccess_miaelvir_alereyes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelesBases extends JPanel{
    
    protected JLabel nombreBase;

    public PanelesBases(JPanel UML, JLabel nombreBase, int tablas, String [] nombres) {
        
        setBackground(Color.gray);
        setSize(new Dimension(170, 90));
        //setLayout(null);
        //nombreBase.setBounds(this.getX(), this.getY(), 120, 30);
        add(nombreBase);
        JPanel [] paneles = new JPanel[tablas];
        for (int i = 0; i < tablas; i++) {
            JPanel panel =  new JPanel();
            panel.setBackground(Color.pink);
            panel.setSize(new Dimension(70, 60));
            JLabel nombre = new JLabel(nombres[i]);
            nombre.setFont(getFont());
            panel.add(nombre);
            paneles[i] = panel;          
        }
        
        for (int i = 0; i < paneles.length; i++) {
            this.add(paneles[i]);
            
        }
        
        UML.add(this);
        
    }
    
    
    
    
    
}
