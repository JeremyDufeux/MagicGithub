package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://robohash.org/1.png"),
            new User("002", "Paul", "https://robohash.org/2.png"),
            new User("003", "Phil", "https://robohash.org/3.png"),
            new User("004", "Guillaume", "https://robohash.org/4.png"),
            new User("005", "Francis", "https://robohash.org/5.png"),
            new User("006", "George", "https://robohash.org/6.png"),
            new User("007", "Louis", "https://robohash.org/7.png"),
            new User("008", "Mateo", "https://robohash.org/8.png"),
            new User("009", "April", "https://robohash.org/9.png"),
            new User("010", "Louise", "https://robohash.org/10.png"),
            new User("011", "Elodie", "https://robohash.org/11.png"),
            new User("012", "Helene", "https://robohash.org/12.png"),
            new User("013", "Fanny", "https://robohash.org/13.png"),
            new User("014", "Laura", "https://robohash.org/14.png"),
            new User("015", "Gertrude", "https://robohash.org/15.png"),
            new User("016", "Chloé", "https://robohash.org/16.png"),
            new User("017", "April", "https://robohash.org/17.png"),
            new User("018", "Marie", "https://robohash.org/18.png"),
            new User("019", "Henri", "https://robohash.org/19.png"),
            new User("020", "Rémi", "https://robohash.org/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://robohash.org/21.png"),
            new User("022", "Geoffrey", "https://robohash.org/22.png"),
            new User("023", "Simon", "https://robohash.org/23.png"),
            new User("024", "André", "https://robohash.org/24.png"),
            new User("025", "Leopold", "https://robohash.org/25.png")
    );
}
