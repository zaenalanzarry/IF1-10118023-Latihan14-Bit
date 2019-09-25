/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan14;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Bit
 */

public class Latihan14 {

    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;
        System.out.println("a & b = " + c);
        c = a | b;
        System.out.println("a | b = " + c);
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        c = ~a;
        System.out.println("~a = " + c);
        c = a <<2;
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
    
}
