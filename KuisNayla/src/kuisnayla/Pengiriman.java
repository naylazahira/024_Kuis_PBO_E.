/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisnayla;

/**
 *
 * @author Lab Informatika
 */
public abstract class Pengiriman {
    private String resi;
    private double beratPaket;
    private Alamat alamat;
    
    public Pengiriman(String resi, Alamat alamat, double beratPaket) throws DataTidakValidException{
        if (beratPaket <= 0){
            throw new DataTidakValidException("Berat Paket harus > 0.");
        }
        if (!resi.startsWith("EXP")){
            throw new DataTidakValidException("Nomor Resi harus diawali 'EXP'");
        }
        
        this.resi = resi;
        this.alamat = alamat;
        this.beratPaket = beratPaket;
    }
    
    public String getResi(){
        return resi;
    }
    public Alamat getInfoAlamat(){
        return alamat;
    }
    public double getBeratPaket(){
        return beratPaket;
    }
    public abstract double hitungHarga();
}
