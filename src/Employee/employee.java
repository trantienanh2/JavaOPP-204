package Employee;

import java.util.Scanner;

public class employee extends person {
    public String EmployeeID;
    public int Start;
    public int End;
    public float Luong;
    public float ThuNhap;
    public int SoNgayCong;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(String EmployeeID) {
        super.NhapThongTin();

    }

    public int NhapNgayBD() {
        System.out.println(" Ngay Bat dau lam :");
        do
            Start = sc.nextInt();
        while (Start < 0 && Start > 31);
        return Start;

    }

    public int NhapNgayKT() {
        System.out.println(" Ngay Ket thuc lam :");
        do
        End = sc.nextInt();
        while (End < 0 && End > 31);
        return End;
    }

    public int NgayCong() {
        if (Start > End) {
            SoNgayCong = End + (31 - Start);
        } else if (Start < End) {
            SoNgayCong = End - Start;
        } else
            SoNgayCong = Start;
        return SoNgayCong;
    }

}
