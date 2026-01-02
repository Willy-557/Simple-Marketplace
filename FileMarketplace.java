class Produk {
    String nama;
    double harga;
    int stok;

    Produk(String nama, double harga, int stok){
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

