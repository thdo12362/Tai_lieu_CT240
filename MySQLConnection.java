public class MySQLConnection extends SQLConnection {
    @Override
    public int connection() {
        return 0;
    }

    @Override
    public int insert(String sqlStr) {
        return 0;
    }

    @Override
    public int update(String sqlStr) {
        return 0;
    }

    @Override
    public int delete(String sqlStr) {
        return 0;
    }

    @Override
    public String select(String sqlStr) {
        return "{\"data\": \"MySQL JSON result\"}";
    }
}