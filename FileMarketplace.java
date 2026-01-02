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

    public void beliBarang(Penjual siPenjual, Produk barangDibeli, int jumlahBeli){
        double totalHarga = jumlahBeli * barangDibeli.harga;
        if (jumlahBeli > barangDibeli.stok) {
            System.out.println("Stok Habis!");
        }
        else{
            if (this.saldo < totalHarga) {
                System.out.println("Uang tidak cukup!");
            }
            else{
                this.saldo -= totalHarga;
                siPenjual.saldo += totalHarga;
                barangDibeli.stok -= jumlahBeli;
                System.out.println("Berhasil beli " + barangDibeli.nama + " , sisa uang: Rp " + this.saldo + " .");
            }
        }
    }
}


public class FileMarketplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Produk> katalogProduk = new HashMap<>();
        Penjual toko = new Penjual("Official Store", 0);

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
            else if (opsi > 3 || opsi < 0) {
                System.out.println("Harap masukkan menu 1 sampai 3!");
                continue;
            }
            else {
                if (opsi == 1) {
                    System.out.println("--- MARKETPLACE ---");
                    System.out.println("1. Lihat barang");
                    System.out.println("2. Beli barang");
                    System.out.println("3. Keluar");
                    System.out.print(">> ");
                    int choiceBuyer = scanner.nextInt();

                    if (choiceBuyer == 3){
                        break;
                    }
                    else if (choiceBuyer > 3 || choiceBuyer < 0) {
                        System.out.println("Harap masukkan menu 1 sampai 3!");
                        continue;
                    }
                    else {
                        switch (choiceBuyer) {
                            case 1:
                                System.out.println("\n=== Daftar produk ===\n");
                                for (Integer nomor : katalogProduk.keySet()){
                                    Produk barang = katalogProduk.get(nomor);
                                    System.out.println(nomor + ". Nama barang: " + barang.nama + "\n" + "   Harga barang: " + barang.harga + "\n" + "   Stok barang: " + barang.stok);
                                    System.out.println("-------------------------------");
                                    System.out.println("\n");
                                }
                                break;
                        
                            case 2:
                                System.out.println("\n=== Daftar produk ===\n");
                                for (Integer nomor : katalogProduk.keySet()){
                                    Produk barang = katalogProduk.get(nomor);
                                    System.out.println(nomor + ". Nama barang: " + barang.nama + "\n" + "   Harga barang: " + barang.harga + "\n" + "   Stok barang: " + barang.stok);
                                    System.out.println("-------------------------------");
                                    System.out.println("\n");
                                }

                                scanner.nextLine();
                                System.out.print("Pilih nomor barang yang akan di-beli: ");
                                int noBarang = scanner.nextInt();

                                if (katalogProduk.containsKey(noBarang)){
                                    Produk pembelian = katalogProduk.get(noBarang);
                                    System.out.print("Mau beli berapa unit: ");
                                    int jumlahPembelianStok = scanner.nextInt();
                                    saya.beliBarang(toko, pembelian, jumlahPembelianStok);
                                }
                        }
                    }
                }
            }
        }
    }
}

