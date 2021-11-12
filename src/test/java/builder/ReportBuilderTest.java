package builder;

import db.Database;
import db.БазаДаних;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
    }

    @Test
    void getUserData() {
        assertEquals("hello", db.getUserData());
    }

    @Test
    void getStatisticalData() {
        assertEquals("hello2", db.getStatisticalData());
    }
}