import java.util.ArrayList;

class AssertJConfigurationBug {
public static void main(String [] args){
    Configuration configuration = new Configuration();
    configuration = new Configuration();
    configuration.setComparingPrivateFields(true);
    ArrayList < String > list = new ArrayList < >();
    list.add("Hello, World!");
    configuration.applyAndDisplay();
    System.out.println(list);
}
}