package ru.mish.lab1;

public class Main {
    public static void main(String[] args)
    {
        float num = 0;
        for (int i = 1; i <= 10; ++i) {
            num += 1f/i;
            System.out.println(num);
        }
    }
}
