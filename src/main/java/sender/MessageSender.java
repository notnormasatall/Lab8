package sender;

import adapter.User;
import java.util.Objects;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getDate() != null && Objects.equals(user.getCountry(), country)) {
            System.out.println("message sent");
            return true;
        } else {
            System.out.println("user was not active");
            return false;
        }
    }
}
