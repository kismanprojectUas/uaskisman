package OverloadingMatematika;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KISMAN
 */
public class matematikacanggih extends matematika{
      void modulus(double a,double b,double c){
        double hasil = a%b%c;
        System.out.println("\nhasil modulus : "+ hasil);
    }
     void modulus(double a,double b){
        double hasil = a%b;
        System.out.println("hasil modulus : "+ hasil);
    }
     void modulus(int a,int b,int c){
        int hasil = a%b%c;
        System.out.println("hasil modulus : "+ hasil);
    }
      void modulus(int a,int b){
        int hasil = a%b;
        System.out.println("hasil modulus : "+ hasil);
    }
}
