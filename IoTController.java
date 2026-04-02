public class IoTController {
    private SQLConnection dbConnection;
    private IoTView appView;

    public void setView(IoTView view) {
        this.appView = view;
    }

    public SQLConnection getConnection() {
        return this.dbConnection;
    }

    public void setConnection(SQLConnection sqlConn) {
        this.dbConnection = sqlConn;
    }

    public void display() {
        if (dbConnection != null && appView != null) {
            String data = dbConnection.select("SELECT * FROM table");
            appView.displayData(data);
        }
    }
}