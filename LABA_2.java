
import java.util.Scanner;
public class LABA_2 {
    public static void main(String[] args) {
        Scanner persik = new Scanner(System.in);

        System.out.print("Введите степень n: ");
        int n = persik.nextInt();

        System.out.print("Введите x: ");
        double x = persik.nextDouble();

        double sum = 0;
        double fact = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                fact *= i;
            }
            double current_Value = Math.pow(-1, i) * Math.pow(x, i) / fact;
            sum += current_Value; // Добавление текущего значения к общей сумме
        }
        sum += 1;
        System.out.print("Сумма ряда: " + sum);
    }
}



