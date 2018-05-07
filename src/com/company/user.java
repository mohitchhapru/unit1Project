package com.company;

import java.util.Scanner;

public class user extends player{
    boolean flag = true;
    @Override
    public void getUserInput(){
        do{
            if(this.flag == false)
                System.out.println("Incorrect Input!");
            System.out.println("Type in 'rock' 'paper' or 'scissors' : \n");
            super.setSelects(new Scanner(System.in).nextLine());
            flag = false;
        }
        while(!super.getSelects().equalsIgnoreCase("rock") && !super.getSelects().equalsIgnoreCase("paper") && !super.getSelects().equalsIgnoreCase("scissors"));
    }
}