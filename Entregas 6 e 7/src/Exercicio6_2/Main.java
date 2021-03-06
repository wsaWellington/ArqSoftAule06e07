package Exercicio6_2;

import java.text.NumberFormat;

public class Main {
	private static final String UNUSED = "unused";
	private static final int NUM = 100000;
	private static final NumberFormat format = NumberFormat.getNumberInstance();
	static {
		format.setMaximumFractionDigits(1);
	}

	private static double[] construirVetor() {
		double[] d = new double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}
	@SuppressWarnings(UNUSED)
	private static void imprimirVetor(double a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(format.format(a[i]) + "; ");
		System.out.println("\n");
	}
	public static void main(String[] args) throws Exception {
		long antes, tempo;
		SelectionSort sort;
		double[] bubbleV, mergeV, quickV, insertionV;

		// Construindo Vetores
		System.out.print("Aguarde um momento: montando vetores. . .\n");
		bubbleV = construirVetor();
		mergeV = bubbleV.clone();
		quickV = bubbleV.clone();
		insertionV = bubbleV.clone();

		//Bubble sort
		sort = new BubbleSort();
		antes = System.currentTimeMillis();
		sort.sort(bubbleV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("BubbleSort (" + tempo + " ms).");
		imprimirVetor(bubbleV);

		//Insertion sort
		sort = new InsertionSort();
		antes = System.currentTimeMillis();
		sort.sort(insertionV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("InsertionSort (" + tempo + " ms).");
		imprimirVetor(insertionV);

		// Merge sort
		sort = new MergeSort();
		antes = System.currentTimeMillis();
		sort.sort(mergeV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("MergeSort (" + tempo + " ms).");
		imprimirVetor(mergeV);

		// Quick sort
		sort = new QuickSort();
		antes = System.currentTimeMillis();
		sort.sort(quickV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("QuickSort (" + tempo + " ms).");
		imprimirVetor(quickV);

		System.out.println("\n----Finalizado!----");
	}
}