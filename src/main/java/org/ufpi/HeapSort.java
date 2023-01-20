package org.ufpi;

public class HeapSort {
    private static int iterCount = 0;
    public static void main(String[] args) {
        Integer[] numeros = { 9, 6, 3, 5, 8, 4, 8, 6 };
        System.out.println("iteracoes " + heapSort(numeros, numeros.length));
    }

    public static int heapSort(Integer[] arr, int n) {

        // Construir o heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extrair um elemento por vez do heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return iterCount;
    }

    private static void heapify(Integer[] arr, int n, int i) {
        iterCount++;
        int largest = i; // Inicializa como raiz
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // Se o filho da esquerda for maior que a raiz
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // Se o filho da direita for maior que a raiz
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // Se não for a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
