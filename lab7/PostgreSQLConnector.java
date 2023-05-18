public class PostgreSQLConnector implements Connector {
    private static Connector connectorInstance;

    private PostgreSQLConnector() {
        System.out.println(PostgreSQLConnector.class.getName() + " created.");
    }

    @Override
    public void doQuery(String statement) {
        System.out.println("Query executed in " + PostgreSQLConnector.class.getName() + ": " + statement);
    }

    public static Connector getConnectorInstance() {
        if (connectorInstance == null) {
            synchronized (PostgreSQLConnector.class) {
                if (connectorInstance == null) { connectorInstance = new PostgreSQLConnector(); }
            }
        }
        return connectorInstance;
    }
}