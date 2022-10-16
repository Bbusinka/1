package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            String e = null;
            System.out.println("Witamy w TopPet! Tutaj możesz wybrać jednego ze zwierząt. \nWprowadź rasę psa: ");
            String a = ProverkaStrok();
            System.out.print("Wprowadź kolor psa(np. czarny / biały / brązowy): "); String b = ProverkaStrok();
            System.out.print("Wpisz wiek psa (1-10): "); int c = Wiek();
            System.out.print("Wpisz charakter psa (spokojny / zabawny): "); String d = ProverkaStrok();
            System.out.print("Wprowadź inteligencję psa ( 1. Słabo wyszkolony;\n\t\t\t\t\t\t\t2. Średnio wyszkolony;\n\t\t\t\t\t\t\t3. W pełni wyszkolony.): ");
            int i = Inteligencja();
            switch (i){
                case 1: {e ="słabo wyszkolony"; break;}
                case 2: {e ="średnio wyszkolony"; break;}
                case 3: {e ="w pełni wyszkolony"; break;}
            }
            System.out.println("Możesz wybrać imię dla psa: "); String n= ProverkaStrok();
            DogChild dog = new DogChild(a,b,c,d,e,n);
            System.out.print("Wybierasz się na spacer z psem? (tak/nie): "); String p = ProverkaStrok();
            dog.setSpacer(p);
            dog.Vyvod();
        }

    private static String ProverkaStrok() {
        Scanner r = new Scanner(System.in);
        String str = r.nextLine();
        if (!str.matches("[a-zA-Z]+")) {
            System.out.println("Nieprawidłowe dane!\n" + "Wprowadź ponownie: ");
            ProverkaStrok();
        }
        return str;
    }

    public static int Wiek(){
        int m;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) { m=sc.nextInt(); if(m<=0 || m>10){
            System.out.println("Wiek jest nieprawidłowy\n" + "Wprowadź ponownie: ");
            m=Wiek();
        }}
        else {System.out.print("Nieprawidłowe dane!\n" + "Wprowadź ponownie: "); m=Wiek();}
        return m;
    }

    public static int Inteligencja(){
        int m;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) { m=sc.nextInt(); if(m<=0 || m>3){
            System.out.println("Inteligencja jest nieprawidłowa\n" + "Wprowadź ponownie: ");
            m=Inteligencja();
        }}
        else {System.out.print("Nieprawidłowe dane!\n" + "Wprowadź ponownie: "); m=Inteligencja();}
        return m;
    }
}
