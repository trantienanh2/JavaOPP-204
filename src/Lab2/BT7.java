package BTjava.Lap2;

public class BT7 {
    public static void main(String[] args) {
        int i;
        String str ="";
        for(i=1; i<= 20; i++)
            str = str + i + "; ";
            System.out.print("20 so nguyen duong dau tien la: " +str.substring(0, str.length()-2));
    }
}
