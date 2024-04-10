package Employee;

import java.util.Scanner;

public class employeeFulltime extends employee {
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin() {
        super.NhapThongTin(EmployeeID);
    }

    public void NhapLuongFullTime() {
        System.out.println("Nhap Luong theo ngay:");
        Luong = sc.nextFloat();
    }

    public void TinhLuong() {
        ThuNhap = SoNgayCong * Luong;
    }

    public void InThongTin() {
        super.InThongTin();
        System.out.println(" Ma so nhan vien: " + EmployeeID);
        System.out.println(" Thu nhap: " + ThuNhap);
    }

}