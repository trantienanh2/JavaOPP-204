package BTjava.Lap2;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        double num1, num2, sum, difference, product, quotient, remainder;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so thu nhat: ");
        num1 = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        num2 = sc.nextDouble();

        sum = num1 + num2;
        difference = num1 - num2;
        product= num1 * num2;
        quotient  = num1 / num2;
        remainder = num1  % num2;
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Chia lay du: " + remainder);
        
        System.out.println("So sanh " + num1 + "va" + num2 + ":");
        System.out.println(num1 + "lon hon" + num2 + ":" + (num1 > num2));
        System.out.println(num1 + "nho hon" + num2 + ":" + (num1 < num2));
        System.out.println(num1 + "bang" + num2 + ":" + (num1 = num2));
    
        sc.close();
    }
}
