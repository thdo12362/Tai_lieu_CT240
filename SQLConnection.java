public abstract class SQLConnection {

    private String dbtype;
    private String host;
    private String port;
    private String database;
    private String user;
    private String passwd;

    public String getDbtype() {
        return dbtype;
    }

    public void setDbtype(String dbtype) {
        this.dbtype = dbtype;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public abstract int connection();

    public abstract int insert(String sqlStr);

    public abstract int update(String sqlStr);

    public abstract int delete(String sqlStr);

    public abstract String select(String sqlStr);
}