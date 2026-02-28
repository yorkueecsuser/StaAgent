import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public Map<String, String> showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // BUG: Map values should not be replaced unconditionally

        System.out.println(letters);
        return letters;
    }
}