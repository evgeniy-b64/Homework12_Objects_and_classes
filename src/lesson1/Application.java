package lesson1;

public class Application {
    public static void main(String[] args) {
        Author pratchett = new Author("Терри", "Пратчетт");
        Book pyramids = new Book(pratchett, "Пирамиды", 1989);

        Author pelevin = new Author("Виктор", "Пелевин");
        Book chisla = new Book(pelevin, "Числа", 2003);

        viewBookInfo(pelevin, chisla);
        viewBookInfo(pratchett, pyramids);
        pyramids.setPublishingYear(1993);
        viewBookInfo(pratchett, pyramids);
    }

    public static void viewBookInfo (Author author, Book book){
        System.out.println("Автор: "+author.getAuthorFirstName() + " " + author.getAuthorLastName());
        System.out.println("Название книги: "+book.getBookName());
        System.out.println("Год издания: " + book.getPublishingYear());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
