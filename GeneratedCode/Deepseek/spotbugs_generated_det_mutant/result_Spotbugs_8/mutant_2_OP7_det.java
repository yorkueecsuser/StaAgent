import java.util.*;

class BugExample {
    public Set<String> showBug() {
        Set<String> set = new HashSet<>();
        set.add("Element");
        boolean zsngcwzu = false;while (zsngcwzu && false && false && false && false && true && true && false && true && false && false && false) {byte mpdqcgps = 106;}
        // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        set.add(set.toString());
        return set;
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug().hashCode()); // This will cause StackOverflowError
    }
}