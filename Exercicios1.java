/* import java.util.Scanner;
public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int soma = x + y;
        System.out.printf("SOMA = %d", soma);
    }
} */

/* import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = (a*b-c*d);
        System.out.printf("DIFERENCA = %d", diferenca);
    }
} */

/* import java.util.Locale;
import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        sc.close();
        double salary = (b*c);

        System.out.printf("Your number is: %d\n", a);
        Locale.setDefault(Locale.US);
        System.out.printf("Salary = U$ %.2f", salary);

    }
} */

/* import java.util.Locale;
import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double c2 = sc.nextDouble();
        double valueDebit = (b * c + b2 * c2);
        System.out.printf("Valor a pagar: R$ %.2f", valueDebit);
    }
} */

/* import java.util.Locale;
import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double pi = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        triangulo = (a*c)/2;
        circulo = pi*Math.pow(c,2);
        trapezio = ((a + b) * c)/2;
        quadrado = (b * 4);
        retangulo = (b*a);

        System.out.printf("Triangulo: %.3f\nCirculo: %.3f\nTrapezio: %.3f\nQuadrado: %.3f\nRetangulo: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);



    }
} */
