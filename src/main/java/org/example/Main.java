package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // scan input dari user
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan total hari:");
        int totalHari = inputUser.nextInt();

        // hitung total hari dari inputan user
        double dayToYear = (double)totalHari / (double)360;
        double sisaPembulatanTahun = dayToYear - (int) dayToYear;
        int nilaiPembulatanTahun = (int) dayToYear;

        // konversi tahun jadi bulan
        double yearToMonth = sisaPembulatanTahun * (double)12;
        double sisaPembulatanBulan = yearToMonth - (int) yearToMonth;
        int nilaiPembulatanBulan = (int) yearToMonth;

        // konversi bulan jadi minggu
        double monthToWeek = sisaPembulatanBulan * (double)30 / (double)7;
        double sisaPembulatanMinggu = monthToWeek - (int) monthToWeek;
        int nilaiPembulatanMinggu = (int) monthToWeek;

        // konversi minggu ke hari
        double weekToDay = (double)sisaPembulatanMinggu * (double)7;
        int nilaiPembulatanHari = (int) Math.round(weekToDay);

        String hasilPrint = String.format("%d Tahun, %d Bulan, %d minggu, %d hari", nilaiPembulatanTahun, nilaiPembulatanBulan, nilaiPembulatanMinggu, nilaiPembulatanHari);
        System.out.println(hasilPrint);

    }
}