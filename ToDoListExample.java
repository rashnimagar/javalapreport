package myPackageFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListExample {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task  2. View Tasks  3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                System.out.println("Tasks:");
                for (String task : tasks) {
                    System.out.println("- " + task);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
