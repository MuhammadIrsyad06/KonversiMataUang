/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matauang.praktek;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
@ResponseBody
public class ProjectController {
    LogicalProcess matauang = new LogicalProcess(); 
    @RequestMapping("/euro_rupiah") 
    public String tampilEURtoIDR(){ 
        
        double idr = matauang.getEURIDR(10); 
        
        String view = "Hasil konversi 20 EUR ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
        
    @RequestMapping("/dolars_rupiah") 
    public String tampilSGDtoIDR(){ 
        
        double idr = matauang.getSGDIDR(20); 
        
        String view = "Hasil konversi 20 SGD ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
    
    @RequestMapping("/dolara_rupiah") 
    public String tampilUSDtoIDR(){ 
        
        double idr = matauang.getUSDIDR(20); 
        
        String view = "Hasil konversi 20 USD ke IDR = " + idr + " Rupiah"; 
        
        return view; 
    }
    
    @RequestMapping("/riyal_rupiah")
    public String tampilSARtoIDR(){ 
        
        double idr = matauang.getSARIDR(20); 
        String view = "Hasil konversi 20 SAR ke IDR = " + idr + " Rupiah."; 
        
        return view; 
    }
    @RequestMapping("/konversi") 
    public String konversiMataUang(){ 
        String tampilkan;
        tampilkan = matauang.konversiUang();
        
        return tampilkan;
    }
}
