package Employee;

import java.util.Scanner;

public class person {
    public String Name;
    public String Birthday;
    public String Address;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" TEN:");
        Name = sc.nextLine();
        System.out.print(" NGAY SINH:");
        Birthday = sc.nextLine();
        System.out.print(" DIA CHI:");
        Address = sc.nextLine();
        sc.close();
    }
    public void InThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" TEN :" + Name);
        System.out.print(" NGAY SINH :" + Birthday);
        System.out.print(" DIA CHI :" + Address);
        sc.close();
    }
}

