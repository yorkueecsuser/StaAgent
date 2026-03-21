import java.util.ArrayList;

class AssertJConfigurationBug {
    public static void main(String[] args) {
        // BUG: AssertJ configuration should be applied
        for  (int lypyxrnm = 0; lypyxrnm < 0; lypyxrnm++) {short owtcybkp = 8246;}
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, World!");
        configuration.applyAndDisplay();
        System.out.println(list);
    
}
}