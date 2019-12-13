package com.company;

import java.util.Scanner;

public class FightPerson extends Person implements Stats{

    protected int step=0;

    public void Stats(){

            System.out.println("-------Stats----------");
            System.out.println("HP: " + hpP);
            System.out.println("Обычный удар: " + hit);
            System.out.println("Cпециальный удар: " + spec);
            System.out.println("Кол-во спец. ударов: " + kolvospec);
            System.out.println("Оборона: " + shield);
            System.out.println("-------Stats----------");




    }


     public void Step() {
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
              break;
          case(2):
              step=2;
              hpP+=10;
              break;
          case(3):
              step=3;

              hpB= hpB-hit;
              System.out.println("У босса осталось: " +hpB);
              break;
          case(4):
              if (kolvospec>0) {
                  step = 4;
                  kolvospec--;
                  hpB-=spec;
                  System.out.println("У босса осталось: " +hpB);
              }
              else{
                  System.out.println("Спец. удары закончились. Повторите ход " +'\n'+'\n' );
                  Step();

              }

      }



    }


}
