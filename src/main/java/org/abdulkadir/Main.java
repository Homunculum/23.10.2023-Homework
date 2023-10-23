package org.abdulkadir;


public class Main {
    public static void main(String[] args) {



        String ortaMetin = "İlginizi çekebilir";
        String altMetin  = " Vade süresi";
        System.out.printf(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;
        String okYonu = "down.svg";
        if (dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan Alanlar", "Mutlu Kredi"};

        for (int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }
    }
}