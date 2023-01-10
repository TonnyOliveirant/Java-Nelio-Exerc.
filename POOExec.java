/*package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.employee;

public class Exercicios2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        employee emp = new employee();

        emp.name = sc.nextLine();
        emp.salary = sc.nextDouble();
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", emp.name, emp.liquidsalary());

        System.out.print("Which percentage to increase salary? ");
        emp.percentageIncrement = sc.nextDouble();
        System.out.printf("\n Updated data: %s, $ %.2f", emp.name, emp.increasedsalary());

        sc.close();

        
    }
}*/

/* package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Rectangle;

public class Exercicios1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter the value of width: ");
        rect.width = sc.nextDouble();
        System.out.println("Enter the value of height: ");
        rect.height = sc.nextDouble();

        System.out.printf("The sum of width and height is: %.2f\n", rect.width + rect.height);
        System.out.printf("The area of the rectangle is: %.2f\n", rect.area());
        System.out.printf("The perimeter of the rectangle is: %.2f", rect.perimeter());

        sc.close();
    }
} */


/* package Application;

import Entities.Students;
import java.util.Scanner;


public class Exercicios3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Students alun = new Students();
        System.out.printf ("Insert the name of the student: ");
        alun.studentsName = sc.nextLine();
        alun.nota1 = sc.nextDouble();
        alun.nota2 = sc.nextDouble();
        alun.nota3 = sc.nextDouble();
        System.out.print(alun.boletimSystem());
        sc.close();
    }
}
 */
