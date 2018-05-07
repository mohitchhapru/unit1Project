package com.company;

import java.util.Date;

public class History {
    String p1Selection, p2, p2Selection;
    int winner;
    Date date;

    public History(String p1Selection, String p2Selection, String p2, int winner){
        this.p1Selection = p1Selection;
        this.p2 = p2;
        this.p2Selection = p2Selection;
        this.winner = winner;
        this.date=java.util.Calendar.getInstance().getTime();       // Reference: https://www.javatpoint.com/java-get-current-date
    }

    public void print(){
        if(this.winner == 0){
            System.out.println("TIE: you selected-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection+", on "+ date);
        }
        else if(this.winner == 1){
            System.out.println("You Win: you selected-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection+", on "+ date);
        }
        else{
            System.out.println("You Louse: you selected-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection+", on "+ date);
        }
    }
}