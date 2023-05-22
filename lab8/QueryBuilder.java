public interface QueryBuilder {
    QueryBuilder setSelect(String selectValue);
    QueryBuilder setWhere(String whereValue);
    QueryBuilder setLimit(int limitValue);
    String getSQL();
}