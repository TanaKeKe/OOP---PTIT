import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong> {
    private String infor;
    private String kh;

    public String getMa() {
        return ma;
    }

    private String ma;
    private String phi;
    private String dongia;

    public LoaiPhong(String infor) {
        this.infor = infor;
        Input();
    }

    private void Input() {
        String[] nameString = infor.split("\\s+");
        kh = nameString[0];
        ma = nameString[1];
        dongia = nameString[2];
        phi = nameString[3];
    }

    @Override
    public String toString() {
        return kh + " " + ma + " " + dongia + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        if (ma.compareTo(o.getMa()) > 0) return 1;
        return -1;
    }
}