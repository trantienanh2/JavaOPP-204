package BTjava.Lap2;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args){
        double nam, tuoi;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Hay nhap ten: ");
        String yourName = sc.nextLine();
        System.out.print("Hay nhap nam: ");
        nam = sc.nextDouble();

        tuoi = 2024 - nam;

        if(tuoi < 16){
            System.out.println("Ban " + yourName + " o do tuoi vi thanh nien");
        } else if(tuoi >= 16 && tuoi <18){
             System.out.println("Ban " + yourName + " o do tuoi truong thanh");
        } else if(tuoi >= 18){
            System.out.println("Ban " + yourName + " da gia");
        }
        sc.close();

    }
}