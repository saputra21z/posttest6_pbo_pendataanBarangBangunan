
package Posttest3;

import static Posttest3.MenuUtamaProgram.TKList;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TokoKramik extends TokoBangunan {
    private final String kodeTK = "TK";
    private long noKodeTK;
    
    TokoKramik(String namaBrg, String satuan, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeBrg){
        super(namaBrg,satuan,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeBrg);
    }
    
    TokoKramik() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    TokoKramik TK;
    ArrayList<TokoKramik> TKList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    protected void tambahBarang () throws IOException{
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH DATA KERAMIK                |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Keramik : ");
        namaBrg = inp.nextLine();
        System.out.print("Satuan : ");
        satuan = inp.nextLine();
        System.out.print("Stok Awal  : ");
        stokAwal = Integer.parseInt(br.readLine());
        System.out.print("Stok Masuk  : ");
        stokMasuk = Integer.parseInt(br.readLine());
        System.out.print("Stok Keluar  : ");
        stokKeluar = Integer.parseInt(br.readLine());

        while(ulang){
            System.out.print("Harga Beli Keramik [Satuan] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Keramik [Satuan] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeBrg++;
                    System.out.println("No Kode Barang : " + kodeTK + noKodeTK);
                    TK = new TokoKramik(namaBrg, satuan, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeBrg); // OBJEK ke - 1
                    TKList.add(TK);
                    System.out.println("\n>> Tambah Data Keramik Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    protected void tampilBarang(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL DATA KERAMIK                |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Keramik : " + kodeTK + TKList.get(i).getNoKodeBrg());
            System.out.println("\tNama Keramik : " + TKList.get(i).getNamaBrg());
            System.out.println("\tJenis Satuan : " + TKList.get(i).getSatuan());
            System.out.println("\tStok Awal : " + TKList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + TKList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + TKList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (TKList.get(i).getStokAwal()+TKList.get(i).getStokMasuk()-TKList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Keramik [Satuan] : Rp" + TKList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Keramik [Satuan] : Rp" + TKList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    public ArrayList<TokoKramik> ubahBarang(ArrayList<TokoKramik> Brglist) throws IOException {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  UBAH DATA KERAMIK               |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("No Kode Barang : " + kodeTK +
            TKList.get(i).getNoKodeBrg());
            System.out.println("Nama KERAMIK : " + TKList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        if (TKList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Keramik : ");
//        TKList.get(ubah).namaBrg = (inp.nextLine());
        TKList.get(ubah).setNamaBrg(br.readLine());
        System.out.print("Ubah Jenis Satuan : ");
        TKList.get(ubah).setSatuan(br.readLine());
        System.out.print("Ubah Stok Awal : ");
        TKList.get(ubah).setStokAwal(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Stok Masuk : ");
        TKList.get(ubah).setStokMasuk(Integer.parseInt(br.readLine()));
         System.out.print("Ubah Stok Keluar : ");
        TKList.get(ubah).setStokKeluar(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Beli Keramik [Satuan] : ");
        TKList.get(ubah).setHargaBeli(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Jual Keramik [Satuan] : ");
        TKList.get(ubah).setHargaJual(Integer.parseInt(br.readLine()));
        System.out.println("\n>> Data Keramik Berhasil Di Ubah <<\n");

        return TKList;
    }
    
    public void hapusBarang() {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS DATA KERMIK                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TKList.size(); i++){
            System.out.println("No Kode Keramik : " + kodeTK +
            TKList.get(i).getNoKodeBrg());
            System.out.println("Nama Keramik : " + TKList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Data Keramik [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        TKList.remove(hapus);
        System.out.println("\n>> Data Keramik Berhasil di Hapus <<\n");
    }

    
    
}
