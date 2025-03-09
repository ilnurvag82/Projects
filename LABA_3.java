public class LABA_3 {
    public static void main(String[] args) {
        int[] array = {4, 0, 3, 0, 7, 0, 1, 0, 9, 10, 0, 15, 0, 0, 20, 0, 25, 0, 30, 0};

        // Выводим оригинальный массив
        System.out.println("Исходный массив: ");
        printArray(array);

        // Сортируем массив с удалением нулей
        int newSize = removeZeros(array);

        // Выводим упорядоченный массив
        System.out.println("Упорядоченный массив без нулей: ");
        printArray(array, newSize);
    }

    // Метод для удаления нулей и сдвига ненулевых элементов влево
    private static int removeZeros(int[] array) {
        int n = array.length;
        int count = 0;

        // Перебираем все элементы массива
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) { // Если текущий элемент не ноль
                array[count++] = array[i]; // Сдвигаем ненулевой элемент влево
            }
        }

        // Заполняем оставшуюся часть массива нулями
        while (count < n) {
            array[count++] = 0; // Заполняем оставшиеся позиции нулями
        }

        return count; // Возвращаем новое количество ненулевых элементов
    }

    // Метод для вывода массива
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " "); // Печатаем каждый элемент массива
        }
        System.out.println(); // Переход на новую строку
    }

    // Перегрузка метода для вывода не нулевых элементов
    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Печатаем каждый ненулевой элемент массива
        }
        System.out.println(); // Переход на новую строку
    }
}




