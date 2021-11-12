package authorization;

import db.Database;

public class Authorization extends Авторизація{
    public boolean authorize(Database db) {
        return авторизуватися(db);
    }
}
