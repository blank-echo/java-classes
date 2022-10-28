package lesson4.db;

public class H2Database extends AbstractDatabase {
    public H2Database(String host, String port, String name) {
        super(host, port, name);
    }

    @Override
    public void connect() {
        System.out.println("H2Database");
    }
}
