import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Say Hello");
            System.out.println("2. Print Numbers 1-5");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Hello!");
            }

            else if(choice == 2) {
                for(int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            else if(choice == 3) {
                System.out.println("Program Exited");
            }

            else {
                System.out.println("Invalid Choice");
            }

        } while(choice != 3);
    }
}