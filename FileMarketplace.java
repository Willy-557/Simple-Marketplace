import java.util.Scanner;
import java.util.HashMap;

class Produk {
    String nama;
    double harga;
    int stok;

    public Produk(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void cekInfo(){
        System.out.println("Nama barang: " + this.nama);
        System.out.println("Harga barang: " + this.harga);
        System.out.println("Stock barang: " + this.stok);
    }
}

class Penjual {
    String nama;
    double saldo;

    Penjual(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    void cekDompet(){
        System.out.println("Nama toko: " + this.nama);
        System.out.println("Saldo toko: " + this.saldo);
    }
}

class Pembeli {
    String nama;
    double saldo;

    Pembeli(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    void beliBarang(Penjual siPenjual, Produk barangDibeli, int jumlahBeli){
        double totalHarga = jumlahBeli * barangDibeli.harga;
        if (jumlahBeli < barangDibeli.stok){
            System.out.println("Stok Habis!");
        }
        else{
            if (this.saldo < totalHarga) {
                System.out.println("Uang tidak cukup!");
            }
            else{
                double saldo = this.saldo - totalHarga;
                double saldoPenjual = siPenjual.saldo + totalHarga;
                int stokBarang = barangDibeli.stok - jumlahBeli;
                System.out.println("Berhasil beli " + barangDibeli.nama + " , sisa uang: Rp " + this.saldo + " .");
            }
        }
    }
}


public class FileMarketplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Simple MarketPlace ---");
            System.out.println("1. Pembeli");
            System.out.println("2. Penjual");
            System.out.println("3. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();
            
            if (opsi == 3) {
                System.out.println("Terimakasih!");
                break;
            }
        }
    }
}

