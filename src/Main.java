import java.util.Scanner;
import java.util.zip.CRC32;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to CLI Calculator.");
        System.out.println("1 start calculator");
        System.out.println("2 calculation history");
        System.out.println("3 exit");

        Scanner input = new Scanner(System.in);
        calculator calc = new calculator();

        while(true){
        System.out.print("> ");
        String userChoice = input.next();

        switch(userChoice){
            case "1":
                calc.startCalculation();
            break;

            case "2":
                calc.showHistory();
            break;

            case "3":
                System.out.println("goodbye.");
                input.close();
            return;

            default:
                System.out.println("wrong, try again.");
            break;

        }

        }
    }
}
