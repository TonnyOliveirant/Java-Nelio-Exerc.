/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if (x >= 0){
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }
} */


/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if (x % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
}*/


/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        if ((x % y == 0) || (y % x == 0)){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
    }
} */

/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.printf("Valores de Entrada (horários): ");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        if (x >= y){
            int soma;
            soma = 24 - x + y;
            System.out.printf("O JOGO DUROU %d HORA(S)", soma);
        }
        else{
            int soma;
            soma = y - x;
            System.out.printf("O JOGO DUROU %d HORA(S)", soma);
        }
    }
} */


/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, itemQty;
        double objectPrice = 0, totalDebit;
        x = sc.nextInt();
        itemQty = sc.nextInt();
        sc.close();
        if (x == 1){
            objectPrice = 4.00;
        }
        else if (x == 2){
            objectPrice = 4.50;
        }
        else if (x == 3){
            objectPrice = 5.00;
        }
        else if (x == 4){
            objectPrice = 2.00;
        }
        else if (x == 5){
            objectPrice = 1.50;
        }
        else{
            System.out.printf("Please, Select a item from the menu.");
        }
        totalDebit = objectPrice *itemQty;
        System.out.printf("Total: R$ %.2f", totalDebit);
    }
} */

/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double x;
        x = sc.nextDouble();
        sc.close();
        if ((x <= 25) && (x > 0)) {
            System.out.printf("Intervalo (0,25]");
        }
        else if ((x <= 50) && (x > 25)) {
            System.out.printf("Intervalo (25,50]");
        }
        else if ((x <= 75) && (x > 50)) {
           System.out.printf("Intervalo (50,75]");
        }
        else if ((x <= 100) && (x > 75)) {
           System.out.printf("Intervalo (75,100]");
        }
        else{
            System.out.printf("Fora do intervalo");
        }
    }
} */
