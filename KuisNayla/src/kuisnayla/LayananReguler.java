/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisnayla;

/**
 *
 * @author Lab Informatika
 */
public class LayananReguler extends Pengiriman{
    
    public LayananReguler(String resi, Alamat alamat, double beratPaket) throws DataTidakValidException {
        super(resi, alamat, beratPaket);
    }
    
    @Override
    public double hitungHarga(){
        return getBeratPaket() * 10000; //per kg 10k
    }
    
}
