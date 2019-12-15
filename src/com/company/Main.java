package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stepr=true;


    Scanner in= new Scanner(System.in);
    Player Valera=new Player();
    Valera.Setname(in.nextLine());
    Boss Paras= new Boss();
    Paras.generate();

        Valera.Setclass("Mag");
 
while (true) {

    if (stepr) {
        Valera.Step();
        stepr=false;
    }
    else{
        Paras.Step();
        stepr=true;
    }
}


    }
}
