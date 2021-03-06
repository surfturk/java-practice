import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x != y);

        // intro
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // booleans
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        // if statements
        int temp = 86;
        if (temp > 85) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water!");
        }
        else if (temp > 70)
            System.out.println("Beautiful day!");
        else
            System.out.println("Cold day!");

        // simplified if
        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);

        // ternary operator
        int income2 = 120_000;
        String className = income > 120_000 ? "First" : "Economy";


        // switch statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin!");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }


        // FizzBuzz exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Fizz");
        else if (num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);


        // for loops
        for (int i = 0; i < 5; i ++)
            System.out.println("Hello World!");


        // while loops
        // while using continue and break
        Scanner scanner5 = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner5.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
              break;
             System.out.println(input);

        }

        // do while (used rarely)
//        do {
//            System.out.println("Input: ");
//            input = scanner5.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));


        // for each loop
        String[] fruits = {"Apple", "Mango", "Orange"};

        // standard for each loop
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // abstracted but limited for each loop
        for (String fruit : fruits)
            System.out.println(fruit);



    }

}
