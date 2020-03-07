/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pbo;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Tugas_PBO {

    public static void main(String[] args) {
       String ulg = "y";
       while (ulg.equals("y"))
       {
       System.out.println(" ");
       Scanner input = new Scanner(System.in);
       String ul="",lagi;
       System.out.println("*************** SELAMAT DATANG ***************");
       System.out.println(" ");
       System.out.println("                  MENU UTAMA                  ");
       System.out.println("1. Luas Persegi Panjang");
       System.out.println("2. Luas Lingkaran");
       System.out.println("3. Luas Segitiga");
       System.out.println("4. Keluar");
       System.out.println("==============================================");
       System.out.print("Pilihan [1/2/3/4] = ");
       int pilih = input.nextInt();
       System.out.println("==============================================");
       
       switch (pilih) {
           case 1:{
               PersegiPanjang p=new PersegiPanjang();
               p.pp();
               break;
           }
           case 2:{
               Lingkaran q=new Lingkaran();
               q.LuasLingkaran();
               break;
           }
           case 3:{
               Segitiga r=new Segitiga();
               r.LuasSegitiga();
               break;
           }
           case 4:{
               System.exit(0);
               System.out.println("Warning !! Pilihan tidak tersedia !!");
           }
           break;
       }
       System.out.println("=========================================");
       System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
       }
    }
    
}
