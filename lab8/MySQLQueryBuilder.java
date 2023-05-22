public class MySQLQueryBuilder implements QueryBuilder {
    private String select;
    private String where;
    private int limit;

    @Override
    public QueryBuilder setSelect(String selectValue) {
        this.select = selectValue;
        return this;
    }

    @Override
    public QueryBuilder setWhere(String whereValue) {
        this.where = whereValue;
        return this;
    }

    @Override
    public QueryBuilder setLimit(int limitValue) {
        this.limit = limitValue;
        return this;
    }

    @Override
    public String getSQL() {
        return String.format("MySQL: SELECT %s FROM %s LIMIT %d", select, where, limit);
    }
}