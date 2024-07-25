import javax.swing.*;
import java.util.ArrayList;

public class Config {

    public static JFrame jf;
    public final static int WIDTH_START = 350;//размеры(ширина) окна при старте игры
    public final static int HEIGH_START = 200;//размеры(высота) окна при старте игры
    public static JPanel jpanel_work = new JPanel();//панель ввода значений
    private static ArrayList<Integer> woods = new ArrayList<>();

    public Config() {
    }

    public static ArrayList<Integer> getWoods() {
        return woods;
    }

    public static void setWoods(int x) {
        Config.woods.add(x);
    }

    public static void setClearWoods(Object str) {
        Config.woods.remove(str);
    }
}
