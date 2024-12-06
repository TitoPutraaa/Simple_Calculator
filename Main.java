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
            
            for (;; ) { // coba belajar do while
                
                switch (simbol) {
                    case '+':
                        System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
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
            
            simbol = scan.next().charAt(0);
            double bil3 = scan.nextDouble();
        }
    }
}