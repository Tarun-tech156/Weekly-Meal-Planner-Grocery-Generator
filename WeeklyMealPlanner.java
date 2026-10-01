import java.util.Scanner;

public class WeeklyMealPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        double total = 0;
        int day = 0;

        while (day < 7) {

            System.out.println("\n" + days[day]);
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Breakfast: Idli");
                    total += 40;
                    break;

                case 2:
                    System.out.println("Lunch: Rice & Chicken");
                    total += 120;
                    break;

                case 3:
                    System.out.println("Dinner: Paneer Curry");
                    total += 100;
                    break;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            day++;
        }

        System.out.println("\n--- Grocery List ---");

        String[] items = {"Rice", "Chicken", "Vegetables", "Oil"};

        for (String item : items) {

            System.out.print("Do you have " + item + "? (yes/no): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("no"))
                System.out.println("Buy " + item);
        }

        System.out.println("\nEstimated Cost: Rs." + total);

        sc.close();
    }
}