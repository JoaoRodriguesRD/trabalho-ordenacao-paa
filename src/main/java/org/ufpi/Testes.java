package org.ufpi;
import org.ufpi.HeapSort;

import java.util.Random;

import org.ufpi.BubbleSort;
import org.ufpi.InsertionSort;
import org.ufpi.MergeSort;
import org.ufpi.HeapSort;
import org.ufpi.QuickSort;

public class Testes {
    public static void main(String[] args) {
        Integer[] numerosOrdC_a  = criarVetor(100);
        Integer[] numerosOrdC_b  = criarVetor(1000);
        Integer[] numerosOrdC_c  = criarVetor(5000);
        Integer[] numerosOrdC_d  = criarVetor(30000);
        Integer[] numerosOrdC_e  = criarVetor(50000);
        Integer[] numerosOrdC_f  = criarVetor(100000);
        Integer[] numerosOrdC_g  = criarVetor(150000);
        Integer[] numerosOrdC_h  = criarVetor(200000);

        Integer[] numerosOrdD_a  = criarVetorDec(100);
        Integer[] numerosOrdD_b  = criarVetorDec(1000);
        Integer[] numerosOrdD_c  = criarVetorDec(5000);
        Integer[] numerosOrdD_d  = criarVetorDec(30000);
        Integer[] numerosOrdD_e  = criarVetorDec(50000);
        Integer[] numerosOrdD_f  = criarVetorDec(100000);
        Integer[] numerosOrdD_g  = criarVetorDec(150000);
        Integer[] numerosOrdD_h  = criarVetorDec(200000);

        Integer[] numerosOrdA_a  = criarVetorAle(100);
        Integer[] numerosOrdA_b  = criarVetorAle(1000);
        Integer[] numerosOrdA_c  = criarVetorAle(5000);
        Integer[] numerosOrdA_d  = criarVetorAle(30000);
        Integer[] numerosOrdA_e  = criarVetorAle(50000);
        Integer[] numerosOrdA_f  = criarVetorAle(100000);
        Integer[] numerosOrdA_g  = criarVetorAle(150000);
        Integer[] numerosOrdA_h  = criarVetorAle(200000);

        System.out.println("Tempo para executar 3 vezes crescente BubbleSort:  " + calcularTempoBubble(numerosOrdC_a));
        System.out.println("Tempo para executar 3 vezes crescente BubbleSort:  " + calcularTempoBubble(numerosOrdC_b));
        System.out.println("Tempo para executar 3 vezes crescente BubbleSort:  " + calcularTempoBubble(numerosOrdC_c));
        System.out.println("Tempo para executar 3 vezes crescente BubbleSort:  " + calcularTempoBubble(numerosOrdC_d));
        
        System.out.println("Tempo para executar 3 vezes decrescente BubbleSort:  " + calcularTempoBubble(numerosOrdD_a));
        System.out.println("Tempo para executar 3 vezes decrescente BubbleSort:  " + calcularTempoBubble(numerosOrdD_b));
        System.out.println("Tempo para executar 3 vezes decrescente BubbleSort:  " + calcularTempoBubble(numerosOrdD_c));
        System.out.println("Tempo para executar 3 vezes decrescente BubbleSort:  " + calcularTempoBubble(numerosOrdD_d));

        System.out.println("Tempo para executar 3 vezes aleatorio BubbleSort:  " + calcularTempoBubble(numerosOrdA_a));
        System.out.println("Tempo para executar 3 vezes aleatorio BubbleSort:  " + calcularTempoBubble(numerosOrdA_b));
        System.out.println("Tempo para executar 3 vezes aleatorio BubbleSort:  " + calcularTempoBubble(numerosOrdA_c));
        System.out.println("Tempo para executar 3 vezes aleatorio BubbleSort:  " + calcularTempoBubble(numerosOrdA_d));


        System.out.println("Tempo para executar 3 vezes crescente HeapSort:    " + calcularTempoHeap(numerosOrdC_a));
        System.out.println("Tempo para executar 3 vezes crescente HeapSort:    " + calcularTempoHeap(numerosOrdC_b));
        System.out.println("Tempo para executar 3 vezes crescente HeapSort:    " + calcularTempoHeap(numerosOrdC_c));
        System.out.println("Tempo para executar 3 vezes crescente HeapSort:    " + calcularTempoHeap(numerosOrdC_d));
        
        System.out.println("Tempo para executar 3 vezes decrescente HeapSort:  " + calcularTempoHeap(numerosOrdD_a));
        System.out.println("Tempo para executar 3 vezes decrescente HeapSort:  " + calcularTempoHeap(numerosOrdD_b));
        System.out.println("Tempo para executar 3 vezes decrescente HeapSort:  " + calcularTempoHeap(numerosOrdD_c));
        System.out.println("Tempo para executar 3 vezes decrescente HeapSort:  " + calcularTempoHeap(numerosOrdD_d));

        System.out.println("Tempo para executar 3 vezes aleatorio HeapSort:    " + calcularTempoHeap(numerosOrdA_a));
        System.out.println("Tempo para executar 3 vezes aleatorio HeapSort:    " + calcularTempoHeap(numerosOrdA_b));
        System.out.println("Tempo para executar 3 vezes aleatorio HeapSort:    " + calcularTempoHeap(numerosOrdA_c));
        System.out.println("Tempo para executar 3 vezes aleatorio HeapSort:    " + calcularTempoHeap(numerosOrdA_d));
        
        System.out.println("Tempo para executar 3 vezes crescente InsertionSort:    " + calcularTempoInsertion(numerosOrdC_a));
        System.out.println("Tempo para executar 3 vezes crescente InsertionSort:    " + calcularTempoInsertion(numerosOrdC_b));
        System.out.println("Tempo para executar 3 vezes crescente InsertionSort:    " + calcularTempoInsertion(numerosOrdC_c));
        System.out.println("Tempo para executar 3 vezes crescente InsertionSort:    " + calcularTempoInsertion(numerosOrdC_d));
        
        System.out.println("Tempo para executar 3 vezes decrescente InsertionSort:  " + calcularTempoInsertion(numerosOrdD_a));
        System.out.println("Tempo para executar 3 vezes decrescente InsertionSort:  " + calcularTempoInsertion(numerosOrdD_b));
        System.out.println("Tempo para executar 3 vezes decrescente InsertionSort:  " + calcularTempoInsertion(numerosOrdD_c));
        System.out.println("Tempo para executar 3 vezes decrescente InsertionSort:  " + calcularTempoInsertion(numerosOrdD_d));

        System.out.println("Tempo para executar 3 vezes aleatorio InsertionSort:    " + calcularTempoInsertion(numerosOrdA_a));
        System.out.println("Tempo para executar 3 vezes aleatorio InsertionSort:    " + calcularTempoInsertion(numerosOrdA_b));
        System.out.println("Tempo para executar 3 vezes aleatorio InsertionSort:    " + calcularTempoInsertion(numerosOrdA_c));
        System.out.println("Tempo para executar 3 vezes aleatorio InsertionSort:    " + calcularTempoInsertion(numerosOrdA_d));
        
        System.out.println("Tempo para executar 3 vezes crescente MergeSort:    " + calcularTempoMerge(numerosOrdC_a));
        System.out.println("Tempo para executar 3 vezes crescente MergeSort:    " + calcularTempoMerge(numerosOrdC_b));
        System.out.println("Tempo para executar 3 vezes crescente MergeSort:    " + calcularTempoMerge(numerosOrdC_c));
        System.out.println("Tempo para executar 3 vezes crescente MergeSort:    " + calcularTempoMerge(numerosOrdC_d));
        
        System.out.println("Tempo para executar 3 vezes decrescente MergeSort:  " + calcularTempoMerge(numerosOrdD_a));
        System.out.println("Tempo para executar 3 vezes decrescente MergeSort:  " + calcularTempoMerge(numerosOrdD_b));
        System.out.println("Tempo para executar 3 vezes decrescente MergeSort:  " + calcularTempoMerge(numerosOrdD_c));
        System.out.println("Tempo para executar 3 vezes decrescente MergeSort:  " + calcularTempoMerge(numerosOrdD_d));

        System.out.println("Tempo para executar 3 vezes aleatorio MergeSort:    " + calcularTempoMerge(numerosOrdA_a));
        System.out.println("Tempo para executar 3 vezes aleatorio MergeSort:    " + calcularTempoMerge(numerosOrdA_b));
        System.out.println("Tempo para executar 3 vezes aleatorio MergeSort:    " + calcularTempoMerge(numerosOrdA_c));
        System.out.println("Tempo para executar 3 vezes aleatorio MergeSort:    " + calcularTempoMerge(numerosOrdA_d));
        
        System.out.println("Tempo para executar 3 vezes crescente QuickSort:  " + calcularTempoQuick(numerosOrdC_a));
        System.out.println("Tempo para executar 3 vezes crescente QuickSort:  " + calcularTempoQuick(numerosOrdC_b));
        System.out.println("Tempo para executar 3 vezes crescente QuickSort:  " + calcularTempoQuick(numerosOrdC_c));
        // System.out.println("Tempo para executar 3 vezes crescente QuickSort:  " + calcularTempoQuick(numerosOrdC_d));
        
        System.out.println("Tempo para executar 3 vezes decrescente QuickSort:  " + calcularTempoQuick(numerosOrdD_a));
        System.out.println("Tempo para executar 3 vezes decrescente QuickSort:  " + calcularTempoQuick(numerosOrdD_b));
        System.out.println("Tempo para executar 3 vezes decrescente QuickSort:  " + calcularTempoQuick(numerosOrdD_c));
        // System.out.println("Tempo para executar 3 vezes decrescente QuickSort:  " + calcularTempoQuick(numerosOrdD_d));

        System.out.println("Tempo para executar 3 vezes aleatorio QuickSort:  " + calcularTempoQuick(numerosOrdA_a));
        System.out.println("Tempo para executar 3 vezes aleatorio QuickSort:  " + calcularTempoQuick(numerosOrdA_b));
        System.out.println("Tempo para executar 3 vezes aleatorio QuickSort:  " + calcularTempoQuick(numerosOrdA_c));
        // System.out.println("Tempo para executar 3 vezes aleatorio QuickSort:  " + calcularTempoQuick(numerosOrdA_d));
        


    }

    private static String calcularTempoBubble(Integer[] numeros) {
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(numeros, numeros.length);
        BubbleSort.bubbleSort(numeros, numeros.length);
        BubbleSort.bubbleSort(numeros, numeros.length);
        long elapsed = System.currentTimeMillis() - start;
        return (System.currentTimeMillis() - start) + " ms";
    }

    private static String calcularTempoHeap(Integer[] numeros) {
        long start = System.currentTimeMillis();
        HeapSort.heapSort(numeros, numeros.length);
        HeapSort.heapSort(numeros, numeros.length);
        HeapSort.heapSort(numeros, numeros.length);
        long elapsed = System.currentTimeMillis() - start;
        return (System.currentTimeMillis() - start) + " ms";
    }

    private static String calcularTempoInsertion(Integer[] numeros) {
        long start = System.currentTimeMillis();
        InsertionSort.insertionSort(numeros, numeros.length);
        InsertionSort.insertionSort(numeros, numeros.length);
        InsertionSort.insertionSort(numeros, numeros.length);
        long elapsed = System.currentTimeMillis() - start;
        return (System.currentTimeMillis() - start) + " ms";
    }

    private static String calcularTempoQuick(Integer[] numeros) {
        long start = System.currentTimeMillis();
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        long elapsed = System.currentTimeMillis() - start;
        return (System.currentTimeMillis() - start) + " ms";
    }

    private static String calcularTempoMerge(Integer[] numeros) {
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(numeros, 0, numeros.length-1);
        MergeSort.mergeSort(numeros, 0, numeros.length-1);
        MergeSort.mergeSort(numeros, 0, numeros.length-1);
        long elapsed = System.currentTimeMillis() - start;
        return (System.currentTimeMillis() - start) + " ms";
    }

    //cria vetor crescente
    public static Integer[] criarVetor(int quantidade){
        Integer[] x = new Integer[quantidade];
        for (int i = 0; i < quantidade; i++) {
            x[i] = i;
        }
        return x;
    }

    //Cria vetor decrescente
    public static Integer[] criarVetorDec(int quantidade){
        Integer[] x = new Integer[quantidade];
        for (int i = quantidade - 1; i >= 0; i--) {
            x[i] = i;
        }
        return x;
    }

    //cria vetor aleatório
    public static Integer[] criarVetorAle(int quantidade){
        Integer[] x = new Integer[quantidade];
        Random r = new Random();
        for (int i = 0; i < quantidade; i++) {
            x[i] = r.nextInt(quantidade);
        }
        return x;
    }
}
