import java.util.Random;
import java.util.Scanner;

public class ola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sc.nextLine();

        double amt = 0.0;
        double newAmt = 0.0;
        String choice = "";

        do {
            System.out.println("Welcome " + name + ", Enter positive wallet amount: ");
            amt = sc.nextDouble();
            sc.nextLine(); //to clear compiler issue for reading new line

        } while (amt <= 0);

        do {
            System.out.println("Do you wanna ride? (y/n)");
            choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) break;

            System.out.println("select pick up point: ");
            String pick = sc.nextLine();

            System.out.println("select drop point: ");
            String drop = sc.nextLine();

            Random random = new Random();
            double price = 20 + random.nextDouble(100);

            System.out.println(pick + " -> " + drop + " = " + price + " RS");

            while (price > amt) {
                System.out.println("Sorry, Your wallet is not sufficient for this trip, Please add more money (require " + (price - amt) + " RS)");
                do {
                    System.out.println(name + ", Enter positive wallet amount: ");
                    newAmt = sc.nextDouble();
                } while (newAmt <= 0);
                amt += newAmt;
                System.out.println("Wallet amount :" + amt + " RS");
            }
            amt -= price;
            System.out.println("Thank you," + name + " Your trip is confirmed");
            System.out.println("Your remaining wallet money :" + amt);
        } while (true);
    }

}
