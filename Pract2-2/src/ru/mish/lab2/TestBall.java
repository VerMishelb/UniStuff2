package ru.mish.lab2;

import java.util.Scanner;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 10);
        System.out.println("ball = " + ball);
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координаты: ");
        x = sc.nextInt();
        y = sc.nextInt();
        ball.setXY(x, y);
        System.out.print("Сдвинуть на: ");
        x = sc.nextInt();
        y = sc.nextInt();
        ball.move(x, y);
        System.out.println("Новые координаты: " + ball);
    }
}
