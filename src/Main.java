import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // Метод для вычисления числа Фибоначчи
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Индекс числа Фибоначчи, которое мы хотим вычислить

        // Вычисляем число Фибоначчи
        int fibonacciNumber = calculateFibonacci(n);

        // Создаем файл для записи числа Фибоначчи
        try {
            FileWriter writer = new FileWriter("fibonacci.txt");
            writer.write("Число Фибоначчи для индекса " + n + " равно: " + fibonacciNumber);
            writer.close();
            System.out.println("Число Фибоначчи успешно записано в файл fibonacci.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
