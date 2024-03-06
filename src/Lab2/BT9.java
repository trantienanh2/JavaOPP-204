package BTjava.Lap2;


import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int demInHoa = 0, demThuong = 0, demSo = 0, i;
        System.out.print("Nhap vao 1 chuoi bat ky: ");
        chuoi = sc.nextLine();
        for (i = 0; i < chuoi.length(); i++) {
            char kytu = chuoi.charAt(i);
            int asciiValue = (int) kytu;
            if (asciiValue >= 48 && asciiValue <= 57)
                demSo = demSo + 1;
            else if (asciiValue >= 65 && asciiValue <= 90)
                demInHoa = demInHoa + 1;
            else if (asciiValue >= 97 && asciiValue <= 122)
                demThuong = demThuong + 1;
        }
        System.out.println("Co "+demThuong+" ky tu thuong, "+demInHoa+" ky tu in hoa va "+demSo+" ky tu so");
    }
}