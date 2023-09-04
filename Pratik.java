import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
    double tutar;
    Scanner input = new Scanner(System.in);
    System.out.println("Ücret Giriniz: ");
    tutar = input.nextDouble();

    double kdvOran = (tutar <= 1000) ? 0.18 : 0.08;
    double kdvTutar = tutar * kdvOran;
    double Kdvfiyati = tutar + kdvTutar;
    System.out.println(kdvOran);
    System.out.println(Kdvfiyati);

    }

}
