package org.ufpi;

import java.util.Arrays;

public class QuickSort {
    private static int iterCount = 0;

    public static void main(String[] args) {
        int[] numeros = {12, 11, 13, 5, 6, 7, 1, 3};
        System.out.println("iteracoes " + quickSort(numeros, 0, numeros.length-1));
    }

    public static int quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi é o índice da particion
            int pi = partition(arr, low, high);
            iterCount++;
            // Recursivamente ordenar elementos antes e depois
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        
        return iterCount;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index do menor elemento
        for (int j = low; j < high; j++) {
            // Se o elemento atual é menor ou igual ao pivot
            if (arr[j] <= pivot) {
                i++;
                // Troca
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
