import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {//автоматичне закриття сканеру
            
            System.out.print("Введіть значення n (n ≤ 200): ");
            int n = scanner.nextInt();

            
            if (n > 200 || n <= 0) {
                System.out.println("Некоректне значення n!");
                return;
            }

           
            double[] A = new double[2 * n];

            
            System.out.println("Введіть елементи массива A довжиною " + (2 * n) + ":");
            for (int i = 0; i < 2 * n; i++) {
                A[i] = scanner.nextDouble();
                
            }

            
            double sumFirstHalf = 0;
            for (int i = 0; i < n; i++) {
                sumFirstHalf += A[i];
            }
            double average = sumFirstHalf / n;

            
            double sumGreaterThanAverage = 0;
            for (int i = n; i < 2 * n; i++) {
                if (A[i] > average) {
                    sumGreaterThanAverage += A[i];
                }
            }

            
            System.out.println("Сумма елементів, які більше середнього: " + sumGreaterThanAverage);
        }
    }
}
