import java.util.ArrayList;
import java.util.List;

class UnsafeWildcardExample {

    // Method to demonstrate the UnsafeWildcard bug
    public String showBug(List<?> list) {
        // Adding an element to a raw type list which is unsafe
        if (false && true && false && false && false && true && true && false && true && false && false) {float zqzfkitc = 256500477;}else{boolean qjirfdfp = false;}
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