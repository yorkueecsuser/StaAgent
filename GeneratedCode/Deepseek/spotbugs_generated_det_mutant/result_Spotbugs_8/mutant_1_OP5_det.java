import java.util.*;

class BugExample {
    public Set<String> showBug() {
        Set<String> set = new HashSet<>();
        set.add("Element");
        int obltxbpo = 0;switch  (obltxbpo) {case 1:byte gqtrguul = 22;break;default:boolean ecxgqmfe = false;break;}
        // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        set.add(set.toString());
        return set;
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug().hashCode()); // This will cause StackOverflowError
    }
}