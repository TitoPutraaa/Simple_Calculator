import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char simbol = '.';
        System.out.println("\n    KALKULATOR");
        // input bilangan 
        
        System.out.print("num = ");
        double bil1 = scan.nextDouble();
        System.out.print("Penghitungan ('+' '-' '*' ':') = ");
        simbol = scan.next().charAt(0);
        System.out.print("num = ");
        double bil2 = scan.nextDouble(); 

        double hasil = hitung(simbol, bil1, bil2);
        System.out.println(hasil);
        while (true) {
            double nextHasil =  aritmatic(bil1, bil2, simbol, scan, hasil);
            System.out.println(nextHasil);
            double lopHitung = aritmatic(bil1, bil2, simbol, scan, nextHasil);
        }
    }
        
        static double hitung(char simbol, double bil1 ,double bil2) {
        switch (simbol) {
                case '+':
                    return bil1 + bil2;
                case '-':
                    return bil1 - bil2;          
                case '*':
                    return bil1 * bil2;          
                case ':':
                    return bil1 / bil2;                
                default:
                    return 0;          

            }
        }
        
        static double aritmatic(double bil1, double bil2, char simbol, Scanner scan, double hasil) {
            System.out.print("Penghitungan ('+' '-' '*' ':') = ");
            simbol = scan.next().charAt(0);
            System.out.print("num = ");
            double bil = scan.nextDouble();
                switch (simbol) {
                    case '+':
                        return hasil + bil;
                    case '-':
                        return hasil - bil;
                    case '*':
                        return hasil * bil;
                    case ':':
                        return hasil / bil;   
                    default:
                        return 0;
                }
        }
}