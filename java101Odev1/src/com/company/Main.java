package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double boy,kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz :");
        kilo=input.nextDouble();

        double indeks = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz =" + indeks);

    }
}
