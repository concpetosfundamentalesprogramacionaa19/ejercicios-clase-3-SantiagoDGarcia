/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;

import paquetedatos.Variable;
import paquetedatos.VariableDos;

/**
 *
 * @author Sant Garcia
 */
public class Principal {
    
    public static void main(String[] args) {
        
        double resultado, resultado2;
        
        resultado =  Variable.numero1 + Variable.numero2;
        resultado2 = VariableDos.numero3+Variable.numero1;
        
            System.out.printf("El resultado es : %.1f\nEl resultado dos es : %.1f", resultado, resultado2);
       
       }
    
}

