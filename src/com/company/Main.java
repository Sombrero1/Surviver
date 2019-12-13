package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    FightPerson Valera=new FightPerson();
    Valera.Setname(in.nextLine());

 

    Valera.Setclass("Mag");

    Valera.Step();


    }
}
