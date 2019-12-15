package com.company;

import java.util.Scanner;

public class Player extends Person implements Stats{

    protected int step=0;

    public void Stats(){

            System.out.println("-------Stats----------");
            System.out.println("Class: " + classOfPlayer);
            System.out.println("HP: " + hpP);
            System.out.println("Обычный удар: " + hit);
            System.out.println("Cпециальный удар: " + spec);
            System.out.println("Кол-во спец. ударов: " + kolvospec);
            System.out.println("Оборона: " + shield);
            System.out.println("-------Stats----------");




    }


     public void Step() {
        if (hpP<=0) {System.out.println("Вы умерли");
        while (true);}
        if (hpP<10) System.out.println("\n DANGER! У вас только " + hpP +" hp \n");

        System.out.println("Делайте мудрый ход, " + name +'\n' +"-------------------------------------");
        System.out.println ("Menu:");
        System.out.println ("1. Показать статы");
        System.out.println ("2. Щит");
        System.out.println("3. Обычный удар");
        System.out.println("4. Специальный удар" +'\n');
      Scanner in=new Scanner(System.in);

      switch(in.nextInt()){
          case (1):
              Stats();
              System.out.print("Напишите любой символ, чтобы продолжить:");
              new java.util.Scanner(System.in).nextLine();
              Step();
              break;
          case(2):
              step=2;
              hpP+=10;
              System.out.println(name + " вы исцеляетесь на " + 10 +"hp! Теперь у вас " +hpP);
              break;
          case(3):
              step=3;

              hpB= hpB-hit;
              System.out.println(name +" вы наносите боссу " + hit +" урона! Теперь у него " + hpB +" hp");

              break;
          case(4):
              if (kolvospec>0) {
                  step = 4;
                  kolvospec--;
                  hpB-=spec;
                  System.out.println(name +" вы наносите боссу " + spec +" урона! Теперь у него " + hpB +" hp.");
                  System.out.println("Спецударов осталось: " + kolvospec);

              }
              else{
                  System.out.println("Спец. удары закончились. Повторите ход " +'\n'+'\n' );
                  Step();

              }

      }



     }


}
