package Baitapthuchanhjava;

import java.util.Scanner;

public class slide47 {
     public static void main(String[] args) {
    int number, sum = 0;
    Scanner sc = new Scanner(System.in);      
    do {
     System.out.println("Nhap vào so nguyen bat ky: ");
       number = sc.nextInt();
       sum += number;
   } while (sum < 100); 
     System.out.println("Tong cac so nguyen vua nhap = "+sum);
     sc.close();
    }
  
}
