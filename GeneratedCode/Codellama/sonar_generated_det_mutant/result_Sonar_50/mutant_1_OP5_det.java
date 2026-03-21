import java.util.ArrayList;

class AssertJConfigurationBug {
    public static void main(String[] args) {
        // BUG: AssertJ configuration should be applied
        int rpotkdfz = 0;switch  (rpotkdfz) {case 1:String poeyasef = "ykzbasjs";break;default:int qorusjrx = 710076178;break;}
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, World!");
        configuration.applyAndDisplay();
        System.out.println(list);
    
}
}