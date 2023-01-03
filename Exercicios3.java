/* import java.util.Locale;
import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[]args){
        int x;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        x = sc.nextInt();
        while (x != 2002){
            System.out.printf("Senha Invalida\n");
            x = sc.nextInt();
        }
        sc.close();
        System.out.printf("Acesso Permitido");
    }
} */


/* import java.util.Scanner;

public class Exercicios03{
    public static void main(String[]args){
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        while ((x != 0) | (y != 0)){
            if ((x > 0) && (y > 0)) {
                System.out.printf("primeiro\n");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if ((x < 0) && (y > 0)) {
                System.out.printf("segundo\n");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if ((x < 0) && (y < 0)) {
                System.out.printf("terceiro\n");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else if ((x == 0) | (y ==0)){
                break;
            }
            else {
                System.out.printf("quarto\n");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
    sc.close();
    }
} */
