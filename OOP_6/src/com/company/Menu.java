package com.company;


class Menu {

    final String[] ITEM = new String[]{"Протеїновий батончик", "Енергетик 0,5л", "Вода 0,5л", "Протеїновий коктель", "Кофе"};
    final int[] GRN1 = new int[]{15, 25, 10, 35, 15}; //final
    final int RAN = (int) Math.round(Math.random() * 4), RAM = (int) Math.round(Math.random() * 4);//final
    int ranm ,wert;


    //Товари і ціни в кафе
    void cafe() {
        for (int i = 0; i < 5; i++) {
            System.out.println(ITEM[i] + ": " + GRN1[i] + "грн");
        }
    }

    //рандомна скидка
    void skudkaCafe() {
        System.out.println("           Сьогоднішня Акція");
        System.out.print(ITEM[RAN] + " + " + ITEM[RAM] + " = ");
        wert = ((GRN1[RAM]+ GRN1[RAN])/2);
        for (int j=0;j<100;j++){
            ranm = (int) Math.round(Math.random() * 4);
            if (GRN1[ranm]<=wert){
                System.out.println(ITEM[ranm]);
                System.out.println("Ціна: "+(GRN1[RAM]+ GRN1[RAN])+"грн");
                System.out.println("Вигода: "+ GRN1[ranm]+"грн");
                break;
            }
        }
    }

    public int getRAN() {
        return RAN;
    }
}