/* package Entities;
import java.lang.String;
public class employee {
    public String name;
    public double salary;
    public double tax;
    public double percentageIncrement;

    public double liquidsalary(){
        return (salary - tax);
    }
    public double increasedsalary(){ 
        return salary += (salary * percentageIncrement) - tax;
    }
}
 */

/* package Entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
} */


/* package Entities;

public class Students {
    public String studentsName;
    public double nota1, nota2, nota3, finalGrade, missingPoints;
    public String  boletimSystem(){
        finalGrade = (nota1+nota2+nota3);
        missingPoints = 60.00 - finalGrade;
        if (finalGrade >= 60.00){
            return ("Final Grade = " + finalGrade + "\nPASS");

        }
        else {
            return ("Final Grade: " + finalGrade + "\nFailed\nMISSING " + missingPoints + " Points");
        }
    }
}
 */
