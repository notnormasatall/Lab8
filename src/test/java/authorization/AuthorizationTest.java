package authorization;

import db.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization auth;
    Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
        auth = new Authorization();
    }

    @Test
    void authorization() {
        assertTrue(auth.authorize(db));
    }
}