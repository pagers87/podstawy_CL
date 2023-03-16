package org.example;

public class Main {
    public static void main(String[] args) {
        int wiek = 15;

        if (wiek <= 15 )
        {
            System.out.println("Musisz się uczyć");
        }

        else if (wiek >= 18 && wiek <= 65)
        {
            System.out.println("Możesz pracować");
        }
        else if ( wiek >= 65) {
            System.out.println("Możesz iść na emeryturę");
        }

    }
}