package com.company;

public class History {
    String p1Selection, p2, p2Selection;
    int winner;

    public History(String p1Selection, String p2Selection, String p2, int winner){
        this.p1Selection = p1Selection;
        this.p2 = p2;
        this.p2Selection = p2Selection;
        this.winner = winner;
    }

    public void print(){
        if(this.winner == 0){
            System.out.println("TIE: Player 1-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection);
        }
        else if(this.winner == 1){
            System.out.println("WIN: Player 1-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection);
        }
        else{
            System.out.println("LOSS: Player 1-"+this.p1Selection+" "+ this.p2 +"-"+this.p2Selection);
        }
    }
}