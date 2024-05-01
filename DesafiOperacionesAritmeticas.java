import java.util.Scanner;

public class DesafiOperacionesAritmeticas {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double r1;
            do {
                System.out.print("Ingrese resistencia 1: ");
                r1 = sc.nextDouble();
            } while (r1 <= 0);

            double r2;
            do {
                System.out.print("Ingrese resistencia 2: ");
                r2 = sc.nextDouble();
            } while (r2 <= 0);

            double r3;
            do {
                System.out.print("Ingrese resistencia 3: ");
                r3 = sc.nextDouble();
            } while (r3 <= 0);

            //obtener resultado de resistencia
            double totalResistencia = 1 / (1/r1 + 1/r2 + 1/r3);

            System.out.printf("La resistencia total es de %.1f", totalResistencia);

        }
}
