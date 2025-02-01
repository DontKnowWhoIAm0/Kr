package lab;

import java.util.Random;

public class ConstructionSimulation {
    static Random random = new Random();

    public static void main(String[] args) {
        int successCount = 0;


        for (int i = 0; i < 1000; i++) {
            try {
                Construction construction = new Construction((random.nextInt(5) + 1) * 1000, (random.nextInt(10) + 10) * 1000, (random.nextInt(20) + 10) * 1000, (random.nextInt(5) + 10) * 1000, (random.nextInt(15) + 10) * 1000, generateDate(), generateDate());
                construction.startConstruction();
                successCount++;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        System.out.println("Вероятность успешного завершения: " + (successCount / (double) 1000) * 100 + "%");
    }

    public static String generateDate() {
        int day = random.nextInt(37) + 1;
        int month = random.nextInt(17) + 1;
        String date = "";
        if (day < 10) {
            date += "0" + day + ".";
        } else {
            date += day + ".";
        }
        if (month < 10) {
            date += "0" + month + ".";
        } else {
            date += month + ".";
        }
        date += "2025";
        return date;
    }
}
