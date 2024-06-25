package org.example;

public class Main {
    public static void main(String[] args) {
        var age = 23;
        Variabel t = new Variabel();
        t.setNamaDepan("Agusti Bayu");
        t.setNamaBelakang("Samudro");
        System.out.println("perkenalkan nama saya " + t.getNamaDepan() + " " + t.getNamaBelakang());

        System.out.println("umur saya " + age);
    }
}