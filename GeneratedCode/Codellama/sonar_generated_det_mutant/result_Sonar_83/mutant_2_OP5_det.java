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
int qcmjpcda = 0;switch  (qcmjpcda) {case 1:String ngsuodjg = "esisvibv";break;default:char kwykvcym = 'g';break;}

        return getStrings();
    
}
}