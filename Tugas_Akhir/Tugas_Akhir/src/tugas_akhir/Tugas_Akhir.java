/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

/**
 *
 * @author User
 */

import java.io.IOException;
import java.util.Scanner;
public class Tugas_Akhir {
    public static void main(String[] args) throws IOException {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        
        System.out.println("*************** SELAMAT DATANG ***************");
        System.out.println(" ");
        System.out.println("                  MENU UTAMA                  ");
        System.out.println("1. Sutradara");
        System.out.println("2. Film");
        System.out.println("3. Aktor");
        System.out.println("4. Keluar");
        System.out.println("==============================================");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println("==============================================");
        
        switch(pilih) {
            case 1:{
                Sutradara s=new Sutradara();
                s.MenuSutradara();
                break;
            }
            case 2:{
                Film f = new Film();
                f.MenuFilm();
                break;
            }
            case 3:{
                Aktor a = new Aktor();
                a.MenuAktor();
                break;
            }
            case 4:{
                System.exit(0);
                System.out.println("Pilihan tidak tersedia!");
            }
            break;
        }
        System.out.println("=========================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        
        }
    }
}
