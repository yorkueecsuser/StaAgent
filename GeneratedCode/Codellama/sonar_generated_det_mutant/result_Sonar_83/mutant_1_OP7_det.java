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
boolean narmezeb = false;while (narmezeb && true && true && false && false && false && true && true && true && true && false && false) {float gbwleupu = 378325052;}

        return getStrings();
    
}
}