import ru.sibadi.rest.*;

import java.util.Scanner;


public class Application {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rest rest = new Rest();

        System.out.println("Welcome to " + rest.getName() + '\n');

        int pointMenu;
        do {
            System.out.println("1: Menu:");
            System.out.println("2: Reserve a table");
            System.out.println("3: Free tables");
            System.out.println("4: Exit");
            pointMenu = scan.nextInt();
            scan.nextLine();
            switch (pointMenu) {
                case 1:{
                    for (Food food : rest.getMenu()) {
                        System.out.println(food);
                    }
                    break;
		}
                case 2: {

                    System.out.println("Enter a name table");
                    String tableName = scan.nextLine();
                    for (Table table : rest.getTables()) {
                        if (table.getNameTable().equals(tableName)) {
                            table.setStatus(TableStatus.Reserved);
                        }
                    }
                    System.out.println("Select food");
                    for (Food food : rest.getMenu()) {
                        System.out.println(food);
                    }
                    System.out.println("Enter food name");
                    String menu = scan.nextLine();
                    for (Food food : rest.getMenu()) {
                        if (food.getTitle().equals(menu)) {
                            Order or = new Order(food);
                            System.out.println("Your order " + or);
                        }
                    }
                    break;
                }
                case 3: {
                    for (Table tables : rest.getTables()) {
                        System.out.println(tables);
                    }
                    break;
                }
            }

        } while (pointMenu != 4);


    }
}

