package lesson4.db;

public abstract class AbstractDatabase {
    protected final String host; //192.15.16.22
    protected final String port; //5432
    protected final String name; //myDatabase

    public AbstractDatabase(String host, String port, String name) {
        this.host = host;
        this.port = port;
        this.name = name;
    }

    public abstract void connect();
}
