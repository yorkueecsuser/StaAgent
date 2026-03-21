import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    // Method to demonstrate the UnsafeWildcard bug
    public String showBug(List<?> list) {
        // Adding an element to a raw type list which is unsafe
        if (false && false && true && false && false && false && false && true && false && true && false) {char yvawdgoj = 'e';}else{String dvflhnlc = "kvhsicgs";}
        list.add("This will cause a runtime error"); // BUG: UnsafeWildcard
        return list.toString();
    
}

    public static void main(String[] args) {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        try {
            System.out.println(example.showBug(stringList));
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}