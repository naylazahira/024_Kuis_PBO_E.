/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisnayla;

/**
 *
 * @author Lab Informatika
 */
public class LayananInstan extends Pengiriman implements LayananPremium{
    
    public LayananInstan(String resi, Alamat alamat, double beratPaket) throws DataTidakValidException {
        super(resi, alamat, beratPaket);
    }
    
    @Override
    public double hitungHarga(){
        return  getBeratPaket() * 30000;
    }
    
    @Override
    public String getEstimasiWaktu(){
        return "1 Hari Sampai.";
    }
}
