import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee(scanner.nextLine(),Long.parseLong(scanner.nextLine()),Long.parseLong(scanner.nextLine()),scanner.nextLine());
        System.out.println("NV01" + " " + employee.getTen() + " " + String.valueOf(employee.getLuong() * employee.getNgay()) + " " + employee.getThuong() + " " + employee.getPc() + " " + String.valueOf(employee.getLuong() * employee.getNgay() + employee.getThuong() + employee.getPc()));

    }
}