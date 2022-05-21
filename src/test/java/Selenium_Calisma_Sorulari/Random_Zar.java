package Selenium_Calisma_Sorulari;

import java.util.Random;

public class Random_Zar {
    public static void main(String[] args) {
        System.out.println("randomZar() = " + randomZar(6));
    }

    public static int randomZar(int x) {
        Random rnd = new Random();
        int zar = rnd.nextInt(6);
        return ++zar;
    }
}
