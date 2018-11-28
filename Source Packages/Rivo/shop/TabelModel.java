
package Rivo.shop;

/**
 *
 * @author Rivo
 */
public class TabelModel {
    private String[] columns; //array string vatiabel untuk kolom nama

    public TabelModel() {//constructor
        this.columns = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    public String[] getColumnName(){//getter column
        return this.columns;
    }
    
}
