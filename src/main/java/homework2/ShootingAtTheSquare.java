package homework2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ShootingAtTheSquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[][] array = new String[5][5];
            boolean a = true, b = true;
            int c=0,d=0;
            Random RandomNumber = new Random();
            int rand_int1 = RandomNumber.nextInt(1, 5);
            int rand_int2 = RandomNumber.nextInt(1, 5);
            int horizontal = 0; //string to integer
            for (String[] strings : array) {          // this loop initialize table
                Arrays.fill(strings, " - |");
            }
            for (int k = 0; k < 6; k++) {    // numerization for table between 0-5
                System.out.printf("%d | ", k);
            }
            System.out.println();
            // Display
            for (int i = 0; i < array.length; i++) {  // this loop display it
                System.out.print((i + 1) + " |");
                for (int j = 0; j < array[i].length; j++) {
                    System.out.printf("%s", array[i][j]);
                }
                System.out.println();
            }
            System.out.println("\nAll set. Get ready to rumble!");
            do {
                do {                        // this loop checks line is number or not.And is between (1-5) ?
                    System.out.println("Enter a line for fire, please : ");
                    String line = sc.next();
                    try {
                        Integer.parseInt(line);
                        a = false;       //check number is line or not
                        horizontal = Integer.parseInt(line);
                        if (horizontal > 5 || horizontal <1) {
                            a = true;
                            System.out.println("This number is not between 1 and 5.");// it checks is number between 1 and 5
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(line + " is not a number");
                    }
                } while (a);
                int vertical = 0;  // string to integer
                do {                            // this loop checks bar is number or not. And between 1-5 ?
                    System.out.println("Enter a shooting bar, please : ");
                    String bar = sc.next();
                    try {
                        Integer.parseInt(bar);
                        b = false;
                        vertical = Integer.parseInt(bar);
                        if (vertical > 5 || vertical <1) {
                            b = true;
                            System.out.println("This number is not between 1 and 5.");// it checks is number between 1 and 5
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(bar + " is not a number");
                    }
                }
                while (b);

                // Initialize
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(c==0){  // it fills with "-"
                            array[i][j] = " - |";
                        }
                        if ((horizontal) == rand_int1 && (vertical) == rand_int2) {
                            array[horizontal - 1][vertical - 1] = " x |";
                            d=d+1; //when game end d will increase and loop finish
                        } else {
                            array[horizontal - 1][vertical - 1] = " * |";
                        }
                    }
                }

                for (int k = 0; k < 6; k++) {    // numerization for table between 0-5
                    System.out.printf("%d | ", k);
                }
                System.out.println();
                // Display
                for (int i = 0; i < array.length; i++) {
                    System.out.print((i + 1) + " |");
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.printf("%s", array[i][j]);
                    }
                    System.out.println();
                }
                c=c+1;  //it is for memorize last choices
            }while(d==0); //when game end -d will increase
            System.out.println("You have won!");
        }
    }

