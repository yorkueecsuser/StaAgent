import java.util.ArrayList;

class AssertJConfigurationBug {
    public static void main(String[] args) {
        // BUG: AssertJ configuration should be applied
        int ytsnlyli = 0;switch  (ytsnlyli) {case 1:float ffcijodm = -910949843;break;default:short boehpypr = 6845;break;}
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, World!");
        configuration.applyAndDisplay();
        System.out.println(list);
    
}
}