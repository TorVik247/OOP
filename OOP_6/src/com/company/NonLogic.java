package com.company;

class NonLogic implements ZarplataTeach {
    private String Name;
    private int zarplata=5000;
    public String getName() {
        return Name;
    }

    NonLogic(){
        this.Name=Name;
    }
    @Override
    public void metraz() {
        System.out.print(Name+"pyton");
    }
    public static class dva extends NonLogic implements ZarplataTeach{
        dva(String Name) {
            super();
        }
        @Override
        public void metraz(){
            System.out.println("top");
        }
    }

    public static class tru extends dva {
        tru(String Name) {
            super(Name);
        }
        @Override
        public void metraz() {
            System.out.println("tip");
        }
    }
}