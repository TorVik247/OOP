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
        System.out.println("Тариф: "+taruf0.taruf);
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf0.cil);
        taruf0.skudka();
        taruf0.cafe();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //2 тариф
        System.out.println("Тариф: "+taruf1.taruf);
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf1.cil);
        taruf1.skudka();
        taruf1.cafe();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //3 тариф
        System.out.println("Тариф: "+taruf2.taruf);
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf2.cil);
        taruf2.skudka();

        System.out.println();
        System.out.println("⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻");
        //4 тариф
        System.out.println("Тариф: "+taruf3.taruf);
        System.out.println();
        System.out.println("Кіл. тренувань: "+taruf3.cil);
        taruf3.skudka();
        System.out.println("");
        //кафе муччі
        System.out.println("--------------Кафе Муччі--------------");

        cafe.cafe();
        System.out.println("");
        cafe.skudkaCafe();
        //персонал
        System.out.println("-------------Персонал-----------------");;
        persona1.bio();
        System.out.println("");
        persona1.top(cafe);


    }
}
