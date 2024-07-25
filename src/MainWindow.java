import javax.swing.*;

public class MainWindow {

    public MainWindow() {
        Config.jf = new JFrame("Конкулятор дерева");
        Config.jf.setSize(Config.WIDTH_START + 14,Config.HEIGH_START + 37);
        Config.jf.setLayout(null);
        Config.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Config.jf.setLocationRelativeTo(null);
        Config.jf.setResizable(false);
        Config.jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Config();
        new MainWindow();
        new WorkPanel();
    }
}
