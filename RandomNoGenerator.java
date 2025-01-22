package myPackageFiles;

import java.util.Random;

public class RandomNoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1, max = 100;
        int randomNo = random.nextInt((max - min) + 1) + min;
        System.out.println("Random number between 1 and 100: " + randomNo);
    }
}
