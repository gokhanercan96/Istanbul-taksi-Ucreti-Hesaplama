import java.util.Scanner;

public class TaksimetreCalculator {
    public static void main(String[] args) {
        double perKm = 6.30d, start = 9.80d, total;
        int km;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taksi Ücretini Öğrenmek İstediğiniz Mesafe (km): ");
        km = inp.nextInt();

        total = (km * perKm)+ start;
        total = (total<28)? 28 : total;
        System.out.print("Ödemeniz Gereken Ücret (Tl):" + total);
    }
}
