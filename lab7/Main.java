public class Main {
    public static void main(String[] args) {
        Connector mongoConnector = MongoDBConnector.getConnectorInstance();
        mongoConnector.doQuery("A MongoDB query");

        Connector mongoConnector2 = MongoDBConnector.getConnectorInstance();
        mongoConnector2.doQuery("Another MongoDB query");
        System.out.println();

        Connector postgreConnector = PostgreSQLConnector.getConnectorInstance();
        postgreConnector.doQuery("A PostgreSQL query");

        Connector postgreConnector2 = PostgreSQLConnector.getConnectorInstance();
        postgreConnector2.doQuery("Another one PostgreSQL query");

        Connector postgreConnector3 = PostgreSQLConnector.getConnectorInstance();
        postgreConnector3.doQuery("And another one PostgreSQL query");
    }
}