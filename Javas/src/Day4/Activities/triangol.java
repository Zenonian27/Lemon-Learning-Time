/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thexe
 */
public class triangol {


public static void main(String[] args) {
triangol tryyy = new triangol();
tryyy.sortings();
}


public void sortings(){
    int[] numero = {5,4,3,2,1};
    int tempo;

    System.out.print("The sorted now: ");
    for(int num: numero){
        for(int ii = num+1; ii< numero.length; ii++){
            if (numero[num] > numero[ii]) {
                tempo = numero[num];
                numero[num] = numero[ii];
                numero[ii] = tempo;
            }
        }

    }
    
    System.out.println(numero);

    }
}