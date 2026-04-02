import javax.swing.JPanel;

public interface IoTView {
    public JPanel createView();

    public void displayData(String valueStr);
}