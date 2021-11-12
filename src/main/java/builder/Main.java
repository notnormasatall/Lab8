package builder;

import authorization.Authorization;
import db.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
