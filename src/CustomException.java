/**March 25th 2019
 *
 */
import java.lang.Exception;
import java.util.Scanner;

class NegativeSalaryException extends Exception{
    NegativeSalaryException(String msg){
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        double salary = 0.0d;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Salary");
        salary = input.nextDouble();
        try {
            if (salary < 1.0)
                throw new NegativeSalaryException("Salary cannot be less than 1");
                //throw new IllegalArgumentException("Salary cannot be less than 1");
        }
        catch(NegativeSalaryException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("good bye");
        }

    }
}
