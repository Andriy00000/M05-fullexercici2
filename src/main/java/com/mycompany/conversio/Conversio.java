/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selecciona 1 per passar d'Euro a Lliura");
        
        System.out.println("Selecciona 2 per passar de Lliura a Euro");
        
        int seleccio = sc.nextInt();
        
        if (seleccio == 1) {
            System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d; //lliura esterlina
        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
        }
        if (seleccio == 2) {
            System.out.println("Introdueix en £");
        int valor_lliures = sc.nextInt();
                
        double tipus_de_canvi2 = 1.14d; //euros
        System.out.println(valor_lliures + " lliures (£) actualment equivalen a " + (valor_lliures * tipus_de_canvi2) + " euros (€)");
        }
        
    }
}
