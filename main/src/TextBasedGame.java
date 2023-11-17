import java.util.Scanner;

        public class TextBasedGame {
            static int weight=0;

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your weight");
                weight = scanner.nextInt();

                //Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to the Text Adventure Game!");
                System.out.println("You wake up in a mysterious room. There are two doors in front of you.");
                System.out.println("Which door do you choose? (1 or 2)");

                int doorChoice = scanner.nextInt();
                scanner.nextLine();

                if (doorChoice == 1) {
                    roomOne();
                } else if (doorChoice == 2) {
                    roomTwo();
                } else {
                    System.out.println("Invalid choice. Game over!");
                }
            }

            public static void roomOne() {
                System.out.println("You enter room one. There's a table with a keys on it.");
                System.out.println("What do you do? (take keys / leave)");

                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();

                if (choice.equals("take keys")) {
                    System.out.println("You take the keys and proceed to the next room.");
                    roomTwo();
                } else if (choice.equals("leave")) {
                    System.out.println("You decide to leave the keys behind and proceed to the next room.");
                    roomTwo();
                } else {
                    System.out.println("Invalid choice. Game over!");
                }
            }

            public static void roomTwo() {
                System.out.println("You enter room two. There's another door in front of you.");
                System.out.println("What do you do? (use keys / kick door)");

                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();

                if (choice.equals("use keys")) {
                    System.out.println("The keys dont work");
                    roomTwo();
                } else if (choice.equals("kick door") && weight<70) {
                    System.out.println("The door breaks, You Win!");
                    winGame();
                } else {
                    System.out.println("You're too fat. Game over.");
                }
            }

            public static void winGame() {
                System.out.println("Congratulations! You found the treasure and won the game!");
            }
        }
