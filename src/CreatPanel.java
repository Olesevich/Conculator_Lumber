import javax.swing.*;
import java.awt.*;

public class CreatPanel {

    public CreatPanel(JPanel jpanel, int x, int y, int w, int h, Color col) {
        cretPan(jpanel,x,y,w,h, col);
    }

    private void cretPan(JPanel jp, int x, int y, int w, int h, Color col){
        Config.jf.add(jp);
        jp.setLayout(null);
        jp.setBackground(col);
        jp.setBounds(x, y,w,h);
        jp.setVisible(true);
    }

    private void change(int w, int h){
        Config.jf.setSize(w + 14,h + 37);
        Config.jf.setLocationRelativeTo(null);
    }
}

