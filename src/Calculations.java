import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Calculations {

    private int long_wood;
    private int resultWood = 0;
    private ArrayList<Integer> arrayList;
    private int widthWood;

    public Calculations(String longWood,String widhtWood) {
        creatlong(longWood);
        ctradWidthWood(widhtWood);
        arrayList = new ArrayList<>(Config.getWoods());
        reverseArrayLis(arrayList);
        calculat(arrayList);
    }

    private void ctradWidthWood(String width){
        if (width.equals("")){
            JOptionPane.showMessageDialog(null,"Введите привильно ширину доски");
        }
        else {
            widthWood = Integer.parseInt(width);
        }
    }

    private void creatlong(String longWood){
        if (((Config.getWoods().size() == 0) && (longWood.equals(""))) || proverka()){
            JOptionPane.showMessageDialog(null,"Введите привильно длинну мерочной доски");
        }
        else
            long_wood = Integer.parseInt(longWood);
    }

    private boolean proverka(){
        for (int i = 0; i < Config.getWoods().size(); i++) {
            if (Config.getWoods().get(i) > long_wood){
                return false;
            }
        }
        return true;
    }

    private void reverseArrayLis(ArrayList<Integer> arr){//сортирует в меньшую сторону
        Collections.sort(arr, Collections.reverseOrder());
    }

    private void calculat(ArrayList<Integer> arrayList){
        while (arrayList.size() != 0) {
            int prom = arrayList.get(0);
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(prom);
            for (int i = 1; i < arrayList.size(); i++) {
                prom = prom + arrayList.get(i);
                if (prom <= long_wood) {
                    arr.add(arrayList.get(i));
                } else {
                    prom = prom - arrayList.get(i);
                }
            }
            clearArrayList(arrayList, arr);
        }
        otvetMesseger();
    }

    private void otvetMesseger(){
        String str;
        if (widthWood == 100 || widthWood == 150 || widthWood == 200){
            int a = 0;
            switch (widthWood) {
                case 100: a = resultWood / 33;
                break;
                case 150: a = resultWood / 22;
                break;
                case 200: a = resultWood / 16;
                break;
            }
            str = new String("Не обходимо " + resultWood + " досок, длинной " + long_wood + "мм" +"\n"
                    + "Что соствляет " + a + " куб.метров");
        }
        else {
            str = new String("Не обходимо " + resultWood + " досок, длинной " + long_wood + "мм");
        }
        JOptionPane.showMessageDialog(null,str);
    }

    private void clearArrayList(ArrayList<Integer> arrayList, ArrayList<Integer> arr){
        resultWood++;
        System.out.println(Config.getWoods().size());
        for (int i = 0; i < arr.size(); i++) {
            arrayList.remove(arr.get(i));
        }
        System.out.println(Config.getWoods().size());
    }



//    private void test(){
//        System.out.println(Config.getWoods());
//    }
}
