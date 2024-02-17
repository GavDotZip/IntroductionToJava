package A5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        // Initialize ArrayList
        ArrayList<MySalesEmployee> salesTeam = new ArrayList<>();

        // Create MySalesAgent objects
        MySalesAgent msa1 = new MySalesAgent("Michael", "Scott", "111");
        MySalesAgent msa2 = new MySalesAgent("Jim", "Halpert", "222");
        MySalesAgent msa3 = new MySalesAgent("Dwight", "Schrute", "333");

        // Create MySalesPerson objects
        MySalesPerson msp1 = new MySalesPerson("Mark", "Corrigan", "444");
        MySalesPerson msp2 = new MySalesPerson("Sophie", "Chapman", "555");
        MySalesPerson msp3 = new MySalesPerson("Jeff", "Heaney", "666");

        // Store MySalesAgent / MySalesPerson objects in ArrayList
        salesTeam.add(msa1);
        salesTeam.add(msa2);
        salesTeam.add(msa3);
        salesTeam.add(msp1);
        salesTeam.add(msp2);
        salesTeam.add(msp3);

        // Print ArrayList before edits
        System.out.println("------------------- Dunder Mifflin/JLB Credit -------------------");
        for (MySalesEmployee employee : salesTeam) {
            System.out.println(employee);
        }

        // Request sales figures from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales per team member: ");

        // Store sales figures from the user per employee, use to calculate commission
        for (MySalesEmployee employee : salesTeam) {
            System.out.println("Enter the total sales for " + employee.getFirstName() + " " + employee.getLastName() + ": ");
            employee.sales = Double.parseDouble(scanner.nextLine());
            employee.calculateCommission();
        }

        // Print employee name, ID, sales value, and commission
        for (MySalesEmployee employee : salesTeam) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getEmployeeID() + ")");
            System.out.println("Total sales: " + employee.sales + ", Total commission: " + employee.commission);
        }

        // Close scanner
        scanner.close();
    }
}
