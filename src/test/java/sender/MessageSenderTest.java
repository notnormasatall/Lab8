package sender;

import adapter.FacebookAdapter;
import adapter.TwitterAdapter;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    TwitterAdapter twUser;
    FacebookAdapter fbUser;
    MessageSender sender;

    @BeforeEach
    void setUp() {
        twUser = new TwitterAdapter(new TwitterUser("email", "country", new Date()));
        fbUser = new FacebookAdapter(new FacebookUser("email", "country1", new Date()));
        sender = new MessageSender();
    }

    @Test
    void testSender() {
        assertTrue(sender.send("message", twUser, "country"));
        assertFalse(sender.send("message", fbUser, "country"));
    }
}