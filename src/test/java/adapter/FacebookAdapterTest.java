package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookAdapterTest {
    FacebookUser userFb;
    FacebookAdapter adapterFb;

    @BeforeEach
    void setUp() {
        userFb = new FacebookUser("email", "country", new Date());
        adapterFb = new FacebookAdapter(userFb);
    }

    @Test
    void checkAttributes() {
        assertEquals(userFb.getEmail(), adapterFb.getEmail());
        assertEquals("country", adapterFb.getCountry());
    }
}