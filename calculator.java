import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("Select option: ");
            System.out.println("1. Other operation ");
            System.out.println("2. Exit  ");

            try {

                int number = scanner.nextInt();

                if (number == 2) {
                    System.out.println("Performing other operation...\n" + "Close.");
                    break;
                }

                if (number == 1) {
                    System.out.println("Calculator");
                    System.out.println(" \n");


                    System.out.println("Give number1: ");

                    Double number1 = scanner.nextDouble();

                    System.out.println("Give number2:");
                    Double number2 = scanner.nextDouble();

                    System.out.println("Give operator " + "- " + "+ " + "/ " + "* ");
                    String operator = scanner.next();


                    if (operator.equals("+")) {
                        Double number3 = number1 + number2;
                        System.out.println("Your value is :" + number3);
                    } else if (operator.equals("-")) {
                        Double number4 = number1 - number2;
                        System.out.println("Your value is :" + number4);
                    } else if (operator.equals("/")) {
                        Double number5 = number1 / number2;
                        System.out.println("Your value is :" + number5);
                    } else if (operator.equals("*")) {
                        Double numbe63 = number1 * number2;
                        System.out.println("Your value is :" + numbe63);
                    } else {
                        System.out.println("Invalid operation ! \n" + "Please enter a correct operation.");
                        continue;

                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Error, write a valid number please !");
                scanner.next();
            }


        }
        scanner.close();

    }

}




