package Baitapthuchanhjava;

import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao 1 so ");
    int ngay=sc.nextInt();
    switch(ngay){
    case 0:System.out.println("Chu nhat");
            break;
    case 1:System.out.println("Thu hai");
            break;
    case 2:System.out.println("Thu ba");
            break;
    case 3:System.out.println("Thu tu");
            break;
    case 4:System.out.println("Thu nam");
            break;
    case 5:System.out.println("Thu sau");
            break;
    case 6:System.out.println("Thu bay");
            break;
    default:System.out.println("So ngay trong tuan sai");
      
    }
    sc.close();
}
}
