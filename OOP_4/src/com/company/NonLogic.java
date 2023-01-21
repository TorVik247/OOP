package com.company;

class NonLogic {
    static public class raz {
        void metraz () {
            System.out.println("method one1 ");
        }
    }

    static public class dva extends raz {
        void mdva () {
            metraz();
            System.out.println("method two2 ");
        }
    }

    static public class tru extends dva {
        void mettru () {
            metraz();
            System.out.println("method three3 ");
        }
    }
}
