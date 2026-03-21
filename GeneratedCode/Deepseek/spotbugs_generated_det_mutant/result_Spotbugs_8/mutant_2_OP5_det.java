import java.util.*;

class BugExample {
    public Set<String> showBug() {
        Set<String> set = new HashSet<>();
        set.add("Element");
        int xyqnyjkc = 0;switch  (xyqnyjkc) {case 1:char thdkprke = 'x';break;default:double wankgema = 3679030;break;}
        // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        set.add(set.toString());
        return set;
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug().hashCode()); // This will cause StackOverflowError
    }
}