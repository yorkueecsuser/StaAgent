import java.util.ArrayList;

class AssertJConfigurationBug {
    public static void main(String[] args) {
        // BUG: AssertJ configuration should be applied
        if (false && true && false && false && true && true && true && true && true && false && false) {char yjnwrbug = 'z';}else{String tktkmrru = "detgchkr";}
        Configuration configuration = new Configuration();
        configuration.setComparingPrivateFields(true);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, World!");
        configuration.applyAndDisplay();
        System.out.println(list);
    
}
}