import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculator {
    
    private int num1;
    private int num2;

    private List<String> calcHistory = new ArrayList<>();

    public void showHistory(){
        System.out.println("history:");
       for(int i = 0; i < calcHistory.size(); i++){
            System.out.println((i + 1) + "." + " " + calcHistory.get(i));
            System.out.println("------");
       }
       System.out.println("You have completed a total of " + calcHistory.size() + " transactions so far.");
    }

    public void startCalculation(){

        Scanner input = new Scanner(System.in);
        String userChoice;

        do{
        System.out.print("give the first number: ");
        num1 = input.nextInt();
        System.out.print("give the second number: ");
        num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + add());
        System.out.println(num1 + " - " + num2 + " = " + sub());
        System.out.println(num1 + " / " + num2 + " = " + div());
        System.out.println(num1 + " * " + num2 + " = " + multi());

        //history
        calcHistory.add(num1 + " + " + num2 + " = " + add());
        calcHistory.add(num1 + " - " + num2 + " = " + sub());
        calcHistory.add(num1 + " / " + num2 + " = " + div());
        calcHistory.add(num1 + " * " + num2 + " = " + multi());


        System.out.println("calculation finished.");

        System.out.print("do you want to use again? (Y/n): ");
        userChoice = input.next().toLowerCase();
        switch(userChoice){
            case "n":
                System.out.println("you are exiting. if you want to exit the app, type '3'.");
            break;

            default:
                System.out.println("wrong, try again.");
            break;
        }

    }while(userChoice.equals("y"));
    }
    
    private int add(){
        return num1 + num2;
    }
    private int sub(){
        return num1 - num2;
    }
    private double div(){
        if(num2 == 0){
            throw new ArithmeticException("not divisible by zero. num2:  " + num2);
        }
        return num1 / num2;
    }
    private int multi(){
        return num1 * num2;
    }

}
