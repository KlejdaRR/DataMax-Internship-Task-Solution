/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamax;

import java.util.Arrays;

/***USHTRIMI:
Given two arrays (array_a and array_b) with integer numbers, write a function that returns an array containing all elements in both arrays without duplicates.
Requirements:
Use only arrays as data structures. Sets, trees or maps are not allowed.
Ordering of elements in the returned array is not important.
There are no duplicated elements in either arrays.
Aim for an optimal solution.


 * O ((n + m) (log(n + m))) - Hapesira ne memorie e arritur nga ushtrimi qe kam realizuar
 *
 * 
 */
public class DataMax {

    public static void HiqDuplikatat(int vektor[], int vektor2[], int rezultat[]) {
 
          int gjatesi1 = vektor.length;
          int gjatesi2 = vektor2.length;
           
         //bejme bashkimin e dy vektoreve
              
        int l = 0, q = 0, o = 0;
        
        while (l < gjatesi1) {
            rezultat[o] = vektor[l];
            l++;
            o++;
        }
         
        while (q < gjatesi2) {
            rezultat[o] = vektor2[q];
            q++;
            o++;
        }
     
        // rendisim vektorin e ri
        Arrays.sort(rezultat);
                     
        int gjatesi3 = rezultat.length;
        int j = 0;
 
        //kontrollojme vektorin rezultat te renditur
        
        for (int i = 0; i < gjatesi3 - 1; i++) {
 
            //kushti nqs vlerat ne pozicionet i dhe i+1 jane te barabarta
            if (rezultat[i] != rezultat[i + 1]) {
                rezultat[j++] = rezultat[i];
            }
        }
 
        rezultat[j++] = rezultat[gjatesi3 - 1];
 
        for (int k = 0; k < j; k++) {
           System.out.print(rezultat[k] + " ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         int vektor[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7 }; //1 2 4 4 5 5 6 6 7 8
         int vektor2[] = { 4, 5, 6, 8, 7 };// 4 5 6 7 8
         int rezultat[] = new int [vektor.length + vektor2.length];
         //1 2 4 5 6 7 8
        HiqDuplikatat(vektor, vektor2, rezultat);
    }
   } 