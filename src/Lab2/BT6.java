package BTjava.Lap2;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n, A = 1;
            System.out.print("Nhap 1 so nguyen duong: ");
        do {
             n = sc.nextInt();
        } while (n < 0);
        for(int i = 1; i <= n; i++)
        {
            A = A*i;
        }
        System.out.print("Giai thua cua "+ n +" la: "+ A);
    }
}