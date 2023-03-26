package lesson1;

import java.util.Objects;

/*
Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
Напишите конструкторы, заполняющие все поля.
Создайте геттеры для всех полей.
 */
public class Author {
    private String authorFirstName;
    private String authorLastName;

    public Author(String authorFirstName, String authorLastName) {      // конструктор класса Author
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {                                 // геттер имени автора
        return this.authorFirstName;
    }

    public String getAuthorLastName() {                                  // геттер фамилии автора
        return this.authorLastName;
    }

    @Override
    public String toString() {
        return authorFirstName + ' ' + authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName);
    }
}
