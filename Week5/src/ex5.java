/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir satır sayısı giriniz:");
        int row = input.nextInt();
        System.out.println();
        System.out.print("Lütfen bir sütun sayısı giriniz:");
        int col = input.nextInt();
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
