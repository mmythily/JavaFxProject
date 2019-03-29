import java.util.InputMismatchException;
import java.util.Scanner;

/**March 29th 2019
 * Lec 11.2
 */
public class ExceptionHandling11 {
    public static void main(String[] args) {

        System.out.println("Enter Amount of Sales in $ \n" +
                "Enter commission rate out of 100");
        Scanner input = new Scanner (System.in);
        try{
        double saleAmount = input.nextDouble();
        double commissionRate = input.nextDouble();
        double commissionAmount = saleAmount * (commissionRate/100);

        if(saleAmount<=0 || commissionRate<=0 || commissionRate>100){
            throw new IllegalArgumentException("Enter a positive number");
        }

        System.out.println("Your commission is $"+commissionAmount);
        }

        catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
        }

        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Thank you!");
        }

    }
}

