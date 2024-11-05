/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myjframe;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Emmanuel Motta Reyes
 */

public class MyJFrame extends JFrame {
    private final JLabel myLabel;

    public MyJFrame() {

        myLabel = new JLabel("Hola Mundo");
        add(myLabel);

        setTitle("Mi JFrame");
        setSize(170, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame();
        frame.setVisible(true);
    }
}
