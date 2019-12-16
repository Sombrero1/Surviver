package com.company;

import java.util.Scanner;

public class Fight {
   protected static int hpP=100;
   protected static int hpB=100;

   public class Boss {

      protected int boss=0;
      protected int attack=0; // переключение
      protected String vid;
      protected int hit=5;

      public void Stats(){
         System.out.println (vid +" и не хочет попытаться расслабиться");

         System.out.println("-------Stats__of__Boss " +vid  +" ----------");
         System.out.println("HP: " + hpB);
         System.out.println("Обычный удар: " + hit);
         System.out.println("-------Stats----------");

//f

      }


      public void Step(){

         if (hpB<=0){System.out.println("Поздравляем! Вы победили! ");
            while(true);
         }

         attack=(int)(Math.random()*10%10);


         if (attack==0)System.out.println(vid +" наносит удар..... Но промазывает");
         else
         if (attack>=3){
            System.out.println();
            hpP-=hit;
            System.out.println(vid + " наносит по вам удар, который отнимает " + hit +" hp");


         }
         else  {
            hpB+=5;
            System.out.println();
            System.out.println(vid + " решает полечить себя на " + 5 +" hp");
            System.out.println("Теперь у него " + hpB + "hp");


         }


         System.out.println();
         if (attack>=2)
            System.out.println(vid +" внимательно смотрит на вас");
         else System.out.println(vid + " ждёт вашего хода");
         System.out.println();


      }




      void generate() {
         while (true){
            boss=(int)(Math.random()*10%10);
            if (boss<=1) break;
         }

         switch (boss){
            case (0):
               vid="Dzerd";
               hpB=100;
               hit=5;
               break;
            case (1):
               vid ="Berg";
               hpB=70;
               hit=7;
               break;
         }
      }




   }



   public class Player{

      protected String name="Player";
      protected String classOfPlayer="Default";
      protected int hit = 50;
      protected int spec=0;
      protected int kolvospec=0;
      protected int shield=3;

      public void Setname(String name){
         this.name=name;
         System.out.println ("Теперь ваше имя: " + name);
      }





      public void Setclass(String classOfPlayer){
         this.classOfPlayer=classOfPlayer;
         switch (classOfPlayer){
            case ("Mag"):
               hpP=20;
               hit=3;
               spec=15;
               kolvospec=5;
               shield=2;


               break;
            case ("Bower"):
               hpP = 25;
               hit = 30;
               spec = 12;
               kolvospec = 10;
               shield = 2;
               break;

            case ("Sworder"):
               hpP=30;
               hit=40;
               spec=20;
               kolvospec=30;
               shield=5;
               break;
            default:
               System.out.println("Класс default");

         }


      }




      protected int step=0;
      private int g=0; // спец. удар

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
         System.out.println ("2. Хил");
         System.out.println("3. Обычный удар");
         System.out.println("4. Специальный удар" +'\n');
         Scanner in=new Scanner(System.in);
         if (g%8==0) kolvospec++;
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
               g++;
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

}
