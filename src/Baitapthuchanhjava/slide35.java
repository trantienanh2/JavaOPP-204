package Baitapthuchanhjava;

import java.util.Scanner;

public class slide35 {
public static void main(String[] args) {
    int firstNumber, secondNumber;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vào so thu nhat: ");
    firstNumber = sc.nextInt();
    System.out.println("Nhap vao so thu hai: ");
     secondNumber = sc.nextInt();
    int minNumber = firstNumber;
    if (firstNumber > secondNumber) 
          minNumber = secondNumber;
      System.out.println("So nho nhat trong 2 so " + firstNumber + " va "+ secondNumber+ " la " + minNumber);
      sc.close();

}
}