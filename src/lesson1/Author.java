package lesson1;
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

    public String getAuthorFirstName(){                                 // геттер имени автора
        return this.authorFirstName;
    }

    public String getAuthorLastName(){                                  // геттер фамилии автора
        return this.authorLastName;
    }
}
