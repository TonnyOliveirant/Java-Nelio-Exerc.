/* import java.util.Locale;
import java.util.Scanner;


public class Exercicios4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;
        x = sc.nextInt();
        for (int k = 1;k < x; k++){
            if (k % 2 != 0){
                System.out.printf("%d\n", k);
            }
        }
        sc.close();
    }
} */

/* import java.util.Locale;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[]args_){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, numberValue, inQty, outQty;
        inQty = 0;
        outQty = 0;
        n = sc.nextInt();
        for (int x = 1; x <= n; x++){
            numberValue = sc.nextInt();
            if ((numberValue <= 20) && (numberValue >= 10)){
                inQty++;
            }
            else{
                outQty++;
            }
        }
    System.out.printf("%d in\n%d out", inQty, outQty);
    sc.close();
    }
} */

/* import java.util.Scanner;

public class Exercicios4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        double results;
        double realValue1, realValue2, realValue3, resultOne;
        n = sc.nextInt();
        for (int s = 1; s < 1000; s++){
            results = 0;
        }
        for (int k = 1; k <= n; k++){
            realValue1 = sc.nextDouble();
            realValue2 = sc.nextDouble();
            realValue3 = sc.nextDouble();
            results(k) = (realValue1*2 + realValue2*3 + realValue3*5)/10;
            resultOne = (realValue1*2 + realValue2*3 + realValue3*5)/10;   
            }
        for (int k = 1; k <= n; k++)
            System.out.printf("%.1f\n", results[k]);
        sc.close();        
    }
        
} */