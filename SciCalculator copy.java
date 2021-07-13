import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double totResults = 0; //running total of results
        int numCalc = 0; //running total of number of calculations
        double operand1, operand2;
        double result = 0;
        int operation = 8; //assigns value to begin while-loop

        while(operation != 0){
            System.out.println("\nCurrent Result: " + result);
            System.out.println("\nCalculator Menu \n--------------- \n0. Exit Program \n1. Addition \n2. Subtraction " +
                    "\n3. Multiplication \n4. Division \n5. Exponentiation \n6. Logarithm " +
                    "\n7. Display Average \n\n");
            System.out.print("Enter Menu Selection: ");
            operation= scnr.nextInt();
            //displays calculator menu and allows for menu selection

            if (operation == 7){
                if(numCalc > 0){
                    System.out.println("Sum of calculations: " + totResults);
                    System.out.println("Number of calculations: " + numCalc);
                    System.out.print("Average of calculations: ");
                    System.out.printf("%.2f", (totResults / numCalc));
                    System.out.println();
                    System.out.print("\nEnter Menu Selection: ");
                    operation= scnr.nextInt();
                }
                else{
                    System.out.println("\nError: No calculations yet to average!");
                    System.out.print("\nEnter Menu Selection: ");
                    operation= scnr.nextInt();
                }
                }//displays average; this was placed in the beginning to avoid errors with operands

            if (operation < 0 || operation > 7){
                System.out.println("Error: Invalid selection!");
                System.out.print("Enter Menu Selection: ");
                operation= scnr.nextInt();
            }//for invalid operations

            if (operation == 0)
                break;//ensures while-loop ends if operation is equal to 0 after the initial check

            System.out.print("Enter first operand: ");
            operand1 = scnr.nextDouble();
            System.out.print("Enter second operand: ");
            String op2 = scnr.next(); //string input
            if (op2.equals("RESULT")) // "RESULT" input
                operand2 = result;
            else // numver input
                operand2 = Double.parseDouble(op2);
            // allows users to enter both operands

            if (operation == 1){
                result = operand1 + operand2;
                totResults += result;
            } //performs addition and updates result and totResults

            else if (operation == 2){
                result = operand1 - operand2;
                totResults += result;
            }//performs subtraction and updates result and totResults

            else if (operation == 3){
                result = operand1 * operand2;
                totResults += result;
            }//performs multiplication and updates result and totResults

            else if (operation == 4){
                result = operand1 / operand2;
                totResults += result;
            }//performs division and updates result and totResults

            else if (operation == 5){
                result = Math.pow(operand1, operand2);
                totResults += result;
            }//performs exponentiation and updates result and totResults

            else if (operation == 6){
                result = Math.log(operand2) / Math.log(operand1);
                totResults += result;
            }//performs logarithm and updates result and totResults

            numCalc++;
        }
        System.out.println("Thanks for using this calculator. Goodbye!");
    }
}
