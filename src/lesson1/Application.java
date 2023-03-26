package lesson1;

// Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
public class Application {
    public static void main(String[] args) {
        Author pratchett = new Author("Терри", "Пратчетт");
        Book pyramids = new Book(pratchett, "Пирамиды", 1989);

        Author pelevin = new Author("Виктор", "Пелевин");
        Book chisla = new Book(pelevin, "Числа", 2003);

        System.out.printf(chisla.toString() + "\n");
        System.out.printf(pyramids.toString() + "\n");
        pyramids.setPublishingYear(1993);
        System.out.printf(pyramids.toString() + "\n");
    }
}
