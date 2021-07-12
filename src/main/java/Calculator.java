//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

//    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double factorial(int n){
        if(n<=0)
        {
//            logger.info("Cannot calculate factorial of negative number or zero");
            return Double.NaN;
        }
        double res=1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
//        logger.info("Factorial("+n+ ") = "+ res );
        return res;
    }

    public static double power(int a, int b)
    {
        double res=Math.pow(a,b);
//        logger.info("Power : " + a + "^" + b + " = " + res);
        return res;
    }

    public static double squareRoot(double x)
    {
        double res=Math.sqrt(x);
//        logger.info("Square Root of : " + x + " = " + res);
        return res;
    }

    public static double logarithmic(double x)
    {
        double res=Math.log(x);
//        logger.info("Natural Logarithm of : " + x + "\n = " + res);

        return res;
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int choice=0;
        while(choice!=5)
        {
            System.out.println("Menu:");
            System.out.println("1. Factorial\n2. Power\n3. Square Root\n4. Natural Logarithm\n5. Exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1: System.out.print("---------------\nFactorial\n---------------\nEnter a number:");
                    int i=sc.nextInt();
                    System.out.println("Factorial of "+i+"= "+factorial(i));
                    break;

                case 2: System.out.print("---------------\nPower\n---------------\nEnter a number:");
                    int n=sc.nextInt();
                    System.out.print("\nEnter the power:");
                    int x=sc.nextInt();
                    System.out.println(n+" to the power "+x +" = " +power(n,x) );
                    break;
                case 3: System.out.print("---------------\nSquare Root\n---------------\nEnter a number:");
                    int p=sc.nextInt();
                    System.out.println("Square Root of "+p+" ="+squareRoot(p));
                    break;
                case 4: System.out.print("---------------\nNatural Logarithm\n---------------\nEnter a number:");
                    int q=sc.nextInt();
                    System.out.println("Log("+q+") = "+logarithmic(q));
                    break;
                case 5: System.out.println("Exiting....\n Bye");
                    break;
                default:System.out.println("Wrong choice, try again");
            }
        }
    }
}
