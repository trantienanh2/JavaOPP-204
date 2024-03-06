package Baitapthuchanhjava;

import java.util.Scanner;


public class HinhTron {
    
        float BanKinh;
        float ChuVi;
        float DienTich;
        final float PI = 3.14f;

        public void nhapBanKinh() {
        System.out.println("Nhap vao R: ");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextFloat();
        
        }
        
        public void tinhChuVI() {
        ChuVi = 2 * PI * BanKinh;
        }

        public void tinhDienTich() {
        DienTich = PI * BanKinh *BanKinh;
        }

        public void inChuVI() {
        System.out.println("ChuVi bang = " + ChuVi);
        }

        public void inDienTich() {
        System.out.println("DienTich bang = " + DienTich);
        }

}