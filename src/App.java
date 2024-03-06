import Baitapthuchanhjava.HinhTron;

public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();
    System.out.println("Nhap vao hinh tron so 1");
    ht1.nhapBanKinh();
    ht1.tinhChuVI();
    ht1.inChuVI();

    System.out.println("Nhap vao hinh tron so 2");
    ht2.nhapBanKinh();
    ht2.tinhDienTich();
    ht2.inDienTich();
    }
}
