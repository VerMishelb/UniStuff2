package ru.mish.lab2;

import java.lang.*;
import java.util.Scanner;

public class AuthorTester {
    public static void main(String[] args) {
        String email;

        Author a = new Author("Alexey Alexeyevich", "example@aga.in", 'm');
        System.out.println("Информация: " + a);

        Scanner source = new Scanner(System.in);
        System.out.print("Введите e-mail: ");
        email = source.next();
        a.setEmail(email);
        System.out.println("Новый email = " + a.getEmail());
    }
}
