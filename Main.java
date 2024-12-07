import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char simbol = '.';
        double hasil= 0;
        System.out.println("\n    KALKULATOR");
        // input bilangan 
        
        System.out.print("num = ");
        double bil1 = scan.nextDouble();
        System.out.print("Penghitungan ('+' '-' '*' ':') = ");
        simbol = scan.next().charAt(0);
        System.out.print("num = ");
        double bil2 = scan.nextDouble();
        
        switch (simbol) {
                case '+':
                hasil = bil1 + bil2;
                    System.out.println(bil1 + " + " + bil2 + " = " + hasil);
                    break;
                case '-':
                    System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
                    break;
                case '*':
                    System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
                break;
                case ':':
                    System.out.println(bil1 + " : " + bil2 + " = " + (bil1 / bil2));
                break;   
                default:
                    System.out.println("SIMBOL PERHITUNGAN ARITMATIKA SALAH! // pilih antara ('+' '-' '*' ':')");
                break;
            }
            aritmatic(bil1, bil2, simbol, scan, hasil);
        }
        
        static void aritmatic(double bil1, double bil2, char simbol, Scanner scan, double hasil) {
            while (true) {
            System.out.print("Penghitungan ('+' '-' '*' ':') = ");
            simbol = scan.next().charAt(0);
            System.out.print("num = ");
            double bil = scan.nextDouble();
            switch (simbol) {
                case '+':
                    System.out.println(hasil + bil);
                    break;
                case '-':
                    System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
                    break;
                case '*':
                    System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
                    break;
                case ':':
                    System.out.println(bil1 + " : " + bil2 + " = " + (bil1 / bil2));
                    break;   
                default:
                    System.out.println("SIMBOL PERHITUNGAN ARITMATIKA SALAH! // pilih antara ('+' '-' '*' ':')");
                    break;
                    }
                }
        }
}