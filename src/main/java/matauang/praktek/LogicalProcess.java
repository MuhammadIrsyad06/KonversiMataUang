/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matauang.praktek;

/**
 *
 * @author lenovo
 */
public class LogicalProcess {
      public double getEURIDR(double eur){ 
        
        
        double idr = eur*16177; 
        
        return idr; 
    }
    
    public double getSGDIDR(double sgd){
        
        double idr = sgd*10574;
        
        return idr;
    }
    
    public double getUSDIDR(double usd){ 
        
        double idr = usd*14337;
        
        return idr;
    }
    
    public double getSARIDR(double sar){
        
        double idr = sar*3807;
        
        return idr;
    }
    public String konversiUang(){
        double euridr = getEURIDR(20);
        double sgdidr = getSGDIDR(20);
        double usdidr = getUSDIDR(20);
        double saridr = getSARIDR(20);
        
        double tampilkaneuridr = euridr;
        String tampileuridr = Double.toString(tampilkaneuridr);
        double tampilkansgdidr = sgdidr;
        String tampilsgdidr = Double.toString(tampilkansgdidr);
        double tampilkanusdidr = usdidr;
        String tampilusdidr = Double.toString(tampilkanusdidr);
        double tampilkansaridr = saridr;
        String tampilsaridr = Double.toString(tampilkansaridr);
        
        String tampil;
        tampil = "Hasil konversi dari 20 Euro ke Rupiah = Rp" + tampileuridr + "<br>"
                + "Hasil konversi dari 20 Dollar Singapore ke Rupiah = Rp" + tampilsgdidr + "<br>"
                + "Hasil konversi dari 20 Dollar Amerika ke Rupiah = Rp" + tampilusdidr + "<br>"
                + "Hasil konversi dari 20 Saudi Riyal ke Rupiah = Rp" + tampilsaridr;
        return tampil;
    }
}
