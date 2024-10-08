import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arrayList = (ArrayList<String>) oi.readObject();
        HashSet<String> hs = new HashSet<>();

        for (String s : arrayList) {
            String[] nameString = s.trim().split("\\s+");
            for (String string : nameString) {
                String tmp = string.toLowerCase();
                hs.add(tmp);
            }
        }

        TreeSet<String> result = new TreeSet<>();
        ArrayList<String> res = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String currentString = scanner.nextLine();
            String[] name = currentString.trim().split("\\s+");
            for (String string : name) {
                String tmp = string.toLowerCase();
                res.add(tmp);
            }
        }

        for (String string : res) {
            if (!result.contains(string) && hs.contains(string)) {
                System.out.println(string);
                result.add(string);
            }
        }
    }
}
