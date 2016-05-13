/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cek angka = new Cek();
        System.out.print("Program Pengecekan Angka\nInput angka : ");
        String a = scan.next();
        double b = Double.parseDouble(a);
        System.out.print("Menampilkan hasil :\n");
        if (a.contains(".")) {
            angka.methodD1();
        }else
            angka.methodI1();
    }
}
