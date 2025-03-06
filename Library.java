import java.util.Scanner;
class Reader {
    // Поля класса Reader
    private String fullName; // ФИО
    private String ticketNumber; // Номер читательского билета
    private String faculty; // Факультет
    private String birthDate; // Дата рождения
    private String phoneNumber; // Телефон

    // Конструктор класса Reader
    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    // Метод для получения ФИО
    public String getFullName() {
        return fullName;
    }

    // Перегрузка метода takeBook() с количеством книг
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    // Перегрузка метода takeBook() с названиями книг
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    // Перегрузка метода returnBook() с количеством возвращаемых книг
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    // Перегрузка метода returnBook() с названиями возвращаемых книг
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
public class Library {
    public class Main {
        public static void main(String[] args) {
            Reader[] readers = new Reader[5];

            readers[0] = new Reader("Петров П. П.", "0001", "Физический", "01.01.2000", "+79001234567");
            readers[1] = new Reader("Сидоров С. С.", "0002", "Математический", "02.02.1970", "+79007654321");
            readers[2] = new Reader("Иванова И. И.", "0003", "Литературный", "03.03.2009", "+79014567890");
            readers[3] = new Reader("Кузнецов К. К.", "0004", "Исторический", "04.04.2002", "+79020123456");
            readers[4] = new Reader("Смирнова С. С.", "0005", "Химический", "05.05.1980", "+79098765432");

            // Примеры использования методов takeBook() и returnBook()
            readers[0].takeBook(3);
            readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
            readers[2].returnBook(2);
            readers[3].returnBook("Приключения", "Словарь", "Энциклопедия");

        }
    }
}



