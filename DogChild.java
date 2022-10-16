package com.company;

public class DogChild extends DogDad {

    private String spacer;
    final String name;

    public DogChild(String rasa, String color, int wiek, String charakter, String inteligencja, String name) {
        super(rasa, color, wiek, charakter, inteligencja);
        this.name = name;
    }

    public void setSpacer(String spacer){
        this.spacer = spacer.trim();
    }

    public void Spacer(){
        if (spacer.equalsIgnoreCase("Tak")) {
            System.out.println("\nMiłego spaceru! Bądź szczególnie ostrożny na pierwszych spacerach, aby Twój pies nie uciekł.");
        }
        else {
            System.out.println("\nNawet jeśli nie wybierasz się teraz na spacer, nie zapomnij wyprowadzać psa dwa razy dziennie.");
        }
    }

    public void Vyvod() {
        System.out.println("\nOgólna informacja o " + name + ":\n");
        Info();
        Spacer();
    }

}
