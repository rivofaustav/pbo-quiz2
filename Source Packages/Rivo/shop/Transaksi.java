
package Rivo.shop;

import java.util.*;

/**
 *
 * @author Rivo
 */

public class Transaksi {
    private final String code; //variabel code
    private ArrayList<Item> items = new ArrayList<>();//variabel item
    private float total;//variabel total

    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    public void setTotal(){//setter total
        float total = 0;
        for (Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    
    public String print(){//print nota output
        setTotal();
        String str = "";
        str += "Kode \t\t: " +this.code+"\n";
        str += "Daftar Belanja : \n";
        for(Item item : this.items){
            str += "\t" + item.getNama() + "(x" + item.getJumlah()+") : " + item.getTotal() + "\n";
        }
        str += "TOTAL HARGA \t: " + this.total;
        return str;
    }
    
}
