package BTjava.Lap2;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , SoNguyen, s = 0;
        System.out.print("Nhap so luong so nguyen: ");
        n = sc.nextInt();
        for( int i = 0; i < n; i++)
        {
            System.out.print("Nhap so thu " + (i+1) + " : ");
            SoNguyen = sc.nextInt();
            s = s + SoNguyen;
        }
        float tbc = (float) s/n;
        System.out.println("Trung binh cong cua cac so nguyen tren là: "+ tbc);
    }
}
