package BTjava.Lap2;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so ");
        int thang=sc.nextInt();
        switch(thang){
        case 1:System.out.println("Thang mot");
                break;
        case 2:System.out.println("Thang hai");
                break;
        case 3:System.out.println("Thang ba");
                break;
        case 4:System.out.println("Thang tu");
                break;
        case 5:System.out.println("Thang nam");
                break;
        case 6:System.out.println("Thang sau");
                break;
        case 7:System.out.println("Thang bay");
                break;
        case 8:System.out.println("Thang tam");
                break;
        case 9:System.out.println("Thang chin");
                break;
        case 10:System.out.println("Thang muoi");
                break;
        case 11:System.out.println("Thang muoi mot");
                break;
        case 12:System.out.println("Thang muoi hai");
                break;
        default:System.out.println("So thang trong nam sai");
          
        }
        sc.close();
    }
}
