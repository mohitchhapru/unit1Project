package com.company;

import java.util.Random;

public class computer extends player{
    Random r1 = new Random();

    @Override
    public void getUserInput() {
        int randomNumber = r1.nextInt(3);    /* generating random number */

        System.out.print("Computer Selects : ");
        if (randomNumber == 0) {      /* if random number generated 0 then return "rock" */
            System.out.println("rock\n");
            super.setSelects("rock");
        }
        else if (randomNumber == 1) { /* if random number generated 1 then return "paper" */
            System.out.println("paper\n");
            super.setSelects("paper");
        }
        else {                        /* else return "scissors" */
            System.out.println("scissors\n");
            super.setSelects("scissors");
        }
    }
}