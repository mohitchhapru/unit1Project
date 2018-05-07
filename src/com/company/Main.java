package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static player getDetails(){
        player tempPlayer = new user();
        tempPlayer.getUserInput();
        return  tempPlayer;
    }

    public static void main(String[] args) {
        ArrayList<History> history = new ArrayList<>();

        int winner;
        player p1,p2;

        String userInput;
	    do{
            System.out.println("\nWelcome to Rock Paper Scissors!\n");
            System.out.println("MAIN MENU\n=====\n");
            System.out.println("1. Play with another user");
            System.out.println("2. Play with computer");
            System.out.println("3. View your game history");
            System.out.println("4. Quit");
            System.out.println("Type option number : \n");
            userInput = new Scanner(System.in).nextLine();

            switch(userInput.toLowerCase()){
                case "1":
                    System.out.println("Player 1 : \n");
                    p1 = getDetails();

                    System.out.println("Player 2 : \n");
                    p2 = getDetails();

                    winner = rock_paper_scissors.checkWinner(p1.getSelects(),p2.getSelects());
                    history.add(new History(p1.getSelects(),p2.getSelects(),"Player 2",winner));

                    System.out.println("Outcome : ");
                    history.get(history.size() - 1).print();
                    System.out.println(" --- \n");

                    break;
                case "2":
                    System.out.println("Player 1 : \n");
                    p1 = getDetails();

                    p2 = new computer();
                    p2.getUserInput();

                    winner = rock_paper_scissors.checkWinner(p1.getSelects(),p2.getSelects());
                    history.add(new History(p1.getSelects(),p2.getSelects(),"Computer",winner));

                    System.out.println("Outcome : ");
                    history.get(history.size() - 1).print();
                    System.out.println(" --- \n");

                    break;
                case "3":
                    System.out.println("\n HISTORY : ");
                    for(int i = 0; i < history.size() ; i++)
                        history.get(i).print();
                    System.out.println("-----------------2");
                    break;
                case "4":
                    System.out.println("Thanks for Playing!");
                    break;
                default:
                    System.out.println("Invalid user input, please enter valid inputs given in menu.\n");
            }
        }while(!(userInput.equalsIgnoreCase("4")));
    }
}