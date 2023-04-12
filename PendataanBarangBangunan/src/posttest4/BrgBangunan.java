
package posttest4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BrgBangunan extends TokoBangunan {
    private final String kodeBrg = "Brg";
    private long noKodeBrg;
    
    BrgBangunan(String namaBrg, String satuan, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeBrg){
        super(namaBrg,satuan,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeBrg);
    }
    
    
    BrgBangunan() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    BrgBangunan Brg;
    ArrayList<TokoBangunan> BrgList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    
    
    @Override
    public void tambahBarang () {
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH BARANG BANGUNAN             |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Barang Bangunan : ");
        namaBrg = inp.nextLine();
        System.out.print("Satuan : ");
        satuan = inp.nextLine();
        System.out.print("Stok Awal  : ");
        String strstokAwal=inp.nextLine();
        System.out.print("Stok Masuk  : ");
        String strstokMasuk=inp.nextLine();
        System.out.print("Stok Keluar  : ");
        String strstokKeluar=inp.nextLine();
        
        
        while(ulang){
            System.out.print("Harga Beli Barang [Satuan] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Barang [Satuan] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    stokAwal = (Integer.parseInt(strstokAwal));
                    stokMasuk = (Integer.parseInt(strstokMasuk));
                    stokKeluar = (Integer.parseInt(strstokKeluar));
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeBrg++;
                    System.out.println("No Kode Barang : " + kodeBrg + noKodeBrg);
                    Brg = new BrgBangunan(namaBrg, satuan, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeBrg); // OBJEK ke - 1
                    BrgList.add(Brg);
                    System.out.println("\n>> Tambah Data Barang Bangunan Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    @Override
    public void tampilBarang(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL BARANG BANGUNAN             |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<BrgList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Barang : " + kodeBrg + BrgList.get(i).getNoKodeBrg());
            System.out.println("\tNama Barang : " + BrgList.get(i).getNamaBrg());
            System.out.println("\tJenis Satuan : " + BrgList.get(i).getSatuan());
            System.out.println("\tStok Awal : " + BrgList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + BrgList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + BrgList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (BrgList.get(i).getStokAwal()+BrgList.get(i).getStokMasuk()-BrgList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Barang [Satuan] : Rp" + BrgList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Barang [Satuan] : Rp" + BrgList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    @Override
    public ArrayList<TokoBangunan> ubahBarang(ArrayList<TokoBangunan> Brglist)  {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               UBAH BARANG BANGUNAN               |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<BrgList.size(); i++){
            System.out.println("No Kode Barang : " + kodeBrg +
            BrgList.get(i).getNoKodeBrg());
            System.out.println("Nama Barang : " + BrgList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        if (BrgList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Barang : ");
        BrgList.get(ubah).namaBrg = (inp.nextLine());
        System.out.print("Ubah Jenis Satuan : ");
        BrgList.get(ubah).satuan = (inp.nextLine());
        System.out.print("Ubah Stok Awal : ");
        BrgList.get(ubah).stokAwal = (inp.nextInt());
        System.out.print("Ubah Stok Masuk : ");
        BrgList.get(ubah).stokMasuk = (inp.nextInt());
        System.out.print("Ubah Stok Keluar : ");
        BrgList.get(ubah).stokKeluar = (inp.nextInt());
        System.out.print("Ubah Harga Beli Barang [Satuan] : ");
        BrgList.get(ubah).hargaBeli= (inp.nextInt());
        System.out.print("Ubah Harga Jual Barang [Satuan] : ");
        BrgList.get(ubah).hargaJual = (inp.nextInt());
        System.out.println("\n>> Data Barang Bangunan Berhasil Di Ubah <<\n");

        
        return BrgList;
    }
    
    @Override
    public ArrayList<TokoBangunan> hapusBarang(ArrayList<TokoBangunan> Brglist) {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS BARANG BANGUNAN              |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<BrgList.size(); i++){
            System.out.println("No Kode Barang : " + kodeBrg +
            BrgList.get(i).getNoKodeBrg());
            System.out.println("Nama Barang : " + BrgList.get(i).getNamaBrg());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Barang [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        BrgList.remove(hapus);
        System.out.println("\n>> Data Barang Bangunan Berhasil di Hapus <<\n");
        return BrgList;
    }

}
