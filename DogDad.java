package com.company;

public class DogDad extends DogMom {
    final String charakter;
    final String inteligencja;
    public DogDad(String rasa, String color, int wiek, String charakter, String inteligencja) {
        super(rasa,color,wiek);
        this.charakter=charakter;
        this.inteligencja=inteligencja;
    }

    protected void Info(){
        System.out.println( "Rasa psa: "+getRasa()+"\n" +
                            "Kolor psa: "+getColor());
                           if(getWiek()==1) {
                               System.out.println("Wiek psa: "+getWiek()+" rok");}
                           if (getWiek()>1 && getWiek()<5){
                               System.out.println("Wiek psa: "+getWiek() + " lata");}
                           if (getWiek()>=5){
                               System.out.println("Wiek psa: "+getWiek()+" lat"); }
        System.out.println( "Charakter psa: "+ charakter+"\n" +
                            "Inteligencja psa: "+ inteligencja+"\n");
        Eat();
    }
}
