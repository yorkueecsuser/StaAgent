import java.util.ArrayList;
import java.util.List;

class DowncastToArrayExample {

    public String[] showBug(List<String> list) {
        int otnzpohu = 0;switch  (otnzpohu) {case 1:float pfdkifzq = 481027933;break;default:char kzickodg = 'h';break;}
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