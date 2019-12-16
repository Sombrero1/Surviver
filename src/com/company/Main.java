package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stepr=true;

        Fight Fight1= new Fight();
        Fight.Boss Paras= Fight1.new Boss();

        Fight.Player Valera = Fight1.new Player();

        Scanner in= new Scanner(System.in);
        System.out.println("Путник, скажи своё имя...");
        Valera.Setname(in.nextLine());

        Paras.generate();
        System.out.println();
        System.out.println("Нас настигла беда... Ужасный "+ Paras.vid +" уничтожает всё живое вокруг... На тебя вся надежда");

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

    /*Scanner in= new Scanner(System.in);
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

*/
    }
}
