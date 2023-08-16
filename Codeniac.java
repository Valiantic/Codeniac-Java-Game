/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codeniac;

import java.util.Scanner;

public class Codeniac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("                              ██████╗ ██████╗ ██████╗ ███████╗███╗   ██╗██╗ █████╗  ██████╗        \n"
                + "                            ██╔════╝██╔═══██╗██╔══██╗██╔════╝████╗  ██║██║██╔══██╗██╔════╝        \n"
                + "                            ██║     ██║   ██║██║  ██║█████╗  ██╔██╗ ██║██║███████║██║             \n"
                + "                            ██║     ██║   ██║██║  ██║██╔══╝  ██║╚██╗██║██║██╔══██║██║             \n"
                + "                            ╚██████╗╚██████╔╝██████╔╝███████╗██║ ╚████║██║██║  ██║╚██████╗        \n"
                + "                                   ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝ ╚═════╝        ");
        System.out.println("");
        System.out.println("");

        System.out.print("         ▄▀▄   ▄▀▄ █ █ █ ▀█▀   ▄▀  ▄▀▄ █▄ ▄█ ██▀   ▄▀▄ ██▄ ▄▀▄ █ █ ▀█▀   █▀▄ █▀▄ ▄▀▄ ▄▀  █▀▄ ▄▀▄ █▄ ▄█ █▄ ▄█ █ █▄ █ ▄▀ \n"
                + "         █▀█   ▀▄█ ▀▄█ █ █▄▄   ▀▄█ █▀█ █ ▀ █ █▄▄   █▀█ █▄█ ▀▄▀ ▀▄█  █    █▀  █▀▄ ▀▄▀ ▀▄█ █▀▄ █▀█ █ ▀ █ █ ▀ █ █ █ ▀█ ▀▄█");



        System.out.println("");
        System.out.println("");
        System.out.print("                               █▀▄ █▀▄ ██▀ ▄▀▀ ▄▀▀   ▄█   ▀█▀ ▄▀▄   █   ██▀ ▄▀▄ █▀▄ █▄ █\n"
                + "                               █▀  █▀▄ █▄▄ ▄██ ▄██    █    █  ▀▄▀   █▄▄ █▄▄ █▀█ █▀▄ █ ▀█");




        System.out.println("");
        System.out.println("");


        System.out.print("                                                     >");int press = scan.nextInt();

        if (press == 1) {
            String text = "CODENIAC!  an interactive quizz game that helps the new generation of programmers to learn the basics of the Programming. Explore! and adapt to the latest knowledge about programming that this game offers!" +
                    " This game will help you to study Java Language in a fun and interactive way...." +
                    "\n" +
                    "Well then shall we begin??";

            // Split the text into an array of words
            String[] words = text.split(" ");

            // Loop through each word and print it with a delay plus restrict it to 20 words before
            //printing to next line
            for (int i = 0; i < words.length; i++) {
                typeWord(words[i]);
                if ((i + 1) % 20 == 0) {
                    System.out.println();

                }
            }

        }
        else {
            System.out.println("*Invalid input*");
            System.exit(0);

        }

        System.out.println("");
        System.out.println("");

        Scanner scanss = new Scanner(System.in); // Second scanner

        System.out.println("                                               Can you Tell us your Name?");  //getting the user username
        System.out.print("                                                        >");String name = scanss.nextLine();

        System.out.println("                                    In a scale of 1-5 how experience you are in coding?");  //getting the user exp
        System.out.print("                                                        >");int exp = scanss.nextInt();

        System.out.println("                Welcome to the MAIN EVENT TIME! Choose here what kind of topic in the " +
                "field of programming you want to answer the passing score for this quiz game is 3 points, so pick wisely...");

        //if else contain topic about multiple choice string,int and character
        System.out.println("                                                    1.TOPIC: STRING TALES");
        // 1 TO 10 QUESTION
        System.out.println("                                                    2.TOPIC: INT WARS");

        System.out.print("                                                        >");int topic = scanss.nextInt();

            if (topic == 1) {
                Scanner stringscan = new Scanner(System.in);

                //variables
                int score = 0;
                String[] stringans = new String[5];
                //arrays answer sheet for string tales multiple choice
                String[] correctAns = {"B", "B", "A", "B", "B"};

                System.out.println("");
                System.out.println("");
                System.out.println("                                Nice choice for choosing the TOPIC: STRING TALES get ready to learn the " +
                        "\n                                        fundamentals of using string in java. Have Fun!!!");
                System.out.println("");
                System.out.println("");

                System.out.println("1. What is the correct way to create a string object in Java?");
                System.out.println("a) String str = \"Hello\";");
                System.out.println("b) String str = new String(\"Hello\");");
                System.out.println("c) String str = String.create(\"Hello\");");
                System.out.println("d) String str = createString(\"Hello\");");
                stringans[0] = stringscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("2. Which method is used to find the length of a string in Java?");
                System.out.println("a) size()");
                System.out.println("b) length()");
                System.out.println("c) count()");
                System.out.println("d) getSize()");
                stringans[1] = stringscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("3. What is the result of the following code snippet?\n" +
                        "   String str = \"Hello\";\n" +
                        "   System.out.println(str.charAt(2));");
                System.out.println("a) l");
                System.out.println("b) e");
                System.out.println("c) o");
                System.out.println("d) r");
                stringans[2] = stringscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("4. Which method is used to concatenate two strings in Java?");
                System.out.println("a) append()");
                System.out.println("b) concat()");
                System.out.println("c) merge()");
                System.out.println("d) combine()");
                stringans[3] = stringscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("5. What is the output of the following code snippet?\n" +
                        "   String str = \"Hello\";\n" +
                        "   System.out.println(str.substring(1, 3));");
                System.out.println("a) Hel" +
                        "  ");
                System.out.println("b) el");
                System.out.println("c) lo");
                System.out.println("d) ell");
                stringans[4] = stringscan.nextLine();
                System.out.println("");
                System.out.println("");

                //checking answers & adding score
                for (int x = 0; x < 5; x++) {
                    if (stringans[x].equalsIgnoreCase(correctAns[x])) {
                        System.out.println(stringans[x] + " is correct");

                        score++;
                    } else {
                        System.out.println(stringans[x] + " is incorrect");
                    }
                }

                if (score < 3) {


                    System.out.println(" ");
                    System.out.println("                                                    ---REDEMPTION QUESTIONS---");
                    System.out.println("                         Your score is " + score + " which is very low but we would like to give you another chance \n " +
                            "                to try so we're giving you 3 questions that could help you to payback to your lowest scores." +
                            "                                      pls choose among the three ");

                    System.out.println("");
                    System.out.println("                                                   ??? 1.REDEMPTION QUESTION ???");
                    System.out.println("                                                   ??? 2.REDEMPTION QUESTION ???");
                    System.out.println("                                                   ??? 3.REDEMPTION QUESTION ???");


                    //collection of questions
                    boolean flag = true; //repeater
                    while (flag) {
                        System.out.print("                                                        >");int choice = stringscan.nextInt();
                        if (choice == 1) {
                            Scanner scans = new Scanner(System.in);
                            System.out.println("1. Which method is used to find the length of a string in Java?");
                            System.out.println("a) size()");
                            System.out.println("b) length()");
                            System.out.println("c) count()");
                            System.out.println("d) getSize()");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("B")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");

                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");

                            }

                            flag = false;

                        } else if (choice == 2) {
                            Scanner scans = new Scanner(System.in);
                            System.out.println("2. What is the output of the following code snippet?\n" +
                                    "   String str = \"Hello\";\n" +
                                    "   System.out.println(str.substring(1, 3));");
                            System.out.println("a) Hel" +
                                    "  ");
                            System.out.println("b) el");
                            System.out.println("c) lo");
                            System.out.println("d) ell");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("B")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");
                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");
                            }
                            flag = false;

                        } else if (choice == 3) {
                            Scanner scans = new Scanner(System.in);
                            System.out.println("3. Which method is used to concatenate two strings in Java?");
                            System.out.println("a) append()");
                            System.out.println("b) concat()");
                            System.out.println("c) merge()");
                            System.out.println("d) combine()");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("B")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");

                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");
                            }
                            flag = false;

                        } else {
                            System.out.println("Invalid Input");

                        }
                    }

                } else {
                    System.out.print("                                                        ");System.out.println("Your overall score is " + score);
                    System.out.print("                                              ");System.out.println("Congratulations you for passing the game goodluck! ");
                    System.out.print("                                          ");System.out.println("Keep up the great work and continue to challenge yourself.");


                }


            }
            else if (topic == 2) {
                Scanner intscan = new Scanner(System.in);

                //variables
                int score = 0;
                String[] intans = new String[5];
                //arrays answer sheet for string tales multiple choice
                String[] correctAns = {"A", "B", "B", "A", "B"};


                System.out.println("");
                System.out.println("");
                System.out.println("                                Nice choice for choosing the TOPIC: STRING TALES get ready to learn the " +
                        "\n                                        fundamentals of using string in java. Have Fun!!!");
                System.out.println("");
                System.out.println("");

                System.out.println("1.What does INT stand for in INT programming language?");
                System.out.println("a) Integer");
                System.out.println("b) Interactive");
                System.out.println("c) International");
                System.out.println("d) Interpretive");
                intans[0] = intscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("2. Which programming paradigm does INT support?");
                System.out.println("a) Object-oriented");
                System.out.println("b) Procedural");
                System.out.println("c) Functional");
                System.out.println("d) All of the above");
                intans[1] = intscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("3. Which of the following is a reserved keyword in INT?");
                System.out.println("a) var");
                System.out.println("b) int");
                System.out.println("c) Functional");
                System.out.println("d) All of the above");
                intans[2] = intscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("4. How is a single-line comment denoted in INT?");
                System.out.println("a) // This is a comment");
                System.out.println("b) /* This is a comment */");
                System.out.println("c) # This is a comment");
                System.out.println("d) % This is a comment");
                intans[3] = intscan.nextLine();
                System.out.println("");
                System.out.println("");

                System.out.println("5. Which data type is used to represent floating-point numbers in INT?");
                System.out.println("a) int");
                System.out.println("b) float");
                System.out.println("c) double");
                System.out.println("d) real");
                intans[4] = intscan.nextLine();
                System.out.println("");
                System.out.println("");

                //checking answers & adding score
                for (int x = 0; x < 5; x++) {
                    if (intans[x].equalsIgnoreCase(correctAns[x])) {
                        System.out.println(intans[x] + " is correct");

                        score++;
                    } else {
                        System.out.println(intans[x] + " is incorrect");
                    }
                }

                if(score < 3){
                    System.out.println(" ");
                    System.out.println("                                                    ---REDEMPTION QUESTIONS---");
                    System.out.println("                         Your score is " + score + " which is very low but we would like to give you another chance \n " +
                            "                to try so we're giving you 3 questions that could help you to payback to your lowest scores." +
                            "                                      pls choose among the three ");

                    System.out.println("");
                    System.out.println("                                                   ??? 1.REDEMPTION QUESTION ???");
                    System.out.println("                                                   ??? 2.REDEMPTION QUESTION ???");
                    System.out.println("                                                   ??? 3.REDEMPTION QUESTION ???");

                    //collection of questions
                    boolean flag = true; //repeater
                    while (flag) {
                        System.out.print("                                                        >");int choice = intscan.nextInt();
                        if(choice == 1){
                            Scanner scans = new Scanner(System.in);
                            System.out.println("1.Which programming paradigm does INT support?");
                            System.out.println("a) Object-oriented");
                            System.out.println("b) Procedural");
                            System.out.println("c) Functional");
                            System.out.println("d) All of the above");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("B")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");

                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");
                            }

                            flag = false;
                        }
                        if(choice == 2){
                            Scanner scans = new Scanner(System.in);
                            System.out.println("2. Which of the following is NOT a control structure in INT?");
                            System.out.println("a) if-else");
                            System.out.println("b) for loop");
                            System.out.println("c) switch-case");
                            System.out.println("d) class");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("D")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");

                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");

                            }

                            flag = false;
                        }
                        if(choice == 3){
                            Scanner scans = new Scanner(System.in);
                            System.out.println("3. Which file extension is commonly used for INT source code files?");
                            System.out.println("a) .int");
                            System.out.println("b) .cpp");
                            System.out.println("c) .py");
                            System.out.println("d) .java");
                            String remAns = scans.nextLine();
                            if (remAns.equalsIgnoreCase("A")) {
                                score = 5;
                                System.out.println("                                    Good Job for Trying! your score has now been redeem to the score of  " + score
                                        + ". \n                         Thank you For trying CODENIAC: A QUIZ GAME ABOUT PROGRAMMING we hope to see you again soon :>");

                            } else {
                                System.out.println("                                        ░▒█▀▀█░█▀▀▄░▒█▀▄▀█░▒█▀▀▀░░░▒█▀▀▀█░▒█░░▒█░▒█▀▀▀░▒█▀▀▄░█");
                                System.out.println("                                        ░▒█░▄▄▒█▄▄█░▒█▒█▒█░▒█▀▀▀░░░▒█░░▒█░░▒█▒█░░▒█▀▀▀░▒█▄▄▀░▀");
                                System.out.println("                                        ░▒█▄▄▀▒█░▒█░▒█░░▒█░▒█▄▄▄░░░▒█▄▄▄█░░░▀▄▀░░▒█▄▄▄░▒█░▒█░▄");

                            }
                            flag = false;
                        }
                    }

                }

                    else {
                        System.out.print("                                                        ");System.out.println("Your overall score is " + score);
                        System.out.print("                                              ");System.out.println("Congratulations you for passing the game goodluck! ");
                        System.out.print("                                          ");System.out.println("Keep up the great work and continue to challenge yourself.");


                    }

            }
                         else {
                            System.out.println("Invalid Input");

                        }
                    }




    private static void typeWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            // Sleep for 200 milliseconds between each character
            try {
                Thread.sleep(17);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(" "); // Add a space after each word
    }
}