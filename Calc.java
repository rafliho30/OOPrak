import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama a = ");
        double a = Input.nextDouble();
        System.out.print("Masukkan nilai kedua b = ");
        double b = Input.nextDouble();

        System.out.println("Hasil penjumlahan variabel a dan b adalah" + (a + b));
        System.out.println("Hasil pengurangan variabel a dan b adalah" + (a - b));
        System.out.println("Hasil perkalian variabel a dan b adalah" + (a * b));
        System.out.println("Hasil pembagian variabel a dan b adalah" + (a / b));
    }
}
