package com.company;


public class Menu {
    String[] item = new String[]{"Протеїновий батончик", "Енергетик 0,5л", "Вода 0,5л", "Протеїновий коктель", "Кофе"};
    int[] grn1 = new int[]{15, 25, 10, 35, 15};
    int ran = (int) Math.round(Math.random() * 4),ram = (int) Math.round(Math.random() * 4),ranm ,wert;


    //Товари і ціни в кафе
    void cafe() {
        for (int i = 0; i < 5; i++) {
            System.out.println(item[i] + ": " + grn1[i] + "грн");
        }
    }

    //рандомна скидка
    void skudkaCafe() {
        System.out.println("           Сьогоднішня Акція");
        System.out.print(item[ran] + " + " + item[ram] + " = ");
        wert = ((grn1[ram]+grn1[ran])/2);
        for (int j=0;j<100;j++){
            ranm = (int) Math.round(Math.random() * 4);
            if (grn1[ranm]<=wert){
                System.out.println(item[ranm]);
                System.out.println("Ціна: "+(grn1[ram]+grn1[ran])+"грн");
                System.out.println("Вигода: "+grn1[ranm]+"грн");
                break;
            }
        }
    }
}