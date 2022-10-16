package com.company;

public class DogMom {
    final String rasa;
    final String color;
    final int wiek;

    public DogMom(String rasa, String color, int wiek){
        this.rasa = rasa;
        this.color = color;
        this.wiek = wiek;
    }

    protected String getRasa() {
        return rasa;
    }

    protected String getColor() {
        return color;
    }

    protected int getWiek() {
        return wiek;
    }

    protected void Eat(){
        System.out.println("Twoje zwierzę zostało już nakarmione. " +
                "Ale pamiętaj, przed ustaleniem odpowiedniej diety " +
                "należy dokładnie zapoznać się z zaleceniami żywieniowymi dla tej rasy psa.");
    }


}
