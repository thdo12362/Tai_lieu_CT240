import javax.swing.JPanel;

public class MacOSView implements IoTView {

    @Override
    public JPanel createView() {
        return new JPanel();
    }

    @Override
    public void displayData(String valueStr) {
        System.out.println("MacOS hiển thị JSON: " + valueStr);
    }
}