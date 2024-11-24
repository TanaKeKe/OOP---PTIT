import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien5031> arr = new ArrayList<>();
        while (test-- > 0) {
            SinhVien5031 sv = new SinhVien5031(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(sv);
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(String.valueOf(i + 1) + " " + arr.get(i).toString());
        }
    }
}

class SinhVien5031 implements Comparable<SinhVien5031> {
    public String msv;
    public String ten;
    public String lop;
    public double diem1;
    public double diem2;
    public double diem3;

    public SinhVien5031(String msv, String ten, String lop, double diem1, double diem2, double diem3) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public int compareTo(SinhVien5031 o) {
        if (o.ten.compareTo(ten) > 0) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + String.format("%.1f %.1f %.1f", diem1, diem2, diem3);
    }
}