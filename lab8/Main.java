public class Main {
    public static void main(String[] args) {
        QueryBuilder postgreSQLBuilder = new PostgreSQLQueryBuilder();
        String query1 = postgreSQLBuilder.setSelect("name, password").setWhere("users").setLimit(10).getSQL();
        System.out.println(query1);

        QueryBuilder mySQLBuilder = new MySQLQueryBuilder();
        String query2 = mySQLBuilder.setSelect("title, quantity, price").setWhere("products").setLimit(50).getSQL();
        System.out.println(query2);
    }
}