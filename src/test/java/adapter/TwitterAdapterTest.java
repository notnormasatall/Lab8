package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAdapterTest {
    TwitterUser userTw;
    TwitterAdapter adapterTw;

    @BeforeEach
    void setUp() {
        userTw = new TwitterUser("email", "country", new Date());
        adapterTw = new TwitterAdapter(userTw);
    }

    @Test
    void checkAttributes() {
        assertEquals(userTw.getUserMail(), adapterTw.getEmail());
        assertEquals("country", adapterTw.getCountry());
    }
}