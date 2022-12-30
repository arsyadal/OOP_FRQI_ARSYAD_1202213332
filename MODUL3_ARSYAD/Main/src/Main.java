import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Calculation calculation = new Calculation();
    Scanner scanner = new Scanner(System.in);

    do {
      try {
        System.out.println("Menu:");
        System.out.println("1. Hitung luas persegi");
        System.out.println("2. Hitung luas lingkaran");
        System.out.println("3. Hitung luas trapesium");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int menu = scanner.nextInt();

        switch (menu) {
          case 1:
            System.out.print("Masukkan sisi persegi: ");
            double side = scanner.nextDouble();
            calculation.setSquare(side);
            System.out.println("Luas persegi: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("Masukkan jari-jari lingkaran: ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            System.out.println("Luas lingkaran: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("Masukkan sisi atas trapesium: ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan sisi bawah trapesium: ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            System.out.println("Luas trapesium: " + calculation.getTrapezoid());
            break;
          case 4:
            repeat = false;
            break;
          default:
            System.out.println("Menu tidak valid.");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Input tidak valid.");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);
  }
}