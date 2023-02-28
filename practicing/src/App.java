import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner factorialNum = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = factorialNum.nextInt();

        try 
        {
            if (num < 0) 
                throw new CustomException("Number must be greater than zero");

            System.out.printf("%d --> ", num);

            for (int i = num; i > 0; i--)
            {
                System.out.printf("%d * ", i);
            }
            
        } catch(CustomException e) {
            System.out.println(e.getMessage());
        }
        finally {
            factorialNum.close();
        }
    }
}