/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema3;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n;  //declaración de variables
    int factorial;
                                         //Métodos
    n = entradaDato();                   //Pedir datos
    factorial = calcularFactorial(n);    //Metodo para saber el factorial de un numero
    mostrarResultado(factorial);         //Mostrar resultado
    }
    
    public static int entradaDato() {       //Pedir dato
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir número entero para calcular su factorial");
        dato = entrada.nextInt();
        return dato;
    }
    
    public static int calcularFactorial(int j) {    //CalcularFactorial
        int fact=1;
        for(int i=2; i<=j; i++){
            fact=fact*i;}
    return fact;
    }
    
    public static void mostrarResultado(int x) {    //Mostrar Resultado
        System.out.println(x);
    } 
}
