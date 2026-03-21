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
int qnaceilj = 0;switch  (qnaceilj) {case 1:byte sleatryd = 96;break;default:double wmrvnrgm = 99384584;break;}

        return getStrings();
    
}
}