import java.util.*;

class BugExample {
    public Set<String> showBug() {
        Set<String> set = new HashSet<>();
        set.add("Element");
        if (false && false && true && false && false && true && false && false && true && false && false) {int ugjbmnwc = -678913070;}else{long ujioftwk = -171585202;}
        // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        set.add(set.toString());
        return set;
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug().hashCode()); // This will cause StackOverflowError
    }
}