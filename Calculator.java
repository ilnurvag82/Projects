public class Calculator {
    // Метод для вычисления y = 3x + 5
    public double PRIMER1(double x) {
        return 3 * x + 5;
    }

    // Метод для вычисления y = (a + b) / (a - b)
    public double PRIMER2(double a, double b) {
        // Предполагается, что a != b
        return (a + b) / (a - b);
    }

    // Метод для вычисления y = (a * x / b)!
    public double PRIMER3(double a, double x, double b) {
        double value = (a * x) / b;
        return factorial((int) value);
    }

    // Метод для вычисления факториала
    private double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public class Main {
        public static void main(String[] args) {
            Calculator calc1 = new Calculator();
            Calculator calc2 = new Calculator();
            Calculator calc3 = new Calculator();

            // Пример использования методов
            double x = 2;
            double a = 8;
            double b = 3;

            // Вычисление первого выражения
            double result1 = calc1.PRIMER1(x);
            System.out.println("Результат выражения 1 (y = 3x + 5) равен" + result1);

            // Вычисление второго выражения
            double result2 = calc2.PRIMER2(a, b);
            System.out.println("Результат выражения 2 (y = (a + b) / (a - b)) равен" + result2);

            // Вычисление третьего выражения
            double result3 = calc3.PRIMER3(a, x, b);
            System.out.println("Результат выражения 3 (y = (a * x / b)!) равен " + result3);
        }
    }
}





