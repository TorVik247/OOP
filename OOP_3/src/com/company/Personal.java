package com.company;


class Personal {
    private String per1;
    private String per2;
    private String per3;

    String[] item = new String[]{"Протеїновий батончик", "Енергетик 0,5л", "Вода 0,5л", "Протеїновий коктель", "Кофе"};
    final int[] GRN1 = new int[]{15, 25, 10, 35, 15}; //final

    private String[] item = new String[]{"Протеїновий батончик", "Енергетик 0,5л", "Вода 0,5л", "Протеїновий коктель", "Кофе"};
    private int[] grn1 = new int[]{15, 25, 10, 35, 15};



    void setPer1(String per1) {
        this.per1 = per1;
    }

    void setPer2(String per2) {
        this.per2 = per2;
    }

    void setPer3(String per3) {
        this.per3 = per3;
    }

    int gk(int a ) {
        a = a+20;
        System.out.print(a);
        System.out.print(" kg ");
        return a;
    }
    public void setgk(int a){
        a = (20+a)*2;
        System.out.print(a);
        System.out.println(" kg");
    }


    void bio(){
        System.out.println("Це "+per1+" він фітнес тренер залу ,йому 34");
        System.out.println("Це "+per2+" вона працює в кафе фітнес клуба ,їй 27 ");
        System.out.println("А це їхній начальник "+per3+" він директор ,йому 56");
    }
    int top(Menu qq){
        int q1= qq.getran();
        System.out.print("Рекомендою взяти тобі сьогодні "+item[q1]);
        return q1;
        }
    }
