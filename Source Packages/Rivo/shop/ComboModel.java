
package Rivo.shop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rivo
 */
public class ComboModel {
    private HashMap<String,Float> items = new HashMap<>();

    public ComboModel() {
        this.items.put("Kopi", new Float(10000));//item item toko
        this.items.put("Gula", new Float(15000));
        this.items.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getNames(){
        ArrayList<String> str = new ArrayList<>();
        for(String item : this.items.keySet()){
            str.add(item);
        }
        return str;
    }
    
    public ArrayList<Float> getPrices(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String name, float price ){
        this.items.put(name, price);
    }
    
}
