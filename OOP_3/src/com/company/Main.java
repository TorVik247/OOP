package com.company;


public class Main {

    public static void main(String[] args) {
        Personal persona1 = new Personal();
        persona1.setPer1("Володя");
        persona1.setPer2("Елізавета");
        persona1.setPer3("Роман Романович");

        Gym taruf0 = new Gym("Одноразовий",1,35,1);
        Gym taruf1 = new Gym("Малий",5,125,30);
        Gym taruf2 = new Gym("Середній",13,250,30);
        Gym taruf3 = new Gym("Безліміт",100,500,30);
        Menu cafe = new Menu();


        System.out.println("⸻⸻⸻ Фітнес клуб Гачі ⸺⸻⸻⸻");
        //1 тариф
        System.out.println("Тариф: "+taruf0.getTaruf());
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf0.getCil());
        taruf0.skudkaGym();
        taruf0.cafe();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //2 тариф
        System.out.println("Тариф: "+taruf1.getTaruf());
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf1.getCil());
        taruf1.skudkaGym();
        taruf1.cafe();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //3 тариф
        System.out.println("Тариф: "+taruf2.getTaruf());
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf2.getCil());
        taruf2.skudkaGym();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //4 тариф
        System.out.println("Тариф: "+taruf3.getTaruf());
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf3.getCil());
        taruf3.skudkaGym();
        System.out.println("");
        //кафе муччі
        System.out.println("--------------Кафе Муччі--------------");

        cafe.cafe();
        System.out.println("");
        cafe.skudkaCafe();
        System.out.println("");
        //персонал
        System.out.println("-------------Персонал-----------------");;
        persona1.bio();
        System.out.println("");
        persona1.top(cafe);
        System.out.println();
        System.out.print("Тобі потрібно присісти ");
        persona1.gk(5);
        System.out.print("або ");
        taruf1.gk(7.5); //Перевизначити
        System.out.print("також не заюбуваю про свою ціль ");
        persona1.setgk((int) 7.5);
        taruf0.skudkaGym(100); //перевантажити
        System.out.print("в зал потрібно ходити min ");
        taruf0.recursive(0);// рекурсивного методу
        System.out.println("разів за місяць");
    }
}
