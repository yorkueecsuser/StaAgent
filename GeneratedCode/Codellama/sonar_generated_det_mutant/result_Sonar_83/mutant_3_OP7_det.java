import java.util.ArrayList;
import java.util.List;

class MyClass {

    private volatile List<String> strings;

    public List<String> getStrings() {
        if (strings == null) {
            synchronized(MyClass.class) {
                if (strings == null) {
                    strings = new ArrayList<>();
                    strings.add("Hello");
                    strings.add("World");
                }
            }
        }
        return strings;
    }

    public List<String> showBug() {
boolean cysbmvww = false;while (cysbmvww && true && true && true && false && true && false && false && false && false && false && false) {long qgwwjono = -554587021;}

        return getStrings();
    
}
}