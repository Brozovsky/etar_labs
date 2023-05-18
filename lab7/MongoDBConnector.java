public class MongoDBConnector implements Connector {
    private static Connector connectorInstance;

    private MongoDBConnector() {
        System.out.println(MongoDBConnector.class.getName() + " created.");
    }

    @Override
    public void doQuery(String statement) {
        System.out.println("Query executed in " + MongoDBConnector.class.getName() + ": " + statement);
    }

    public static Connector getConnectorInstance() {
        if (connectorInstance == null) {
            synchronized (PostgreSQLConnector.class) {
                if (connectorInstance == null) { connectorInstance = new MongoDBConnector(); }
            }
        }
        return connectorInstance;
    }
}