// Nama: Nabil Daffa Athalasyah
// NIM: 2409116090
// Kelas: C 2024

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabil.daffa_posttest1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NabilDaffa_PostTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> aset = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===< SELAMAT DATANG DI PLATFORM AKADEMI INVESTASI >===");
            System.out.println("\n=== MENU MANAJEMEN DATA ASET INVESTASI ===");
            System.out.println("1. Tambah Aset");
            System.out.println("2. Lihat Aset");
            System.out.println("3. Ubah Aset");
            System.out.println("4. Hapus Aset");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Aset Investasi ---");
                    System.out.print("Masukkan nama aset (Emas/Saham/Crypto/Obligasi/Reksa Dana): ");
                    String namaAset = input.nextLine();
                    aset.add(namaAset);
                    System.out.println("Aset berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Aset Investasi ---");
                    if (aset.isEmpty()) {
                        System.out.println("Belum ada data aset Investasi yang ditambahkan.");
                    } else {
                        for (int i = 0; i < aset.size(); i++) {
                            System.out.println((i + 1) + ". " + aset.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Ubah Aset Investasi ---");
                    if (aset.isEmpty()) {
                        System.out.println("Belum ada data aset untuk diubah.");
                    } else {
                        for (int i = 0; i < aset.size(); i++) {
                            System.out.println((i + 1) + ". " + aset.get(i));
                        }
                        System.out.print("Pilih nomor aset yang ingin diubah: ");
                        int indexUbah = input.nextInt();
                        input.nextLine();
                        if (indexUbah > 0 && indexUbah <= aset.size()) {
                            System.out.print("Masukkan nama aset baru: ");
                            String asetBaru = input.nextLine();
                            aset.set(indexUbah - 1, asetBaru);
                            System.out.println("Aset berhasil diubah!");
                        } else {
                            System.out.println("Nomor aset tidak valid! Silahkan Coba Lagi!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Hapus Aset Investasi ---");
                    if (aset.isEmpty()) {
                        System.out.println("Belum ada data aset untuk dihapus.");
                    } else {
                        for (int i = 0; i < aset.size(); i++) {
                            System.out.println((i + 1) + ". " + aset.get(i));
                        }
                        System.out.print("Pilih nomor aset yang ingin dihapus: ");
                        int indexHapus = input.nextInt();
                        input.nextLine();
                        if (indexHapus > 0 && indexHapus <= aset.size()) {
                            aset.remove(indexHapus - 1);
                            System.out.println("Aset berhasil dihapus!");
                        } else {
                            System.out.println("Nomor aset tidak valid! Silahkan Coba Lagi!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Sampai jumpa lagi!.");
                    break;

                default:
                    System.out.println("Pilihan yang anda masukkan tidak valid! Silahkan Coba lagi!");
            }

        } while (pilihan != 5);

        input.close();
    }
}