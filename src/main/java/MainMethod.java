import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        Model model = new Model();
        model.setFirstNumber(firstNumber);
        model.setSecondNumber(secondNumber);

        Calculation cal = new Calculation();

        int addResult = cal.add(model.getFirstNumber(), model.getSecondNumber());
        System.out.println("Addition Result ="+addResult);

        int subResult = cal.substract(model.getFirstNumber(), model.getSecondNumber());
        System.out.println("Subtraction Result ="+subResult);

        int mulResult = cal.multiply(model.getFirstNumber(), model.getSecondNumber());
        System.out.println("Multiplication Result ="+mulResult);

        float divResult = cal.divide(model.getFirstNumber(), model.getSecondNumber());
        System.out.println("Division Result ="+divResult);



    }
}
