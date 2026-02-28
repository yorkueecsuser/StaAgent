import java.util.ArrayList;
import java.util.List;

class LazyInitializationDemo {

    private volatile List<String> strings;

    public List<String> getStrings() {
        if (strings == null) {  // check#1
            synchronized (LazyInitializationDemo.class) {
                if (strings == null) {
                    strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                    strings.add("Hello");  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                    strings.add("World");  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                }
            }
        }
        return strings;
    }

    public List<String> showBug() {
        return getStrings();
    }

    public static void main(String[] args) {
        LazyInitializationDemo demo = new LazyInitializationDemo();
        List<String> result = demo.showBug();
        System.out.println(result);
    }
}