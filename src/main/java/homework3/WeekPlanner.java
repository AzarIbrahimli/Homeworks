package homework3;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to cources; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "play football";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "learn programming; practice coding";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "do workout; play piano";
        scedule[5][0] = "Friday";
        scedule[5][1] = "read a novel; visit your grandma";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "do house work";
        boolean a=true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, input the day of the week: ");
            String weekday = sc.next();
            String lower = weekday.toLowerCase();
            String space = lower.trim();
                switch (space) {
                    case "exit":
                        a=false;
                        break;
                    case "sunday":
                        System.out.println(scedule[0][1]);
                        break;
                    case "monday":
                        System.out.println(scedule[1][1]);
                        break;
                    case "tuesday":
                        System.out.println(scedule[2][1]);
                        break;
                    case "wednesday":
                        System.out.println(scedule[3][1]);
                        break;
                    case "thursday":
                        System.out.println(scedule[4][1]);
                        break;
                    case "friday":
                        System.out.println(scedule[5][1]);
                        break;
                    case "saturday":
                        System.out.println(scedule[6][1]);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            }while(a);
        }
    }
