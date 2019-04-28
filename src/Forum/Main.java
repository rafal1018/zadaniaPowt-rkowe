package Forum;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Forum admin = new Admin("Marian", "admin");
        Forum user = new User("WIesław", "user");
        Forum moderator = new Moderator("Grzegorz", "moderator");

        List<Forum> list = new ArrayList<>();

        list.add(admin);
        list.add(user);
        list.add(moderator);

        for (Forum f : list){
            f.introduceYourself();
        }
    }
}
