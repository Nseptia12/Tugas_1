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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sutradara {
    static ArrayList listSutradara = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    public static void MenuSutradara() throws IOException{
        System.out.println("========= MENU ========");
        System.out.println("[1] Tampilkan Sutradara");
        System.out.println("[2] Tambah Sutradara");
        System.out.println("[3] Ubah Sutradara");
        System.out.println("[4] Hapus Sutradara");
        System.out.println("[5] Keluar");
        System.out.print("Pilihan [1/2/3/4/5] =  ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                TampilSutradara();
                break;
            case 2:
                TambahSutradara();
                break;
            case 3:
                UbahSutradara();
                break;
            case 4:
                HapusSutradara();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
         }
   
    
    static void TampilSutradara() {
        File file = new File("sutradara.txt");
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
        if(listSutradara.isEmpty()){
           System.out.println("Belum ada data");
        } else {
            for(int i = 0; i < listSutradara.size(); i++){
                System.out.println(i+1+"."+listSutradara.get(i));
            }
        }
    }   
    
    static void TambahSutradara() throws IOException{
        System.out.print("Nama Sutradara: ");
        String namaSutradara = input.readLine();
        listSutradara.add(namaSutradara);
    }
    
    static void UbahSutradara() throws IOException{
        TampilSutradara();
        System.out.print("Pilih nomer: ");
        int indexSutradara = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        listSutradara.set(indexSutradara, namaBaru);
    }
    
    static void HapusSutradara() throws IOException{
        TampilSutradara();
        System.out.print("Pilih nomor: ");
        int indexSutradara = Integer.valueOf(input.readLine());
        listSutradara.remove(indexSutradara);
    }
    
    public static void main(String[] args) throws IOException {
        do {
            MenuSutradara();
        } while (isRunning);      
    }

    }

    

    