
package posttest6;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class MenuUtamaProgram {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static BrgBangunan Brg = new BrgBangunan();//OBJEK
    static ArrayList<TokoBangunan> BrgList;//ARRAYLIST
    static TokoKramik TK = new TokoKramik();//OBJEK
    static ArrayList<TokoBangunan> TKList;//ARRAYLIST
    
    public static void menu (boolean getAdmin ) throws IOException{
        Boolean ulang,ulang2;
        ulang = getAdmin;
        while (ulang) {
            menuPertama();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Brg.tambahBarang();
                            break;
                        case "2":
                            Brg.tampilBarang();
                            
                            break;
                        case "3":
                            Brg.ubahBarang(BrgList);
                            break;
                        case "4":
                            Brg.hapusBarang(BrgList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                ulang2=true;
                while(ulang2){
                menuKetiga();
                    switch (admin){
                        case "1":
                            TK.tambahBarang();
                            break;
                        case "2":
                            TK.tampilBarang();
                            break;
                        case "3":
                            TK.ubahBarang(TKList);
                            break;
                        case "4":
                            TK.hapusBarang(TKList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t| PROGRAM PENDATAAN BARANG BANGUNAN JAYA MATERIAL  |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA BARANG            |");
        System.out.println("\t|                 2. TAMPIL DATA BARANG            |");
        System.out.println("\t|                 3. UBAH DATA BARANG              |");
        System.out.println("\t|                 4. DELETE DATA BARANG            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
     public static String menuKetiga (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t| PROGRAM PENDATAAN BARANG BANGUNAN JAYA MATERIAL  |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  TOKO KRAMIK                     |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA KRAMIK            |");
        System.out.println("\t|                 2. TAMPIL DATA KRAMIK            |");
        System.out.println("\t|                 3. UBAH DATA KRAMIK              |");
        System.out.println("\t|                 4. DELETE DATA KRAMIK            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuPertama (){
      System.out.println();
      System.out.println("\t|==================================================|");
      System.out.println("\t| PROGRAM PENDATAAN BARANG BANGUNAN JAYA MATERIAL  |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                PILIH MENU                        |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                                                  |");
      System.out.println("\t|           1. TOKO BARANG BANGUNAN                |");
      System.out.println("\t|           2. TOKO KERAMIK                        |");
      System.out.println("\t|           3. EXIT PROGRAM                        |");
      System.out.println("\t|==================================================|");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
        Scanner inp = new Scanner(System.in);
        admin User = new admin(); 
        User.admin();
        System.out.println("|==================================================================|");
        System.out.println("|    SELAMAT DATANG DI APLIKASI PENDATAAN BARANG BANGUNAN JAYA     |");
        System.out.println("|==================================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|          SILAHKAN LOGIN TERLEBIH DAHULU          |");
        System.out.println("\t|==================================================|");
        System.out.print("\t Username : ");
        String uname = input.nextLine();
        System.out.print("\t Password : ");
        String pass = input.nextLine();
        System.out.println("\t|==================================================|");
        boolean admin;

        while(!uname.equals(User.getUsername()) || !pass.equals(User.getPassword())){
            System.err.println("Username atau Password anda salah ");
            System.err.print("\nUsername :");
            uname = input.nextLine();
            System.err.print("\nPassword : ");
            pass = input.nextLine();
        }
        
       admin = true;
       
       menu(admin);
    }
}
