package homework12.app;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void run() throws ParseException {
        ConsoleCommands commands = new ConsoleCommands();
        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        do {
            Menu.menuTable();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    commands.testData();
                    break;
                case 2:
                    commands.displayAll();
                    break;
                case 3:
                    System.out.println("Enter number: ");
                    int number = sc.nextInt();
                    commands.greaterThan(number);
                    break;
                case 4:
                    System.out.println("Enter number: ");
                    int number1 = sc.nextInt();
                    commands.lessThan(number1);
                    break;
                case 5:
                    System.out.println("Enter number: ");
                    int number2 = sc.nextInt();
                    System.out.println(commands.equal(number2));
                    break;
                case 6:
                    commands.createNewFamily();
                    break;
                case 7:
                    commands.deleteFamily();
                    break;
                case 8:
                    System.out.println("1. Give birth to a baby: \n2.Adopt a child\n3.Return to main menu ");
                    int number3 = sc.nextInt();
                    if (number3 == 1) commands.bornChild();
                    else if (number3 == 2) commands.adoptChild();
//                    else loop = true;
                    break;
                case 9:
                    commands.deleteAgeOlder();
                    break;
                case 10:
                    loop = true;
                    break;
                default:
                    throw new IllegalArgumentException("Wrong input");
            }
        } while(!loop);

        }
    }