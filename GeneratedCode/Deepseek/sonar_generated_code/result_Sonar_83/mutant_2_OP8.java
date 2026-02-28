import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> sTringS;

    public List<String> getStrings() {
        if (sTringS == null) {
            synchronized(NoncompliantCode.class) {
                if (sTringS == null) {
                    sTringS = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                    sTringS.add("Hello");
                    sTringS.add("World");
                }
            }
        }
        return sTringS;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}