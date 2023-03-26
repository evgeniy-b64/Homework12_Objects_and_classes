package lesson1;

/*
Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
Напишите конструкторы, заполняющие все поля.
Создайте геттеры для всех полей.
Создайте сеттер для поля «Год публикации».
 */
public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    // конструктор Book
    public Book(Author authorName, String bookName, int publishingYear){
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public void setPublishingYear(int year) {          // сеттер года публикации
        this.publishingYear = year;
    }

    public Author getAuthorName(){                      // геттер имени автора
        return this.authorName;
    }

    public String getBookName(){                        // геттер названия книги
        return this.bookName;
    }
    public int getPublishingYear(){                     // геттер года публикации
        return this.publishingYear;
    }
}

