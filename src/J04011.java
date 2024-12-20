import java.util.Scanner;

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

class Point3D {
    public int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int[] AB = {p1.x - p2.x, p1.y - p2.y, p1.z - p2.z};
        int[] AC = {p1.x - p3.x, p1.y - p3.y, p1.z - p3.z};
        int[] AD = {p1.x - p4.x, p1.y - p4.y, p1.z - p4.z};

        long det = (long) AB[0] * AC[1] * AD[2]
                + (long) AB[1] * AC[2] * AD[0]
                + (long) AB[2] * AC[0] * AD[1]
                - (long) AB[2] * AC[1] * AD[0]
                - (long) AB[1] * AC[0] * AD[2]
                - (long) AB[0] * AC[2] * AD[1];

        return det == 0;
    }
}
