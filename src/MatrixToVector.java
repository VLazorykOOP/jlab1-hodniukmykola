import java.util.Scanner;

public class MatrixToVector {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            
            System.out.print("Введите значение n (n ≤ 20): ");
            int n = scanner.nextInt();

            
            if (n > 20 || n <= 0) {
                System.out.println("Некорректное значение n!");
                return;
            }

            
            double[][] A = new double[n][n];
            
            
            double[] B = new double[n];

            
            System.out.println("Введите элементы матрицы A размером " + n + "x" + n + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = scanner.nextDouble();
                }
            }

            
            for (int i = 0; i < n; i++) {
                double rowSum = 0;
                for (int j = 0; j < n; j++) {
                    rowSum += A[i][j];
                }
                B[i] = rowSum / n;  
            }

            
            System.out.println("Вектор B, где каждая координата является средним арифметическим элементов строк матрицы A:");
            for (int i = 0; i < n; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
        }
    }
}
