package Baitapthuchanhjava;

import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
         int n;
  Scanner sc = new Scanner(System.in);
    do {
     System.out.println("Nhap vào so phần tử của mảng: ");
     n = sc.nextInt();
    } while (n < 0);
  int A[] = new int[n];
  System.out.println("Nhập các phần tử cho mảng: ");
  for (int i = 0; i < n; i++) {
  System.out.print("Nhập phần tử thứ "+i + ": ");
  A[i] = sc.nextInt();
}

double Tong =0;
for (int i = 0; i < n; i++)
    if (A[i] % 2 == 0) {
        Tong+=A[i];
    }
 System.out.println("Tong: " + Tong);
 sc.close();
}

}

