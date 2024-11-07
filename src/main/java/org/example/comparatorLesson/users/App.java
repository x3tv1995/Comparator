package org.example.comparatorLesson.users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<User> users = new ArrayList<>();

        // Добавление пользователей в список
        users.add(new User("Алексей", 25));
        users.add(new User("Екатерина", 30));
        users.add(new User("Лика", 23));
        users.add(new User("Артём", 30));
        users.add(new User("Мария", 28));


        Comparator <User> comparatorName = Comparator.comparing(User::getAge).thenComparing(User::getName);
        Collections.sort(users,comparatorName);

        // Вывод списка пользователей
        for (User  user : users) {
            System.out.println(user);
        }






    }
}
