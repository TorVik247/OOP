package com.company;

class NonLogic {

    static class NonLogic1{
        void metrazz() {
            System.out.print("Java");
        }


    }

    static class dva extends NonLogic1{
        void metrazz () {
            System.out.println("Python");
        }
    }


    static final class tru extends dva {         //final
        public final void metrazz () {                   //final
            System.out.println("C#");
        }
    }
    /*
    public static class cture extends tru{//помилка         Реалізувати спробу наслідування від класу «final» та перевизначення методу «final».
        cture(String Name) {
            super(Name);
        }
        @Override
        public void mettru() {//помилка                   //final
            zarplata=zarplata+6554;
            metraz();
            System.out.println(zarplata+" грн");
        }
    }*/
}