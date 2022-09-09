package ru.mish.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int arr_size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[arr_size];
        System.out.print("Значения: ");
        for (int a = 0; a < arr.length; ++a)
        {
            arr[a] = sc.nextInt();
            sum += arr[a];
        }
        System.out.printf(
                "Сумма элементов: %d, ср.а.: %f",
                sum, sum / (float)arr.length
        );
    }
}
