package com.company;

class NonLogic {
    private String Name;
    private static double zarplata=50000;
    NonLogic(String Name){
        this.Name=Name;
    }
    void metraz () {
        System.out.print(Name+" ");

    }
    public static class dva extends NonLogic {
        dva(String Name) {
            super(Name);
        }
        void mdva () {
            metraz();
            System.out.println(zarplata+" грн");
        }
    }

    public static class tru extends dva {
        tru(String Name) {
            super(Name);
        }
        public void mettru () {
            zarplata=zarplata+20000;
            metraz();
            System.out.println(zarplata+" грн");
        }
    }
}