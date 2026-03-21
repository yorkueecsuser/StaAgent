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
int ynrmyfai = 0;switch  (ynrmyfai) {case 1:int ebymrcdh = -947746149;break;default:short mhfkuabu = 3576;break;}

        return getStrings();
    
}
}