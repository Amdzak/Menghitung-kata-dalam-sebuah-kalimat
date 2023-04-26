//2023/04/26 21:04

//Buatlah program Java untuk menghitung jumlah kata dalam sebuah kalimat yang dimasukkan oleh pengguna.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("\tMenghitung banyaknya kata dalam 1 kalimat");
        System.out.print("Masukan Sebuah Kalimat : ");
        String kalimat = inputUser.nextLine();

        int total = 1; //sebab dalam sebuah kalimat pasti ada 1 kata

        for (int i = 0; i < kalimat.length(); i++) { //panjang di tentukan oleh panjang kalimat
            if (kalimat.charAt(i) == ' ') { // digunkaan jika apada index tertentu ada spasi maka akan dianggap sebagai kata baru dalam sebuah kalimat
                total++;
            }
        }

        System.out.println("Total kata dalam 1 kalimat adalah : " + total);
    }
}
