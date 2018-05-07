package com.company;

public class rock_paper_scissors {

    /* This function checks the winner among two inputs and returns the winner
    Return 0 if there is a tye
    Return 1 if player 1 is the winner;
    Return 2 if player 2 is the winner;
    Return -1 if there is any issues in input string
    */

    public static int checkWinner(String p1, String p2){
        switch(p1.toLowerCase()){
            case "rock":
                if(p2.equalsIgnoreCase("rock"))
                    return 0;
                else if(p2.equalsIgnoreCase("paper"))
                    return 2;
                else if(p2.equalsIgnoreCase("scissors"))
                    return 1;
                else
                    return -1;
            case "paper":
                if(p2.equalsIgnoreCase("paper"))
                    return 0;
                else if(p2.equalsIgnoreCase("rock"))
                    return 1;
                else if(p2.equalsIgnoreCase("scissors"))
                    return 2;
                else
                    return -1;
            case "scissors":
                if(p2.equalsIgnoreCase("scissors"))
                    return 0;
                else if(p2.equalsIgnoreCase("paper"))
                    return 1;
                else if(p2.equalsIgnoreCase("rock"))
                    return 2;
                else
                    return -1;
            default:
                return -1;
        }
    }
}