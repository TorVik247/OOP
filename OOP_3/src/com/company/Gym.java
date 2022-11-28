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

    public void gk(double a ) {
        a = a+20;
        System.out.println(a);
    }
    void recursive(int n){
        if(n>12){
            System.out.println(n);
            return;
        }
        recursive(n+1);
    }




   void skudkaGym(){
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

   void  skudkaGym(int i){
       System.out.println("якщо ти жмеш менше " + i + "кг то ти тюбик");
   }

    void cafe(){
        System.out.println("Зверніться до кафе щоб добрати цю суму грошей");
    }
}