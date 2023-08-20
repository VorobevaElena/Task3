package com.example.task3;

public class Task {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int length = a.length;
        int n=a[length-1];
        a[length-1]=a[0];
        a[0]=n;
        System.out.println("Первый элемент: " + a[0] +" Последний элемент: "+ a[length-1]);
        int sum=a[length-5]+a[length-3];
        System.out.println("Сумма первого и среднего элемента "+ sum);
    }

}
