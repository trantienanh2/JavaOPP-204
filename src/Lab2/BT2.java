package BTjava.Lap2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args){
        double num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hay nhap mot so: ");
        num = sc.nextDouble();

        if(num % 2 == 0){
            System.out.println("Day la so chan");
        } else{
            System.out.println("Day la so le");
        }
        sc.close();
    }
}
