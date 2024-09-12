import java.util.Scanner;

public class ExpressionEvaluator {
    public static double evaluateExpression(double a, double b) {
        
        double numerator = a * b - (a + b) * (a - b);
        
        double denominator = Math.pow(b, 4) + Math.pow(a, 3);
        
        double result = (numerator / denominator) + 5 * b;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

    
        double result = evaluateExpression(a, b);
        
      
        System.out.println("Результат: " + result);
        
        scanner.close();  
    }
}
