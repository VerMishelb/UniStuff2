package ru.mish.lab1;

public class Main {
    public static void main(String[] args)
    {
        System.out.printf("Аргументов: %d\n", args.length);
        for (int i = 0; i < args.length; ++i) {
            System.out.printf("%s\n", args[i]);
        }
    }
}
