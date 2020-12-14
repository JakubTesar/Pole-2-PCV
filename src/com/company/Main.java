package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> pole1 = new ArrayList<>();
        ArrayList<Integer> pole2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            pole1.add(random.nextInt(100));
        }
        for (int i = 0; i < 50; i++) {
            pole2.add(random.nextInt(100));
        }

        for (int i = 0; i <150; i++) {
            if (pole1.get(i) == pole2.get(i)){
                System.out.println("Ano jsou stejné");
            } else {
                System.out.println("Ne nejsou stejné");
            }

        }


        for (int i = 0; i < pole1.size(); i++) {
            pole2.set(i, pole1.get(i));
        }
        if (pole1 == pole2){
            System.out.println("Ano jsou stejné");
        } else {
            System.out.println("Ne nejsou stejné");
        }

    }
}
