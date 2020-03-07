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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Aktor {
static ArrayList listAktor = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
 
   
    public static void MenuAktor() throws IOException{
        System.out.println("========= MENU ========");
        System.out.println("[1] Tampilkan Aktor");
        System.out.println("[2] Tambah Aktor");
        System.out.println("[3] Ubah Aktor");
        System.out.println("[4] Hapus Aktor");
        System.out.println("[5] Keluar");
        System.out.print("Pilihan [1/2/3/4/5] =  ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                TampilAktor();
                break;
            case 2:
                TambahAktor();
                break;
            case 3:
                UbahAktor();
                break;
            case 4:
                HapusAktor();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
         }

    static void TampilAktor(){
        File file = new File("actor.txt");
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
        if(listAktor.isEmpty()){
           System.out.println("Belum ada data");
        } else {
            for(int i = 0; i < listAktor.size(); i++){
                System.out.println(String.format("[%d] %s",i, listAktor.get(i)));
            }
        }
    }
    static void TambahAktor() throws IOException{
        System.out.print("Nama Film: ");
        String namaFilm = input.readLine();
    Object namaAktor = null;
        listAktor.add(namaAktor);
    }
    
    static void UbahAktor() throws IOException{
        TampilAktor();
        System.out.print("Pilih nomor: ");
        int indexAktor = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        listAktor.set(indexAktor, namaBaru);
    }
    
    static void HapusAktor() throws IOException{
        TampilAktor();
        System.out.print("Pilih nomor: ");
        int indexAktor = Integer.valueOf(input.readLine());
        listAktor.remove(indexAktor);
    }
    
    public static void main(String[] args) throws IOException {
        do {
            MenuAktor();
        } while (isRunning);
        
    } 
}
    


    
    

