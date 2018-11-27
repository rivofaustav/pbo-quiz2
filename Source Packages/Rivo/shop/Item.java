
package Rivo.shop;

/**
 *
 * @author Rivo
 */
public class Item {
    private String nama; //variabel nama barang yang dijual di toko
    private float harga; //variabel harga barang
    private int jumlah; //variable jumlah per barang di toko

    //constructor
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    //hasil harga dikali jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.nama;
    }
}


