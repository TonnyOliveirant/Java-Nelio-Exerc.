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
        double realValue1, realValue2, realValue3, resultOne;
        resultOne = 0;
        n = sc.nextInt();
        for (int k = 1; k <= n; k++){
            realValue1 = sc.nextDouble();
            realValue2 = sc.nextDouble();
            realValue3 = sc.nextDouble();
            resultOne = (realValue1*2 + realValue2*3 + realValue3*5)/10;   
            System.out.printf("%.1f\n", resultOne);    
        }
        sc.close();        
    }
        
} */

/* import java.util.Scanner;
import java.util.Locale;

public class Exercicios4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double x, y, n;
        double divisionResult;
        n = sc.nextInt();
        for (int k = 0; k < n; k++){
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0){
                System.out.println("This is a impossible division");
            }
            else {
                divisionResult = x/y;
                System.out.printf("%.1f\n", divisionResult);
            }
        }
        sc.close();
    }
} */


/* import java.util.Scanner;

public class Exercicios4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n, finalValue;
        n = sc.nextInt();
        finalValue = n;
        if(n == 0){
            finalValue = 1;
            System.out.printf("%d", finalValue);
        }
        else{
            for (int x = 1; x < n; x++){
                finalValue = finalValue * (n-x);
            }
            System.out.printf("%d", finalValue);
        }
        sc.close();
    }
} */

/* import java.util.Scanner;

public class Exercicios4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int k = 1; k <= x; k++){
            if (x % k == 0){
                System.out.printf("%d\n", k);
            }
        }
    sc.close();
    }
} */
/* import java.util.Scanner;

public class Exercicios4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        for (int k = 1; k <= x; k++){
            System.out.printf("%d %d %d\n",k, k*k, k*k*k);
        }
        sc.close();
    }
} */
