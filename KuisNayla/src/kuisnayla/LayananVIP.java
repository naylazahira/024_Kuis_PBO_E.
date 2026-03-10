/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisnayla;

/**
 *
 * @author Lab Informatika
 */
public class LayananVIP extends Pengiriman implements LayananPremium{
    
    public LayananVIP(String resi, Alamat alamat, double beratPaket) throws DataTidakValidException {
        super(resi, alamat, beratPaket);
    }
    
    @Override
    public double hitungHarga(){
        return  getBeratPaket() * 20000;
    }
    
    @Override
    public String getEstimasiWaktu(){
        return "3 Hari Sampai.";
    }
    
}
