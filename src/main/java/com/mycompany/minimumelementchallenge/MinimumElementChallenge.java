/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minimumelementchallenge;

/**
 *
 * @author laisp_omzy4s1
 */
//Minimum Element Challenge
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main (String[] args) {
        int[] ordemUser = readIntegers (); //vet transformado e método para ler a entrada
        System.out.print ("Os numeros digitados foram: ");
        System.out.print (Arrays.toString (ordemUser)); //printa o vetor de inteiros
        int numeroMinimo = findMin (ordemUser); //valor encontrado e método para achar o valor mínimo
        System.out.printf ("\nO numero minimo e: " + numeroMinimo); //printa o menor valor
    }

    public static
    int[] readIntegers () { //método para ler a entrada
        Scanner input = new Scanner (System.in);
        System.out.println ("Minimum Element Challenge");
        System.out.print ("Digite os numeros (separados por virgula): ");
        String entrada = input.nextLine (); //lê a linha de entrada (com vírgula)


        String[] splits = entrada.split (","); //tira as vírgulas
        int[] numeros = new int[splits.length]; //cria um vetor com tamanho = número de elementos da entrada
        //que nao eram virgulas
        for (int i = 0; i < splits.length; i++) {
            numeros[i] = Integer.parseInt (splits[i].trim ()); //transforma esses elementos em seus
            // valores inteiros
        }

        return numeros; //devolve o vetor com inteiros pra main
    }


    public static int findMin (int[] ordemUser) {
        int min = ordemUser[0]; //deixa o valor minimo como o primeiro
        for (int i = 1; i < ordemUser.length; i++) { //compara um por um
            min = Math.min (min , ordemUser[i]); //ve qual é o menor entre cada dupla
        }
        return min; //devolve o menor valor para main
    }

}
