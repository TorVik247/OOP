package com.company;


public class Personal {
    private String per1;
    private String per2;
    private String per3;
    String[] item = new String[]{"Протеїновий батончик", "Енергетик 0,5л", "Вода 0,5л", "Протеїновий коктель", "Кофе"};
    int[] grn1 = new int[]{15, 25, 10, 35, 15};


    public void setPer1(String per1) {
        this.per1 = per1;
    }

    public void setPer2(String per2) {
        this.per2 = per2;
    }

    public void setPer3(String per3) {
        this.per3 = per3;
    }

    public void gk(int a ) {
        a = a+20;
        System.out.println(a);
    }



    void bio(){
        System.out.println("Це "+per1+" він фітнес тренер залу ,йому 34");
        System.out.println("Це "+per2+" вона працює в кафе фітнес клуба ,їй 27 ");
        System.out.println("А це їхній начальник "+per3+" він директор ,йому 56");
    }
    int top(Menu qq){
        int q1= qq.ran;
        System.out.print("Рекомендою взяти тобі сьогодні "+item[q1]);
        return q1;
        }
    }
