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
public class PersegiPanjang {
public void pp(){
    Scanner input = new Scanner(System.in);
    System.out.println("    MENGHITUNG LUAS PERSEGI PANJANG     ");
    System.out.println("****************************************");
    System.out.print("Masukkn Panjang = ");
    int d = input.nextInt();
    System.out.print("Masukkn Lebar = ");
    int e = input.nextInt();
    int z = d*e;
    System.out.println("====================================");
    System.out.println("Luas Persegi Panjang = " + z);
}
}
