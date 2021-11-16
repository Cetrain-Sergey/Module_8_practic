import java.util.*;

public class Main {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();

        for(int i = 1;i <= 10;i++) {
            System.out.println("Случайное число №" + i + ": " + (int)(Math.random() * 10));
        }

        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
    }
}