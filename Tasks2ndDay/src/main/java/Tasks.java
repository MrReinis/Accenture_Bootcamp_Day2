import java.util.Scanner;

public class Tasks {

    public static void compare() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(a.nextLine());

        Scanner b = new Scanner(System.in);
        System.out.println("Enter second number:  ");
        int secondNumber = Integer.parseInt(b.nextLine());


        boolean isEqual = firstNumber == secondNumber;
        boolean isLess = firstNumber < secondNumber;
        boolean isLessOrEqual = firstNumber < secondNumber || firstNumber == secondNumber;
        boolean isGreater = firstNumber > secondNumber;
        boolean isGreaterOrEqual = firstNumber > secondNumber || firstNumber == secondNumber;
        System.out.println("is " + firstNumber + " equal to " + secondNumber + " - " + isEqual);
        System.out.println("is " + firstNumber + " less than " + secondNumber + " - " + isLess);
        System.out.println("is " + firstNumber + " less than or equal with " + secondNumber + " - " + isLessOrEqual);
        System.out.println("is " + firstNumber + " greater than " + secondNumber + " - " + isGreater);
        System.out.println("is " + firstNumber + " greater than or equal with " + secondNumber + " - " + isGreaterOrEqual);


        //2nd Task
        Scanner c = new Scanner(System.in);
        System.out.println("Enter first boolean value:  ");
        String booleanValue = c.nextLine();

        Scanner d = new Scanner(System.in);
        System.out.println("Enter second boolean value:  ");
        String booleanValue2 = d.nextLine();
        System.out.println("Is " + booleanValue + " and " + booleanValue2 + " equal" + " - " + booleanValue.equals(booleanValue2));

    }

    //3rd Task
    public static void areBooleansEqual() {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a number value:  ");
        int isOddOrEvenNumber = Integer.parseInt(f.nextLine());


        if (isOddOrEvenNumber % 2 == 0) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    //4th Task
    public static void numberEvenOrOdd() {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter a number value:  ");
        int isNumberEvenorOdd = Integer.parseInt(g.nextLine());


        if (isNumberEvenorOdd % 2 == 0) {

            System.out.println("False");
        } else {
            System.out.println("True");
        }


    }

    //5th Tasks
    public static void oppositeBooleanValue() {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter a boolean value:  ");
        String otherBooleanValue = h.nextLine();

        if (otherBooleanValue.equals("true")) {

            System.out.println("false");
        }
        if (otherBooleanValue.equals("false")) {

            System.out.println("true");
        }

    }

    //6th Task

    public static void multipleConditions() {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number value:  ");
        int conditions = Integer.parseInt(i.nextLine());


        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number value:  ");
        int conditions2 = Integer.parseInt(k.nextLine());
        boolean result;

        if (conditions == conditions2) {

            result = true;
        }
        else if (conditions < 0 && conditions2 > 0){

            result = true;
        }
        else if (conditions > 100 && conditions2 > 100){

            result = true;
            }

        else {
            result = false;
        }
        System.out.println(result);
    }



            public static void main (String[] args){
                compare();
                areBooleansEqual();
                numberEvenOrOdd();
                oppositeBooleanValue();
                multipleConditions();


            }
        }

