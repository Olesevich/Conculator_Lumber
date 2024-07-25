public class Counts {

    private int name_wood = 0;
    private int kol_wood = 0;

    public Counts(String nameWood, String kolWood) {
        dataRecepions(nameWood, kolWood);
        quantification();
    }

    private int parsetInt(String str){
        if (str.equals("")){
            return 1;
        }
        else {
            return Integer.parseInt(str);
        }
    }

    private void dataRecepions(String nameWood, String kolWood){
        name_wood = parsetInt(nameWood);
        kol_wood = parsetInt(kolWood);
    }

    private void quantification(){
        if (kol_wood == 1){
            addArrayList();
        }
        else {
            for (int i = 0; i < kol_wood; i++) {
                addArrayList();
            }
        }
    }
    
    private void addArrayList(){
        Config.setWoods(name_wood);
        WorkPanel.comboBox.addItem(name_wood);
    }

}
