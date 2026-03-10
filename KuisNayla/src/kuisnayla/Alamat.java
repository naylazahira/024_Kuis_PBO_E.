/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisnayla;

/**
 *
 * @author Lab Informatika
 */
public class Alamat {
        private String jalan;
        private String kota;
        private String kodePos;
        
        public Alamat(String jalan, String kota, String kodePos){
            this.kodePos = kodePos;
            this.jalan = jalan;
            this.kota = kota;
        }
        
        public String getInfoAlamat(){
            return kodePos + " " + jalan + " " + " - Kota:  " + kota; 
        }
    }

