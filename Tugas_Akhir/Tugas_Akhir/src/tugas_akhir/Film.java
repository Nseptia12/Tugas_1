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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import java.util.Scanner;
public class Film {
    static ArrayList listFilm = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    public static void MenuFilm() throws IOException{
        System.out.println("========= MENU ========");
        System.out.println("[1] Tampilkan Film");
        System.out.println("[2] Tambah Film");
        System.out.println("[3] Ubah Film");
        System.out.println("[4] Hapus Film");
        System.out.println("[5] Keluar");
        System.out.print("Pilihan [1/2/3/4/5] =  ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        switch(selectedMenu){
            case 1:
                TampilFilm();
                break;
            case 2:
                TambahFilm();
                break;
            case 3:
                UbahFilm();
                break;
            case 4:
                HapusFilm();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
         }

    static void TampilFilm(){
        File file = new File("film.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String barisData;
            while((barisData = br.readLine())!=null){
                System.out.println(barisData);
            }
        }catch(FileNotFoundException ex1){
            System.out.println("File tidak ditemukan"+ file.toString());
        }catch(Exception ex2){
            System.out.println("File Tidak dapat dibaca" + file.toString());
        }
        if(listFilm.isEmpty()){
           System.out.println("Belum ada data");
        } else {
            for(int i = 0; i < listFilm.size(); i++){
                System.out.println(String.format("[%d] %s",i, listFilm.get(i)));
            }
        }
    }
        
    static void TambahFilm() throws IOException{
        System.out.print("Nama Film: ");
        String namaFilm = input.readLine();
        listFilm.add(namaFilm);
    }
    
    static void UbahFilm() throws IOException{
        TampilFilm();
        System.out.print("Pilih nomor: ");
        int indexFilm = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        listFilm.set(indexFilm, namaBaru);
    }
    
    static void HapusFilm() throws IOException{
        TampilFilm();
        System.out.print("Pilih nomor: ");
        int indexFilm = Integer.valueOf(input.readLine());
        listFilm.remove(indexFilm);
    }
    
    public static void main(String[] args) throws IOException {
        do {
            MenuFilm();
        } while (isRunning);
        
    }

    

    
}
    

