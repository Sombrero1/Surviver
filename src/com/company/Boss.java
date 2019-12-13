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

        if (bossAttack){
        Stats();
        while (true){
            attack=(int)(Math.random()*10%10);
            if (attack<=1) break;
        }
        if (attack==1){
            hpP-=hit;


        }
        else {
            hpB+=5;

        }
        bossAttack=false;
        }
        else {
            System.out.println();
            System.out.println(vid +" внимательно смотрит на вас");
            System.out.println();
            bossAttack=true;

        }

    };




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

