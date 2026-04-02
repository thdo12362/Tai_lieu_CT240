import javax.swing.JPanel;

public class IOSView implements IoTView {

    @Override
    public JPanel createView() {
        // Cài đặt tạo cửa sổ hiển thị cho nền tảng iOS [cite: 116]
        return new JPanel();
    }

    @Override
    public void displayData(String valueStr) {
        // Cài đặt hiển thị dữ liệu theo định dạng JSON cho iOS [cite: 117]
        System.out.println("iOS Display JSON: " + valueStr);
    }
}