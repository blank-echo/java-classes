package lesson4.db;

public class Main {
    public static void main(String[] args) {
        AbstractDatabase abstractDatabase;

        if (args[0].equals("postgres")) {
            abstractDatabase = new PostgresDatabase("192.22.22.22", "5432",
                    "myDb");
        } else if (args[0].equals("oracle")) {
            abstractDatabase = new OracleDatabase("11.11.1.1", "7766",
                    "myOracleDb");
        } else {
            abstractDatabase = new H2Database("55.55.55.55", "7766",
                    "myOracleDb");
        }

        abstractDatabase.connect();


    }
}
