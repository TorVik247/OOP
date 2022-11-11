package com.company;


public class Gym {
    String taruf;
    double grn;
    int cil,time,q;

    Gym(String taruf, int cil,double grn ,int time) {
        this.taruf = taruf;
        this.cil = cil;
        this.grn = grn;
        this.time = time;
    }



   void skudka(){
        if (grn>249){
            q =(int) Math.round(Math.random() * 5);
            if (q==0){
                System.out.println("Нажаль ваша знижки складає 0% наступного разу");
            }else {
                System.out.println("Ціна тарифу: "+grn);
                System.out.println("Ваша знижка: "+q*10+"%");
                System.out.println("До оплати: "+(grn-(((grn/100)*(q*10)))));
            }
        }else {
            System.out.println("Ціна тарифу: "+grn);
            System.out.println("Вам не вистачає до знижки ще "+(250-grn)+" грн");
        }
   }

    void cafe(){
        System.out.println("Зверніться до кафе щоб добрати цю суму грошей");
    }
}