/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuisnayla;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class KuisNayla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pengiriman[] daftaPengiriman = new Pengiriman[100];
        int jumlah = 0;
        int inputKe = 1;
        String lanjut = "y";
        
        System.out.println("=== KASIR PENGIRIMAN OOP ===");
        
        while(lanjut.equalsIgnoreCase("y") && jumlah < 100){
            System.out.println("Input Pengiriman ke- " + inputKe + "---");
            
            try {
                System.out.print("Input Resi (Awali dengan 'EXP')   :");
                String resi = sc.nextLine();
                System.out.println("Alamat pengiriman");
                System.out.print("Input nama jalan    :");
                String jalan = sc.nextLine();
                System.out.print("Input nama kota    :");
                String kota = sc.nextLine();
                System.out.print("Input kode POS     :");
                String kodePos = sc.nextLine();
                System.out.print("Berat paket (kg)   :");
                double beratPaket = Double.parseDouble(sc.nextLine());
                System.out.print("Layanan (1=Reguler, 2=VIP, 3=Instan)    :");
                int layanan = Integer.parseInt(sc.nextLine());
                Alamat alamat = new Alamat(jalan, kota, kodePos);
                Pengiriman pengiriman;
                
                if(layanan == 1){
                    pengiriman = new LayananReguler(resi, alamat, beratPaket);
                } else if (layanan == 2){
                    pengiriman = new LayananVIP(resi, alamat, beratPaket);
                } else if (layanan == 3){
                    pengiriman = new LayananInstan(resi, alamat, beratPaket);
                } else {
                    System.out.println("[error sistem] layanan tidak valid");
                    System.out.print("Cetak resi lain? (y/n)  :");
                    lanjut = sc.nextLine();
                    continue;
                }                                                                                                                 
                
                daftaPengiriman[jumlah++] = pengiriman;
                inputKe++;
                System.out.println("[info] resi berhasil di terbitkan");   
            } catch(InputMismatchException e) {
                System.out.println("[error] Input berat harus berupa angka");
            } catch (DataTidakValidException e){
                System.out.println("[ditolak] " + e.getMessage());
            }
            
            System.out.println("Cetak resi lain? (y/n)  :");
            lanjut = sc.nextLine();
        }
        
        System.out.println("=== REKAPITULASI RESI ===");
        if(jumlah == 0){
            System.out.println("Belum ada resi yang diterbitkan.");
        } else {
            for(int i = 0; i < jumlah; i++){
                Pengiriman p = daftaPengiriman[i];
                System.out.println("Resi Paket  :" + p.getResi());
                System.out.println("Alamat Tujuan :" + p.getInfoAlamat());
                System.out.println("Total Biaya   :" + p.hitungHarga());
                
                if(p instanceof LayananPremium){
                    System.out.println("Estimasi Pengiriman :" + ((LayananPremium)p).getEstimasiWaktu());
                } 
                System.out.println("------------------------");
            }
        }
        System.out.println("sesi kasir diakhiri.."); 
        sc.close();
    }
    
}

