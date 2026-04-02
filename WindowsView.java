import javax.swing.JPanel;

public class WindowsView implements IoTView {
    @Override
    public JPanel createView() {
        return new JPanel();
    }

    @Override
    public void displayData(String valueStr) {
        System.out.println("Windows: " + valueStr);
    }
}