package lesson4.db;

public class PostgresDatabase extends AbstractDatabase {

    public PostgresDatabase(String host, String port, String name) {
        super(host, port, name);
    }

    @Override
    public void connect() {
        String url = host + ":" + port + "/" + name;
        System.out.println("Connected to PostgresDatabase with url " + url);
    }

}
