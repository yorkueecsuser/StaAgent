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
for  (int bfmgcsmg = 0; bfmgcsmg < 0; bfmgcsmg++) {int kbuuesfb = 148534724;}

        return getStrings();
    
}
}