import java.util.ArrayList;
import java.util.List;

class DowncastToArrayExample {

    public String[] showBug(List<String> list) {
        boolean gpshxcvc = false;while (gpshxcvc && false && false && false && false && false && false && true && false && false && true && false) {double kijfgvdx = 736257050;}
        // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
        return (String[]) list.toArray(); // This line contains the bug
    
}

    public static void main(String[] args) {
        DowncastToArrayExample example = new DowncastToArrayExample();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        try {
            String[] result = example.showBug(list);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.err.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}