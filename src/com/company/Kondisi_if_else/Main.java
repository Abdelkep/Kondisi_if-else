package com.company.Kondisi_if_else;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 - 100: ");
        int angka = input.nextInt();
        if(angka < 1 || angka > 100)
            System.out.print("\nMasukkan Angka 1 - 100");
        else if(angka % 2 != 0)
            System.out.print("\najaib");
        else if(angka % 2 == 0 && angka < 6)
            System.out.print("\ntidak ajaib");
        else if(angka % 2 == 0 && angka < 20)
            System.out.print("\najaib");
        else
            System.out.print("\ntidak ajaib");

    }
}

