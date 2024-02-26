/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2"));

        Operaciones oper=new Operaciones();
        oper.sumar(n1,n2);
        oper.resta(n1, n2);
        oper.multiplicacion(n1, n2);
        oper.division(n1,n2);
        oper.mostrarResultados();
        
    }
}
