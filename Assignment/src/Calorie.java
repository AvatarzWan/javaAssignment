
/**
 *Assignment 1 - BIT106
 * This program is designed to calculate the calorie of the user and  compare it with the recommended calorie intake
 *
 * @author Hazwan Izzani B1601895
 *
 */

import java.util.*;

public class Calorie {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        char newuser = 'y'; // in the beginning the user will always enter data

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your gender (m)ale or (f)emale: ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your level of activity (l)ow, (m)oderate, (a)ctive or  (v)ery active: ");
        char activity = sc.next().charAt(0);
        int recomCal;
        recomCal = recomCal(gender, age, activity);

        System.out.printf("Hey %s ! Your recommended daily calorie intake is %d ", name, recomCal);
        System.out.println("");

        char yesno = 0;
        double totalcalorie;
        int servings = 0;
        totalcalorie = totalCalorie(yesno, servings);
        System.out.printf("Your daily calorie intake is %.2f", totalcalorie);
        System.out.println("");
        printOutput(totalcalorie, recomCal);
        double percentagedif = percentageDif(totalcalorie, recomCal);
        System.out.println(name + " has a percentage difference at " + percentagedif);

        System.out.println("Do you want to enter another user?"); // at the end it will ask if you want to enter data for new user
        newuser = sc.next().charAt(0);
        sc.nextLine();

        if (newuser == 'y' || newuser == 'Y') {    // repeat for atleast 3 new users (2nd user)
            System.out.println("Enter your name: "); // the new input for newuser due to basis of java requirement to initialse a variable first 
            String name1 = sc.nextLine();
            System.out.println("Enter your gender (m)ale or (f)emale: ");
            char gender1 = sc.nextLine().charAt(0);
            System.out.println("Enter your age: ");
            int age1 = sc.nextInt();
            System.out.println("Enter your level of activity (l)ow, (m)oderate, (a)ctive or  (v)ery active: ");
            char activity1 = sc.next().charAt(0);
            int recomCal1;
            recomCal1 = recomCal(gender1, age1, activity1);

            System.out.printf("Hey %s ! Your recommended daily calorie intake is %d ", name1, recomCal1);
            System.out.println("");

            double totalcalorie1;
            totalcalorie1 = totalCalorie(yesno, servings);
            System.out.printf("Your daily calorie intake is %.2f", totalcalorie1);
            printOutput(totalcalorie1, recomCal1);
            double percentagedif1 = percentageDif(totalcalorie1, recomCal1); // calculate the percentage difference
            System.out.println(name1 + " has a percentage difference at " + percentagedif1);

            System.out.println("Do you want to enter another user?");
            newuser = sc.next().charAt(0);
            sc.nextLine();

            if (newuser == 'y' || newuser == 'Y') {          //  (3rd user)
                System.out.println("Enter your name: ");
                String name2 = sc.nextLine();
                System.out.println("Enter your gender (m)ale or (f)emale: ");
                char gender2 = sc.nextLine().charAt(0);
                System.out.println("Enter your age: ");
                int age2 = sc.nextInt();
                System.out.println("Enter your level of activity (l)ow, (m)oderate, (a)ctive or  (v)ery active: ");
                char activity2 = sc.next().charAt(0);
                int recomCal2;
                recomCal2 = recomCal(gender2, age2, activity2);

                System.out.printf("Hey %s ! Your recommended daily calorie intake is %d ", name2, recomCal2);
                System.out.println("");

                double totalcalorie2;
                totalcalorie2 = totalCalorie(yesno, servings);
                System.out.printf("Your daily calorie intake is %.2f", totalcalorie2);
                System.out.println("");
                printOutput(totalcalorie2, recomCal2);
                double percentagedif2 = percentageDif(totalcalorie2, recomCal2);
                System.out.println(name2 + " has a percentage difference at " + percentagedif2);

                System.out.println("Do you want to enter another user?");
                newuser = sc.next().charAt(0);
                sc.nextLine();

                if (newuser == 'y' || newuser == 'Y') { // (4th user)
                    System.out.println("Enter your name: ");
                    String name3 = sc.nextLine();
                    System.out.println("Enter your gender (m)ale or (f)emale: ");
                    char gender3 = sc.nextLine().charAt(0);
                    System.out.println("Enter your age: ");
                    int age3 = sc.nextInt();
                    System.out.println("Enter your level of activity (l)ow, (m)oderate, (a)ctive or  (v)ery active: ");
                    char activity3 = sc.next().charAt(0);
                    int recomCal3;
                    recomCal3 = recomCal(gender3, age3, activity3);

                    System.out.printf("Hey %s ! Your recommended daily calorie intake is %d ", name3, recomCal3);
                    System.out.println("");

                    double totalcalorie3;
                    totalcalorie3 = totalCalorie(yesno, servings);
                    System.out.printf("Your daily calorie intake is %.2f", totalcalorie3);
                    System.out.println("");
                    printOutput(totalcalorie3, recomCal3);
                    double percentagedif3 = percentageDif(totalcalorie3, recomCal3); // the number variables will be used to compare
                    System.out.println(name3 + " has a percentage difference at " + percentagedif3);

                    System.out.println("Do you want to enter another user?");
                    newuser = sc.next().charAt(0);
                    sc.nextLine();

                    if (percentagedif < percentagedif1) {
                        if (percentagedif < percentagedif2) {
                            if (percentagedif < percentagedif3) {
                                System.out.println(name + " has the lowest percentage difference at  " + percentagedif);
                            } else {
                                System.out.println(name3 + " has the lowest percentage difference at " + percentagedif3);
                            }
                        } else if (percentagedif1 < percentagedif2) {
                            if (percentagedif1 < percentagedif3) {
                                System.out.println(name1 + " has the lowest percentage difference at " + percentagedif1);
                            } else {
                                System.out.println(name2 + " has the lowest percentage difference at " + percentagedif2);
                            }
                        }
                    }
                }

                if (percentagedif < percentagedif1) {
                    if (percentagedif < percentagedif2) {
                        System.out.println(name + " has the lowest percentage difference at  " + percentagedif);
                    } else {
                        System.out.println(name2 + " has the lowest percentage difference at " + percentagedif2);
                    }
                } else {
                    System.out.println(name1 + " has the lowest percentage difference at " + percentagedif1);
                }
            }

            if (percentagedif < percentagedif1) {
                System.out.println(name + " has the lowest percentage difference at  " + percentagedif);
            } else {
                System.out.println(name1 + " has the lowest percentage difference at " + percentagedif1);
            }
        }

    }

    public static int recomCal(char gender, int age, char activity) {          // a method to calculate the recommended calories for the user

        int recomCal = 0;

        if (gender == 'm' || gender == 'M') { // making sure for capitalised words will also count
            switch (activity) {          // due to many cases of activities and various combinations between the gender and age, I used switch
                case 'l':
                case 'L':
                    if (age >= 60) {
                        recomCal = 1780;
                    } else if (age >= 30) {
                        recomCal = 1920;
                    } else if (age >= 19) {
                        recomCal = 1960;
                    } else {
                        System.out.println("You must be 19 or above to use this program"); // other values than listed will not be accepted
                    }
                    break;
                case 'm':
                case 'M':
                    if (age >= 60) {
                        recomCal = 2030;
                    } else if (age >= 30) {
                        recomCal = 2190;
                    } else {
                        recomCal = 2240;
                    }
                    break;
                case 'a':
                case 'A':
                    if (age >= 60) {
                        recomCal = 2380;
                    } else if (age >= 30) {
                        recomCal = 2470;
                    } else if (age >= 19) {
                        recomCal = 2520;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                case 'v':
                case 'V':
                    if (age >= 60) {
                        recomCal = 2540;
                    } else if (age >= 30) {
                        recomCal = 2740;
                    } else if (age >= 19) {
                        recomCal = 2800;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                default:
                    System.out.println("Please enter a valid activity (l)ow, (m)oderate, (a)ctive or  (v)ery active");
                    break;

            }
        } else if (gender == 'f') {
            switch (activity) {
                case 'l':
                case 'L':
                    if (age >= 60) {
                        recomCal = 1550;
                    } else if (age >= 30) {
                        recomCal = 1600;
                    } else if (age >= 19) {
                        recomCal = 1610;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                case 'm':
                case 'M':
                    if (age >= 60) {
                        recomCal = 1170;
                    } else if (age >= 30) {
                        recomCal = 1900;
                    } else if (age >= 19) {
                        recomCal = 1840;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                case 'a':
                case 'A':
                    if (age >= 60) {
                        recomCal = 1990;
                    } else if (age >= 30) {
                        recomCal = 2130;
                    } else if (age >= 19) {
                        recomCal = 2080;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                case 'v':
                case 'V':
                    if (age >= 60) {
                        recomCal = 2220;
                    } else if (age >= 30) {
                        recomCal = 2370;
                    } else if (age >= 19) {
                        recomCal = 2310;
                    } else {
                        System.out.println("You must be 19 or above to use this program");
                    }
                    break;
                default:
                    System.out.println("Please enter a valid acitivity (l)ow, (m)oderate, (a)ctive or  (v)ery active");
                    break;

            }

        } else {
            System.out.println("Please enter a valid gender (m)ale (f)emale");
        }

        return recomCal; // returns the recommended calorie for the user that will be initialised in main

    }

    public static void printFoodTable() {         // a method to print the foodTable - less space in main
        System.out.println("---------------------------");
        System.out.println("(R)ice");
        System.out.println("(F)ried chicken");
        System.out.println("(E)gg");
        System.out.println("(C)orn flakes with milk");
        System.out.println("(B)eef curry");
        System.out.println("(K)uih-teow");
        System.out.println("---------------------------");
    }

    public static double totalCalorie(char yesno, int servings) {         // calculate the total calories with the selected foods

        System.out.println("Do you want to enter your daily food calorie ? (y)es or (n)o:  ");
        yesno = sc.next().charAt(0);
        double totalcalorie = 0;

        do {
            System.out.println("Enter your food intake (based on the table): ");
            printFoodTable();
            char foodtype = sc.next().charAt(0);

            System.out.println("Enter your amout of servings: ");
            servings = sc.nextInt();
            switch (foodtype) {          // switch is used due to the many cases of food types
                case 'r':
                case 'R':
                    totalcalorie += (double) (servings * 130.1);      // adding the selected calorie to the total
                    break;
                case 'f':
                case 'F':
                    totalcalorie += (double) (servings * 283.0);
                    break;
                case 'e':
                case 'E':
                    totalcalorie += (double) (servings * 155.0);
                    break;
                case 'c':
                case 'C':
                    totalcalorie += (double) (servings * 598.0);
                    break;
                case 'b':
                case 'B':
                    totalcalorie += (double) (servings * 144.0);
                    break;
                case 'k':
                case 'K':
                    totalcalorie += (double) (servings * 189.0);
                    break;
                default:
                    System.out.println("Please enter a valid food type (based on the starting letters of the food)");
                    break; // in case a different value is entered

            }

            System.out.println("Do you want to continue? (y)es or (n)o "); // a loop for adding more foods to the daily calories
            yesno = sc.next().charAt(0);

        } while (yesno == 'y' || yesno == 'Y');

        return totalcalorie; // return the total calorie for the selected user
    }

    public static void printOutput(double totalcalorie, double recomCal) { // a print method to dispaly if the user had consumed more than recommended
        if (totalcalorie > recomCal) {
            System.out.println("You have consumed more calories than the recommended daily intake.");
        } else if (totalcalorie == recomCal) {
            System.out.println("You have consumed the required amount of calories per day.");
        } else {
            System.out.println("You have consumed less calories than the recommended daily intake.");
        }
    }

    public static double percentageDif(double totalcalorie, double recomCal) { // a method to return the percentage difference between the user's daily intake and recommended calories
        double percentagedif = (totalcalorie - recomCal) / recomCal * 100;
        return percentagedif;
    }
}
