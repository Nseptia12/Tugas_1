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
public class Segitiga {
public void LuasSegitiga(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkn Alas = ");
    double f = input.nextDouble();
    System.out.print("Masukkn Tinggi = ");
    double g = input.nextDouble();
    double y = (f * g) / 2;
    System.out.println("====================================");
    System.out.println("");
    System.out.println("Luas Segitiga = " + y);
}
}
