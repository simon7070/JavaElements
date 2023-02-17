import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to \"LEAP YEAR CHECKER\"\n ");

        for(int i = 0; i < 3; i++) {

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if(age < 18) {
                System.out.println("Your age should not less than to 18!");
                System.out.println("You have only 3 times attempt to enter your age!\n");
            }

            else if(age >= 18) {
                System.out.println(" ");
                System.out.println("LEAP YEAR CHECKER\n ");

                leapYear();
                break;
            }

            else {
                System.out.println("Invalid Age");
            }

        }

    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }


            else
                leap = true;
        }

        else
            leap = false;
        if (leap) {
            System.out.println(year + " is a leap year.\n");
            tryAgain();
        }
        else {
            System.out.println(year + " is not a leap year.\n");
            tryAgain();
        }

    }
    public static void tryAgain() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you wan't to try again Yes/No?: ");
        String tryAgain= sc.nextLine();
        System.out.println(" ");

        switch (tryAgain) {
            case "Yes":
                leapYear();
            case "yes":
                leapYear();

            case "No":
                System.out.println("The application is now Closed");
                System.exit(0);
            case "no":
                System.out.println("The application is now Closed");
                System.exit(0);

            default:
                System.out.println("Invalid Key word!");

        }
    }
}
