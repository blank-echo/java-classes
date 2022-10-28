package lesson4.db;

public class OracleDatabase extends AbstractDatabase {
    public OracleDatabase(String host, String port, String name) {
        super(host, port, name);
    }

    @Override
    public void connect() {
        String url = host + ":" + port + "/" + name;
        System.out.println("Connected to OracleDatabase with url " + url);
    }
}
