// KALKULATOR
// created by Tito.ptr
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char simbol = '.';
        System.out.println("\n    KALKULATOR");

        // input perhitungan pertama 
        System.out.print("num = ");
        double bil1 = scan.nextDouble();
        System.out.print("Penghitungan ('+' '-' '*' ':') = ");
        simbol = scan.next().charAt(0);
        System.out.print("num = ");
        double bil2 = scan.nextDouble(); 

        // call method to count first calculation 
        double hasil = hitung(simbol, bil1, bil2); // call mmethod to count first calculation and restore to 'hasil' variable
        aritmatic(bil1, bil2, simbol, scan, hasil); // call method to count 'hasil' and next calculation 

    }
        
    static double hitung(char simbol, double bil1 ,double bil2) { // method to count first calculation
        switch (simbol) {
            case '+':
                System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2) ); // to print result of the calculation
                    return bil1 + bil2; // return result calculation to method so next method can use this result 
            case '-':
                System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2) );
                    return bil1 - bil2;          
            case '*':
                System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2) );
                    return bil1 * bil2;          
            case ':':
            System.out.println(bil1 + " : " + bil2 + " = " + (bil1 / bil2) );
                    return bil1 / bil2;                
            default:
                    return 0;          

            }
        }
        
        static double aritmatic(double bil1, double bil2, char simbol, Scanner scan, double hasil) { // method to count result for previous method to next calculation
            double temp = hasil; // to keep hasil value
            System.out.print("Penghitungan ('+' '-' '*' ':') = "); // pick new calculaton
            simbol = scan.next().charAt(0); 
            System.out.print("num = "); // add new number and calculate with previous calculation
            double bil = scan.nextDouble();
                switch (simbol) {
                    case '+':
                        hasil += bil;
                        System.out.println(temp + " + " + bil + " = " + hasil);
                        return hasil + bil + aritmatic(bil1, bil2, simbol, scan, hasil); // to return result number and to looping the method so we can make new calculation with previos calculation 
                    case '-':
                        hasil -= bil;
                        System.out.println(temp + " - " + bil + " = " + hasil);
                        return hasil - bil + aritmatic(bil1, bil2, simbol, scan, hasil);
                    case '*':
                        hasil *= bil;
                        System.out.println(temp + " * " + bil + " = " + hasil);
                        return hasil *  bil + aritmatic(bil1, bil2, simbol, scan, hasil);
                    case ':':
                        hasil /= bil;
                        System.out.println(temp + " : " + bil + " = " + hasil);
                        return hasil / bil + aritmatic(bil1, bil2, simbol, scan, hasil);
                    default:
                        return 0;
                }
        }
}