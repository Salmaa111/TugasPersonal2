/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Salma
 */

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import java.util.Scanner;

public class DrawCircle extends JFrame implements MouseListener{
    
    JLabel label;
    
    public DrawCircle(){
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label = new JLabel();
        addMouseListener(this);
        add(label);

}
    @Override
    public void paint(Graphics g) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Masukkan nilai x = ");
        int x = myobj.nextInt();
        System.out.print("Masukkan nilai y = ");
        int y = myobj.nextInt();
        System.out.print("Masukkan nilai r = ");
        int r = myobj.nextInt();
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(x ,y, 2*r, 2*r);
    }
    
    public void mouseClicked(MouseEvent e) {
        
    }
    
    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }
    
    public void mouseEntered(MouseEvent e) {
        //System.out.println("Mouse point is inside in circle");
        label.setText("Mouse point is inside in circle");
    }
    
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse point is out in circle");
    }
    
    public static void main(String[] args) {
       new DrawCircle();
    }
}