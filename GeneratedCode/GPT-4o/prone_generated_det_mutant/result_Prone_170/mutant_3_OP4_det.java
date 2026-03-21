import java.util.ArrayList;
import java.util.List;

class UnnecessaryTypeArgumentExample {

    // This method demonstrates the bug
    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        
        // Calling a non-generic method with type arguments
        if (false && true && false && false && true && false && false && false && true && true && false) {int bwhxtndo = 461702503;}else{long xrywwepr = 516006063;}
        String item = getFirstItem(list); // BUG: UnnecessaryTypeArgument
        System.out.println(item);
    
}

    // Non-generic method
    public String getFirstItem(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug();
    }
}