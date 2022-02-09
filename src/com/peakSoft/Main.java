package com.peakSoft;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n************************\n");

        // Programmer Class
        Programmer programmer = new Programmer("Habib Abdukarimov", LocalDate.of(1986, 1, 9),
                "Java Developer", "Google");
        System.out.println(programmer);
        programmer.coding();

        System.out.println("\n************************\n");

        // Dancer Class
        Singer singer = new Singer("Mirbek Atabekov", LocalDate.of(1987, 3, 26),
                "Kyrgyz national artist", "Bul Duyno");
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();

        System.out.println("\n************************\n");

        // Singer Class
        Dancer dancer = new Dancer("Billy Villy", LocalDate.of(1996, 5, 15),
                "Hip Hop Dancer", "Saymaluu Tash");
        System.out.println(dancer);
        dancer.dancing();
    }
}
