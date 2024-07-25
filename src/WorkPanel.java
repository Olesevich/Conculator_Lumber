import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkPanel {

    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private JLabel l3 = new JLabel();
    private JLabel l4 = new JLabel();
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JTextField nameWood = new JTextField();
    private JTextField kolWood = new JTextField();
    private JTextField longWood = new JTextField();
    private JTextField widthWood = new JTextField();
    public static JComboBox comboBox;

    public WorkPanel() {
        new CreatPanel(Config.jpanel_work, 0, 0, Config.WIDTH_START, Config.HEIGH_START, new Color(0,255,255));
        loadButton();
        loadTextField();
        loadJLaben();
        comBox();
    }

    private void loadJLaben(){
        creatJLaben(l1,"Длинна, мм",17,15,70,15,12);
        creatJLaben(l2, "Кол-во.", 185,15,45,15,12);
        creatJLaben(l3,"Длинна мерочной доски, мм:", 7, 150,200, 30, 12);
        creatJLaben(l4,"Ширина, мм", 105,15,70,15, 12);
    }

    private void creatJLaben(JLabel lab, String str, int x, int y, int w, int h, int t){
        lab.setText(str);
        Config.jpanel_work.add(lab);
        lab.setBounds(x, y, w, h);
        lab.setFont(new Font("Times New Roman", Font.BOLD, t));
        lab.setVisible(true);
    }

    private void creatButton(JButton but, String text, int x ,int y, int n){
        but.setText(text);
        Config.jpanel_work.add(but);
        but.setBounds(x, y, 100, 50);
        but.setFont(new Font("Times New Roman", Font.BOLD, 12));
        but.setBackground(new Color(255,255,87));
        but.setFocusable(false);
        but.setVisible(true);
        pushButton(but, n);
    }

    private void loadButton(){
        creatButton(b1, "Добавить",240, 20, 0 );
        creatButton(b2,"Рассчитать", 240,140, 1);
        creatButton(b3, "Удалить",240,80,2);
    }

    private void creatTextField(JTextField jTextField, int x, int y, int w){
        jTextField.setFont(new Font(" ", Font.PLAIN, 18));
        Config.jpanel_work.add(jTextField);
        jTextField.setBounds(x, y,w, 30);
        jTextField.setColumns(10);
    }

    private void loadTextField(){
        creatTextField(nameWood, 10, 30, 80);
        creatTextField(kolWood, 190, 30, 30);
        creatTextField(longWood,175,150,60);
        creatTextField(widthWood,100,30, 80);
    }

    private void comBox(){
        comboBox = new JComboBox();
        comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        comboBox.setBounds(20, 90, 200, 30);
        Config.jpanel_work.add(comboBox);
    }

    private void pushButton(JButton but, int n){
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n == 0){
                    new Counts(nameWood.getText(), kolWood.getText());
                    clearWindow();
                }
                if (n == 1){
                    new Calculations(longWood.getText(), widthWood.getText());
                }
                if (n == 2){
                    clearElemetArrayListUndBomBox();
                }
            }
        });
    }

    private void clearElemetArrayListUndBomBox(){
        comboBox.removeItem(comboBox.getSelectedItem());
        Config.setClearWoods(comboBox.getSelectedItem());
    }

    private void clearWindow(){
        nameWood.setText("");
        kolWood.setText("");
    }

//
//    private void test(){
//        System.out.println(Config.getWoods());
//    }

}
