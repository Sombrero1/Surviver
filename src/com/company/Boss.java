package com.company;

public class Boss extends Fight implements Stats {

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



    }

    @Override
    public void Step(){

        if (hpB<=0){System.out.println("Поздравляем! Вы победили! ");
        while(true);
        }

        attack=(int)(Math.random()*10%10);



        if (attack>=3){
            System.out.println();
            hpP-=hit;
            System.out.println(vid + " наносит по вам удар, который отнимает " + hit +" hp");


        }
        else {
            hpB+=5;
            System.out.println();
            System.out.println(vid + " решает полечить себя на " + 5 +" hp");
            System.out.println("Теперь у него " + hpB + "hp");


        }


            System.out.println();
            System.out.println(vid +" внимательно смотрит на вас");
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
               hit=10;
               break;
       }
   }


    }

