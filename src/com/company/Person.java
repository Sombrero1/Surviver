package com.company;

public class Person extends Fight {
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

    }




