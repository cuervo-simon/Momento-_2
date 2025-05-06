import java.util.ArrayList;
import java.util.Scanner;

class Gasto {
    double monto;
    String categoria;

    Gasto(double monto, String categoria) {
        this.monto = monto;
        this.categoria = categoria;
    }

    public String toString() {
        return "Monto: $" + monto + ", Categoría: " + categoria;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gasto> gastos = new ArrayList<>();
        int opcion;

        System.out.println("Hola Mundo - Rastreador de Gastos");

        do {
            System.out.println("\n1. Agregar gasto");
            System.out.println("2. Ver gastos");
            System.out.println("3. Ver total gastado");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Monto: ");
                double monto = sc.nextDouble();
                sc.nextLine();
                System.out.print("Categoría: ");
                String cat = sc.nextLine();
                gastos.add(new Gasto(monto, cat));
            } else if (opcion == 2) {
                for (Gasto g : gastos) {
                    System.out.println(g);
                }
            } else if (opcion == 3) {
                double total = 0;
                for (Gasto g : gastos) total += g.monto;
                System.out.println("Total gastado: $" + total);
            }
        } while (opcion != 4);

        System.out.println("Adiós");
    }
}
